import java.util.ArrayList;

public class Board {
	static ArrayList<Space> playBoard = new ArrayList<Space>();
	public static void buildBoard()
	{
		playBoard.add(new Go("Go",1,false));
		playBoard.add(new ColoredProperty("Mediterranean Avenue",2,60,false,true));
		playBoard.add(new ComChestandChance("Community Chest",3,false));
		playBoard.add(new ColoredProperty("Baltic Avenue",4,60,false,true));
		playBoard.add(new Fees("Income Tax",5,false));
		playBoard.add(new Railroad("Reading Railroad",6,200,false,true));
		playBoard.add(new ColoredProperty("Oriental Avenue",7,100,false,true));
		playBoard.add(new ComChestandChance("Chance",8,false));
		playBoard.add(new ColoredProperty("Vermont Avenue",9,100,false,true));
		playBoard.add(new ColoredProperty("Connecticut Avenue",10,120,false,true));
		playBoard.add(new Jail("Jail",11,false));
		playBoard.add(new ColoredProperty("St. Charles Avenue",12,140,false,true));
		playBoard.add(new Utility("Electric Company",13,140,false,true));
		playBoard.add(new ColoredProperty("States Avenue",14,140,false,true));
		playBoard.add(new ColoredProperty("Virginia Avenue",15,160,false,true));
		playBoard.add(new Railroad("Pennsylvania Railroad",16,200,false,true));
		playBoard.add(new ColoredProperty("St. James Place",17,180,false,true));
		playBoard.add(new ComChestandChance("Community Chest",18,false));
		playBoard.add(new ColoredProperty("Tennesse Avenue",19,180,false,true));
		playBoard.add(new ColoredProperty("New York Avenue",20,200,false,true));
		playBoard.add(new FreeParking("Free Parking",21,false));
		playBoard.add(new ColoredProperty("Kentucky Avenue",22,220,false,true));
		playBoard.add(new ComChestandChance("Chance",23,false));
		playBoard.add(new ColoredProperty("Indiana Avenue",24,220,false,true));
		playBoard.add(new ColoredProperty("Illinois Avenue",25,240,false,true));
		playBoard.add(new Railroad("B. & O. Railroad",26,200,false,true));
		playBoard.add(new ColoredProperty("Atlantic Avenue",27,260,false,true));
		playBoard.add(new ColoredProperty("Ventnor Avenue",28,260,false,true));
		playBoard.add(new Utility("Water Works",29,150,false,true));
		playBoard.add(new ColoredProperty("Marvin Gardens",30,280,false,true));
		playBoard.add(new Jail("Go to Jail",31,false));
		playBoard.add(new ColoredProperty("Pacific Avenue",32,300,false,true));
		playBoard.add(new ColoredProperty("North Carolina Avenue",33,300,false,true));
		playBoard.add(new ComChestandChance("Community Chest",34,false));
		playBoard.add(new ColoredProperty("Pennsylvania Avenue",35,320,false,true));
		playBoard.add(new Railroad("Short Line Railroad",36,200,false,true));
		playBoard.add(new ComChestandChance("Chance",37,false));
		playBoard.add(new ColoredProperty("Park Place",38,350,false,true));
		playBoard.add(new Fees("Luxury Tax",39,false));
		playBoard.add(new ColoredProperty("Boardwalk",40,400,false,true));	
	}
	
	public static void buildStarWarsBoard()
	{
		playBoard.add(new Go("Go",1,false));
		playBoard.add(new ColoredProperty("Dagobah: Swamp",2,60,false,true));
		playBoard.add(new ComChestandChance("Community Chest",3,false));
		playBoard.add(new ColoredProperty("Dagobah: Yoda's Hut",4,60,false,true));
		playBoard.add(new Fees("Docking Tax",5,false));
		playBoard.add(new Railroad("Starships: Tie Fighter",6,200,false,true));
		playBoard.add(new ColoredProperty("Hoth: Frozen Plain",7,100,false,true));
		playBoard.add(new ComChestandChance("Chance",8,false));
		playBoard.add(new ColoredProperty("Hoth: North Bridge",9,100,false,true));
		playBoard.add(new ColoredProperty("Hoth: Echo Base",10,120,false,true));
		playBoard.add(new Jail("Jail",11,false));
		playBoard.add(new ColoredProperty("Tatooine: Lar's Homestead",12,140,false,true));
		playBoard.add(new Utility("Utility: Reactor Core",13,140,false,true));
		playBoard.add(new ColoredProperty("Tatooine: Mos Eisley",14,140,false,true));
		playBoard.add(new ColoredProperty("Tatooine: Jabba's Palace",15,160,false,true));
		playBoard.add(new Railroad("Starships: Millennium Falcon",16,200,false,true));
		playBoard.add(new ColoredProperty("Yavin 4: War Room",17,180,false,true));
		playBoard.add(new ComChestandChance("Community Chest",18,false));
		playBoard.add(new ColoredProperty("Yavin 4: Massassi Temple",19,180,false,true));
		playBoard.add(new ColoredProperty("Yavin 4: Temple Throne Room",20,200,false,true));
		playBoard.add(new FreeParking("Free Parking",21,false));
		playBoard.add(new ColoredProperty("Cloud City: Landing Platform",22,220,false,true));
		playBoard.add(new ComChestandChance("Chance",23,false));
		playBoard.add(new ColoredProperty("Cloud City: Carbon Freezing Chamber",24,220,false,true));
		playBoard.add(new ColoredProperty("Cloud City: Reactor Control Room",25,240,false,true));
		playBoard.add(new Railroad("Starships: X-Wing",26,200,false,true));
		playBoard.add(new ColoredProperty("Death Star: Landing Bay",27,260,false,true));
		playBoard.add(new ColoredProperty("Death Star: Throne Room",28,260,false,true));
		playBoard.add(new Utility("Utility: Moisture Farm",29,150,false,true));
		playBoard.add(new ColoredProperty("Death Star: Central Core",30,280,false,true));
		playBoard.add(new Jail("Go to Jail",31,false));
		playBoard.add(new ColoredProperty("Endor: Forest",32,300,false,true));
		playBoard.add(new ColoredProperty("Endor: Shield Generator",33,300,false,true));
		playBoard.add(new ComChestandChance("Community Chest",34,false));
		playBoard.add(new ColoredProperty("Endor: Ewok Village",35,320,false,true));
		playBoard.add(new Railroad("Starships: Star Destroyer",36,200,false,true));
		playBoard.add(new ComChestandChance("Chance",37,false));
		playBoard.add(new ColoredProperty("Coruscant: Monument Square",38,350,false,true));
		playBoard.add(new Fees("Bounty",39,false));
		playBoard.add(new ColoredProperty("Coruscant: Imperial Palace",40,400,false,true));	
	}

}
