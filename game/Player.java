package game;

import fixtures.*;

public class Player {

	Room currentRoom;

	public Player(Room room) {
		currentRoom = room;
	}
	
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	

	
}
