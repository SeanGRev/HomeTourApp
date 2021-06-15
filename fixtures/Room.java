package fixtures;

public class Room extends Fixture {

	// Variables
	Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[10]; // size is your choice
	}
	
	public String getLongDesc() {
		return this.longDescription;
	}
	
	public Room[] getExits() {
		Room[] exitsArr = exits;
		
		return exitsArr;
	}
	
	public Room getExit(int exitSelection) {
		Room exit = exits[exitSelection];
		return exit;
	}
	
}
