import java.util.Scanner;

public class GameRunner 
	{
	public static void main(String[] args)
		{
			while (0==0)
				{
					int position = 0;
					System.out.println("Press enter to roll the dice.");
					Scanner playAgain = new Scanner(System.in);
					String temp = playAgain.nextLine();
					Dice.rollDice();
					System.out.println("You rolled a " + (Dice.getDiceOne() + Dice.getDiceTwo()));
					position+= (Dice.getDiceOne() + Dice.getDiceTwo());
					Board.buildStarWarsBoard();
					System.out.println("You are on " Board.starWarsBoard.get(position));
					
				}
		}
	}
