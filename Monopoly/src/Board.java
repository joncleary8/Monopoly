import java.util.ArrayList;

public class Board {
	private static ArrayList board = new ArrayList();
	static ArrayList<Space> starWarsBoard = new ArrayList<Space>();
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
		starWarsBoard.add(new Go("Go",1,false));
		starWarsBoard.add(new ColoredProperty("Dagobah: Swamp",2,60,false,true));
		starWarsBoard.add(new ComChestandChance("Community Chest",3,false));
		starWarsBoard.add(new ColoredProperty("Dagobah: Yoda's Hut",4,60,false,true));
		starWarsBoard.add(new Fees("Docking Tax",5,false));
		starWarsBoard.add(new Railroad("Starships: Tie Fighter",6,200,false,true));
		starWarsBoard.add(new ColoredProperty("Hoth: Frozen Plain",7,100,false,true));
		starWarsBoard.add(new ComChestandChance("Chance",8,false));
		starWarsBoard.add(new ColoredProperty("Hoth: North Bridge",9,100,false,true));
		starWarsBoard.add(new ColoredProperty("Hoth: Echo Base",10,120,false,true));
		starWarsBoard.add(new Jail("Jail",11,false));
		starWarsBoard.add(new ColoredProperty("Tatooine: Lar's Homestead",12,140,false,true));
		starWarsBoard.add(new Utility("Utility: Reactor Core",13,140,false,true));
		starWarsBoard.add(new ColoredProperty("Tatooine: Mos Eisley",14,140,false,true));
		starWarsBoard.add(new ColoredProperty("Tatooine: Jabba's Palace",15,160,false,true));
		starWarsBoard.add(new Railroad("Starships: Millennium Falcon",16,200,false,true));
		starWarsBoard.add(new ColoredProperty("Yavin 4: War Room",17,180,false,true));
		starWarsBoard.add(new ComChestandChance("Community Chest",18,false));
		starWarsBoard.add(new ColoredProperty("Yavin 4: Massassi Temple",19,180,false,true));
		starWarsBoard.add(new ColoredProperty("Yavin 4: Temple Throne Room",20,200,false,true));
		starWarsBoard.add(new FreeParking("Free Parking",21,false));
		starWarsBoard.add(new ColoredProperty("Cloud City: Landing Platform",22,220,false,true));
		starWarsBoard.add(new ComChestandChance("Chance",23,false));
		starWarsBoard.add(new ColoredProperty("Cloud City: Carbon Freezing Chamber",24,220,false,true));
		starWarsBoard.add(new ColoredProperty("Cloud City: Reactor Control Room",25,240,false,true));
		starWarsBoard.add(new Railroad("Starships: X-Wing",26,200,false,true));
		starWarsBoard.add(new ColoredProperty("Death Star: Landing Bay",27,260,false,true));
		starWarsBoard.add(new ColoredProperty("Death Star: Throne Room",28,260,false,true));
		starWarsBoard.add(new Utility("Utility: Moisture Farm",29,150,false,true));
		starWarsBoard.add(new ColoredProperty("Death Star: Central Core",30,280,false,true));
		starWarsBoard.add(new Jail("Go to Jail",31,false));
		starWarsBoard.add(new ColoredProperty("Endor: Forest",32,300,false,true));
		starWarsBoard.add(new ColoredProperty("Endor: Shield Generator",33,300,false,true));
		starWarsBoard.add(new ComChestandChance("Community Chest",34,false));
		starWarsBoard.add(new ColoredProperty("Endor: Ewok Village",35,320,false,true));
		starWarsBoard.add(new Railroad("Starships: Star Destroyer",36,200,false,true));
		starWarsBoard.add(new ComChestandChance("Chance",37,false));
		starWarsBoard.add(new ColoredProperty("Coruscant: Monument Square",38,350,false,true));
		starWarsBoard.add(new Fees("Bounty",39,false));
		starWarsBoard.add(new ColoredProperty("Coruscant: Imperial Palace",40,400,false,true));	
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
