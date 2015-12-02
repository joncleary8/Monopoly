import java.util.ArrayList;

public class Board {
	private static ArrayList board = new ArrayList();
	static ArrayList starWarsBoard = new ArrayList();
	public static void buildBoard()
	{
		
		board.add("Go");
		board.add("Mediterranean Avenue");
		board.add("Community Chest");
		board.add("Baltic Avenue");
		board.add("Income Tax");
		board.add("Reading Railroad");
		board.add("Oriental Avenue");
		board.add("Chance");
		board.add("Vermont Avenue");
		board.add("Connecticut Avenue");
		board.add("Jail");
		board.add("St. Charles Avenue");
		board.add("Electric Company");
		board.add("States Avenue");
		board.add("Virginia Avenue");
		board.add("Pennsylvania Railroad");
		board.add("St. James Place");
		board.add("Community Chest");
		board.add("Tennessee Avenue");
		board.add("New York Avenue");
		board.add("Free Parking");
		board.add("Kentucky Avenue");
		board.add("Chance");
		board.add("Indiana Avenue");
		board.add("Illinois Avenue");
		board.add("B. & O. Railroad");
		board.add("Atlantic Avenue");
		board.add("Ventnor Avenue");
		board.add("Water Works");
		board.add("Marvin Gardens");
		board.add("Go to Jail");
		board.add("Pacific Avenue");
		board.add("North Carolina Avenue");
		board.add("Community Chest");
		board.add("Pennsylvania Avenue");
		board.add("Short Line Railroad");
		board.add("Chance");
		board.add("Park Place");
		board.add("Luxury Tax");
		board.add("BoardWalk");
	}
	
	public static void buildStarWarsBoard()
	{
		
		starWarsBoard.add("Go");
		starWarsBoard.add("Dagobah: Swamp");
		starWarsBoard.add("Community Chest");
		starWarsBoard.add("Dagobah: Yoda's Hut");
		starWarsBoard.add("Docking Tax");
		starWarsBoard.add("Starships: Tie Fighter");
		starWarsBoard.add("Hoth: Frozen Plain");
		starWarsBoard.add("Chance");
		starWarsBoard.add("Hoth: North Bridge");
		starWarsBoard.add("Hoth: Echo Base");
		starWarsBoard.add("Jail");
		starWarsBoard.add("Tatooine: Lar's Homestead");
		starWarsBoard.add("Utility: Reactor Core");
		starWarsBoard.add("Tatooine: Mos Eisley");
		starWarsBoard.add("Tatooine: Jabba's Palace");
		starWarsBoard.add("Starships: Millennium Falcon");
		starWarsBoard.add("Yavin 4: War Room");
		starWarsBoard.add("Community Chest");
		starWarsBoard.add("Yavin 4: Massassi Temple");
		starWarsBoard.add("Yavin 4: Temple Throne Room");
		starWarsBoard.add("Free Parking");
		starWarsBoard.add("Cloud City: Landing Platform");
		starWarsBoard.add("Chance");
		starWarsBoard.add("Cloud City: Carbon Freezing Chamber");
		starWarsBoard.add("Cloud City: Reactor Control Room");
		starWarsBoard.add("Starships: X-Wing");
		starWarsBoard.add("Death Star: Landing Bay");
		starWarsBoard.add("Death Star: Throne Room");
		starWarsBoard.add("Utility: Moisture Farm");
		starWarsBoard.add("Death Star: Central Core");
		starWarsBoard.add("Go to Jail");
		starWarsBoard.add("Endor: Forest");
		starWarsBoard.add("Endor: Shield Generator");
		starWarsBoard.add("Community Chest");
		starWarsBoard.add("Endor: Ewok Village");
		starWarsBoard.add("Starships: Star Destroyer");
		starWarsBoard.add("Chance");
		starWarsBoard.add("Coruscant: Monument Square");
		starWarsBoard.add("Bounty");
		starWarsBoard.add("Coruscant: Imperial Palace");
	}

	public static ArrayList getBoard() {
		return board;
	}

	public static void setBoard(ArrayList board) {
		Board.board = board;
	}

	public static ArrayList getStarWarsBoard() {
		return starWarsBoard;
	}

	public static void setStarWarsBoard(ArrayList starWarsBoard) {
		Board.starWarsBoard = starWarsBoard;
	}
	
}
