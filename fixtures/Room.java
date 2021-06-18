package fixtures;

public class Room extends Fixture {

	// Variables
	Room[] exits;
	Item[] items;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
		this.items = new Item[3]; 
	}
	
	public String getLongDesc() {
		return this.longDescription;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public Room[] getExits() {
		Room[] exitsArr = exits;
		return exitsArr;
	}
	
	public Item[] getItems() {
		Item[] itemsArr = items;
		return itemsArr;
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
