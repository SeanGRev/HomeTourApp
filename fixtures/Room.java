package fixtures;

public class Room extends Fixture {

	// Variables
	Room[] exits;
	Fixture[] items;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
		this.items = new Fixture[3];
	}
	
	public String getLongDesc() {
		return this.longDescription;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public Room[] getExits() {
		Room[] exitsArr = exits;
		
		return exitsArr;
	}
	
	public Room getExit(String direction) {
		Room exit;
		
		switch(direction) {
			case "right":
				exit = exits[0];
				break;
			case "front":
				exit = exits[1];
				break;
			case "left":
				exit = exits[2];
				break;
			default:
				exit = null;
				break;
		}
		
		return exit;
	}
	
}
