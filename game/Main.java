package game;

import fixtures.*;
import java.util.Scanner;

public class Main {
	
	// Initialize RoomManager and set starting room
	static RoomManager rm = new RoomManager();
	static Player player = new Player(rm.startingRoom);
	
	public static void main(String[] args) {
		printInitialMessage();
		while(true){
			printRoom(player);
			parse(collectInput(),player);
		}
	}
	
	private static void printInitialMessage() {
		System.out.println("Alright let's do this. Should be a simple burglary.\n" +
				"Get in grab anything that has some value and get out. Simple.\n" +
				"I'll drop you off here and wait around the corner. Be careful.\n" + 
				"Don't get caught.\n");
	}
	
	private static void printRoom(Player player) {
		
		System.out.println("| Current Location: " + player.currentRoom.getName() + " |");
		System.out.println(player.currentRoom.getLongDescription() + "\n");
		
		System.out.println("Exits: ");
		// Exits Array
		Room[] exits = player.currentRoom.getExits();
		int i = 1;
		for(Room exit : exits) {
			System.out.println(i + ". " + exit.getShortDescription());
			i++;
		}
		System.out.print("\n");
	}
	
	private static void movePlayer(Player player, Room room) {
		player.setCurrentRoom(room);
	}

	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Select: ");
		String input = scan.nextLine();
		String[] result = input.split(" ");
		return result;
	}
		
	private static void parse(String[] command, Player player) {
		String action = command[0];
		String target = command[1];
		
		// Movement
		if(action.equals("move")) {
			if(target.equals("right")) {
				player.setCurrentRoom(player.currentRoom.getExits()[0]);
			}
		}
	}
	
}
