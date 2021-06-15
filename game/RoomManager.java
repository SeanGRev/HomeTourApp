package game;

import fixtures.*;

public class RoomManager {

	public Room startingRoom;
	public Room[] rooms = new Room[5];
	
	public RoomManager() {
		init();
	}
	
	public Room[] voidExits(Room[] exits) {
		for(Room exit : exits) {
			exit = null;
		}
		return exits;
	}
	
	public void init() {
	    Room backyard = new Room(
			"Backyard",
			"A small backyard",
			"The small backyard. There is a garden to the right, there's some nice looking tomatoes and cucumbers." + "\n"
			+ "There is a glass sliding door leading to the kitchen to the front, it would be careless of the owners to not lock it." + "\n"
			+ "To the left is a pool, looks flithy and unused, there is no reason to go there."
			);
	    
	    Room garden = new Room(
	    		"Garden",
	    		"A small backyard garden",
	    		"A nice little garden, taken care of decently. There are some nice tomatoes and cucumbers.\n" +
	    		"To the right is a fence, nothing to do there. To the front is a shed, probably has some shovels and gardening tools.\n" + 
	    		"To the left is the backyard that we started in."
	    		);
	      
	    Room kitchen = new Room(
	    		"Kitchen",
	    		"A nice middle class kitchen",
	    		"A nice kitchen, might have some stuff worth taking, maybe some fine china.\n" + 
	    		"To the right is a laundry room, maybe they have some clothes or stuff to steal?\n" +
	    		"To the front is a foyer, nothing much there aside from some slippers.\n" +
	    		"To the left is a office room, there may be some technology for to steal there."
	    		);
	    
	    Room pool = new Room(
	    		"Pool",
	    		"A dirty, dank, disgusting pool",
	    		"Why are you even here? This place is gross! I literally said there is no reason to go here!\n" + 
	    		"There's so much algae in here that you can hardly see the bottom of the pool! Is that a dead frog?!\n" +
	    		"Look. There's a fence to your left so you can't go out that way. There's a gross dead frog up front so that's not an option.\n" + 
	    		"Please just go towards the right and get back to the backyard."
	    		);
	    
	    // Setting room values
	    this.rooms[0] = backyard;
	    this.rooms[1] = garden;
	    this.rooms[2] = kitchen;
	    this.rooms[3] = pool;
	    
	    // Setting exits
	    Room[] exits = new Room[3];
	  
	    // Backyard
	   	exits[0] = rooms[1];
	   	exits[1] = rooms[2];
	    exits[2] = rooms[3];
	    
	    backyard.setExits(exits);
	    exits = voidExits(exits);
	    
	    this.startingRoom = backyard;
	}
}
