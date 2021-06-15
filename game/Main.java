package game;

import fixtures.*;

public class Main {
	
	static RoomManager rm = new RoomManager();
	static Player player = new Player(rm.startingRoom);
	
	public static void main(String[] args) {
		printInitialMessage();
		printRoom(player);
	}
	
	private static void printInitialMessage() {
		System.out.println("Alright let's do this. Should be a simple burglary.\n" +
				"Get in grab anything that has some value and get out. Simple.\n" +
				"I'll drop you off here and wait around the corner. Be careful.\n" + 
				"Don't get caught.");
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.getName());
	}

	private static String[] collectInput() {

	}
		
	private static void parse(String[] command, Player player) {

	}
	
}
