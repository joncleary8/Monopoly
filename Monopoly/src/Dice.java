import java.util.ArrayList;
import java.util.Scanner;
public class Dice
	{
		static ArrayList<String>ownedProperties = new ArrayList<String>();
		static Scanner Player=new Scanner(System.in);
		public static boolean gameContinues=true;
		
		public static void rollDice()
			{
				int dice1;
				int dice2;
				int roll;
				int position = 0;
				int credits=1500;
				boolean goBackwards = false;
				while(0==0) 
					{
						System.out.println();
						System.out.println("Your bank balance is " + credits + ".");
						System.out.println("Hit Enter to Roll Dice");
						System.out.println();
						if(Player.hasNextLine()) 
							{
								Player.nextLine();
								dice1 = (int)(Math.random()*6 + 1);
								dice2 = (int)(Math.random()*6 + 1);
								roll = 5;
								if((position + roll)>=40)
									{
										if(goBackwards==false) 
											{
												credits+=200;
												System.out.println("You received $200 for passing Go");
												System.out.println("Your balance is $" + credits);
											}
									}
								if(goBackwards == false) 
									{
										position = (position+roll)%40;
										System.out.println("You rolled " + roll + ". You landed on " + Board.playBoard.get(position).getName());
										System.out.println();
										if(position==10) 
											{
												goBackwards=true;
												System.out.println("Unlucky roll! You will be playing backwards now!");
												System.out.println();
											}
									} 
								else 
									{
										if((position - roll) < 0) 
											{
												position =position-roll+40;
												System.out.println("You rolled " + roll + ". You landed on " + Board.playBoard.get(position).getName());
												System.out.println();
											}
										else
											{
												position=position-roll;
												System.out.println("You rolled " + roll + ". You landed on " + Board.playBoard.get(position).getName());
												System.out.println();
											}
										if(position==10) 
											{
												goBackwards=false;
											}

								}
								System.out.println();
								if(Board.playBoard.get(position).isBuyable() == true)
									{
										if(Board.playBoard.get(position).isPurchased() == false) 
											{
												System.out.println("Buy " + Board.playBoard.get(position).getName() + " for $" + Board.playBoard.get(position).getPrice());
												System.out.println("Press 1 to buy, 2 to pass");
												if(Player.nextInt() == 1) 
													{
														if(credits >= Board.playBoard.get(position).getPrice())
															{
																Board.playBoard.get(position).setPurchased(true);
																credits -= Board.playBoard.get(position).getPrice();
																System.out.println("You bought " + Board.playBoard.get(position).getName() + ".");
																System.out.println("Your balance is " + credits+" credits.");
																System.out.println();
																ownedProperties.add(new String(Board.playBoard.get(position).getName()));
																System.out.print("Your Properties:");
																for(String property: ownedProperties) 
																	{
																		System.out.print(property + ", ");
																	}
															} 
														else 
															{
																System.out.println("You do not have enough money to buy this property.");	
															}
													} 
												else
													{
													 	System.out.println("You chose not to buy this property");
													}
											}
										else if(position == 4) 
											{
												if(credits >= 200) 
													{
														credits -= 200;
														System.out.println("Thank you for paying your fee.");
													} 
												else 
													{
														System.out.println("You do not have enough money to pay this fee. Find money immediately.");
													}
											} 
										else if(position == 38)
											{
												if(credits >= 75)
													{
														credits -= 75;
														System.out.println("Thank you for paying your fee.");
													} 
												else 
													{
														System.out.println("You do not have enough money to pay this fee. Find money immediately.");
													}
													
											}
									}
							}
						 	
							
					}
			}
	}
