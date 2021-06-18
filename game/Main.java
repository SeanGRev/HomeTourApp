package game;

import fixtures.*;
import java.util.Scanner;

public class Main {
	
	// Initialize RoomManager and set starting room
	static RoomManager rm = new RoomManager();
	static Player player = new Player(rm.startingRoom);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String control = "";
		printInitialMessage();
		while(true){
			printRoom(player);
			parse(collectInput(),player);
			System.out.println("Continue?: ");
			control = scan.nextLine();
			if(control.equals("q")) {
				System.out.println("Closed");
				break;
			}
			else if(control.equals("")) {
				continue;
			}
		}
	}
	
	private static void printInitialMessage() {
		System.out.println("Alright let's do this. Should be a simple survey of the house.\n" +
				"Get in see if there is anything of value and get out. Simple.\n" +
				"I'll drop you off here and wait around the corner. Be careful.\n" + 
				"Don't get caught.\n");
	}
	
	private static void printRoom(Player player) {
		
		System.out.println("| Current Location: " + player.currentRoom.getName() + " |");
		System.out.println(player.currentRoom.getLongDescription() + "\n");
		
		System.out.println("Items: ");
		// Items Array
		Item[] items = player.currentRoom.getItems();
		int i = 1;
		for(Item item : items) {
			System.out.println(i + ". " + item.getShortDescription());
			i++;
		}
		System.out.print("\n");
		System.out.println("Exits: ");
		// Exits Array
		Room[] exits = player.currentRoom.getExits();
		i = 1;
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
		Room destination;
		Item object;
		// Movement
		if(action.equals("move")) {
			// Move right
			if(target.equals("1")) {
				destination = player.currentRoom.getExits()[0];
				
				if(destination.getLongDescription() != "Invalid") {
					player.setCurrentRoom(destination);
				}
				else {
					System.out.println("You cannot walk into wall. That would look stupid.\n");
				}
				
			}
			else if(target.equals("2")) {
				destination = player.currentRoom.getExits()[1];
				
				if(destination.getLongDescription() != "Invalid") {
					player.setCurrentRoom(destination);
				}
				else {
					System.out.println("That is a wall. You cannot walk through a wall.\n");
				}
			}
			else if(target.equals("3")) {
				destination = player.currentRoom.getExits()[2];
				
				if(destination.getLongDescription() != "Invalid") {
					player.setCurrentRoom(destination);
				}
				else {
					System.out.println("We are walking through house not playing bumper cars.\n");
				}
			}
			else if(target.equals("4")) {
				destination = player.currentRoom.getExits()[3];
				
				if(destination.getLongDescription() != "Invalid") {
					player.setCurrentRoom(destination);
				}
				else {
					System.out.println("You backed up into a wall. Maybe look where you are going next time.\n");
				}
			}
			else {
				System.out.println("There are not that many rooms connected to this room.\n");
			}
		}
		// Interact with items
		else if(action.equals("interact")) {
			if(target.equals("1")) {
				object = player.currentRoom.getItems()[0];
				System.out.println(object.getDialogue() + "\n");
				object.setNothing();
			}
			else if(target.equals("2")) {
				object = player.currentRoom.getItems()[1];
				System.out.println(object.getDialogue() + "\n");
				object.setNothing();
			}
			else if(target.equals("3")) {
				object = player.currentRoom.getItems()[2];
				System.out.println(object.getDialogue() + "\n");
				object.setNothing();
			}
			else {
				System.out.println("There are not that many items in the room.");
			}
		}
	}
	
}
