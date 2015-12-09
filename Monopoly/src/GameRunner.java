import java.util.Scanner;

public class GameRunner 
	{
	public static void main(String[] args)
		{
			Introduction.intro();
			if (Introduction.getChoice()==1)
			{
				Board.buildStarWarsBoard();
			}
			else
			{
				Board.buildBoard();
			}
			Dice.rollDice();
		}
	}
