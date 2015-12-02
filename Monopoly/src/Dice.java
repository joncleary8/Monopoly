
public class Dice {
	private static int diceOne;
	private static int diceTwo;
	public static void rollDice()
		{
			diceOne = (int)(Math.random()*6)+1;
			diceTwo = (int)(Math.random()*6)+1;
		}
	public static int getDiceOne() {
		return diceOne;
	}
	public static void setDiceOne(int diceOne) {
		Dice.diceOne = diceOne;
	}
	public static int getDiceTwo() {
		return diceTwo;
	}
	public static void setDiceTwo(int diceTwo) {
		Dice.diceTwo = diceTwo;
	}
	
}
