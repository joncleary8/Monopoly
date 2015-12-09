import java.util.Scanner;
public class Introduction {
	private static int choice;
	
	public static void intro()
	{
		System.out.println("Hello, and welcome to your very own game of text based monopoly. Would you like to play a game?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		Scanner userPlay = new Scanner(System.in);
		int decision = userPlay.nextInt();
		if (decision==1)
		{
			System.out.println("Great!");
		}
		else
		{
			System.exit(0);
		}
		System.out.println("Would you like to play with the Stars Wars Board or the Classic Monopoly Board?");
		System.out.println("1) Star Wars Board");
		System.out.println("2) Classic Monopoly Board");
		Scanner userBoard = new Scanner(System.in);
		choice = userBoard.nextInt();
		if (choice==1)
		{
			System.out.println("Great! We will play with the specially themed Star Wars Board!");
		}
		else
		{
			System.out.println("Sweet! We will keep it classic for this game!");
		}
	}
	
	public static int getChoice() {
		return choice;
	}
	public static void setChoice(int choice) {
		Introduction.choice = choice;
	}
}
