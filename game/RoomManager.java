package game;

import fixtures.*;

public class RoomManager {

	public Room startingRoom;
	public Room[] rooms = new Room[11];
	
	public RoomManager() {
		init();
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
	    		"EWWWWW!!! Why are you even here? This place is gross! I literally said there is no reason to go here!\n" + 
	    		"There's so much algae in here that you can hardly see the bottom of the pool! Is that a dead frog?!\n" +
	    		"Look. There's a fence to your left so you can't go out that way. There's a gross dead frog up front so that's not an option.\n" + 
	    		"Please just go towards the right and get back to the backyard."
	    		);
	    
	    Room shed = new Room(
	    		"Shed",
	    		"A small shed, lots of tools",
	    		"There's a lawnmower here, some hammers, gardening tools. Overall pretty lackluster.\n" + 
	    		"There is no path to the right. But there is a door to the laundry room up front.\n" + 
	    		"Going to the left leads back to the backyard."
	    		);
	    
	    Room laundry = new Room(
	    		"Laundry",
	    		"A laundury room",
	    		"It doesn't seem like there is much of value in here.\n" + 
	    		"It looks like they forgot to move their clothes from the dryer before heading off to bed.\n" +
	    		"Why are you moving it for them? So what if their clothes get stinky? You're supposed to rob them!\n" +
	    		"There is no exit to the right. There is a closet to the front. There is the kitchen to your left."
	    		);
	    
	    Room closet = new Room(
	    		"Closet",
	    		"A large closet",
	    		"This is weird normally a closet this large would be in the master bedroom.\n" +
	    		"It's so dusty in here. Do they never use this place or something?\n" +
	    		"There is a foyer to the left."
	    		);
	    
	    Room foyer = new Room(
	    		"Foyer",
	    		"A foyer for the house",
	    		"They have some fancy paintings hanging around here. You should probably bring them back.\n" +
	    		"There is a bedroom to the left. The closet is to the right."
	    		);
	    
	    Room bedroom = new Room(
	    		"Bedroom",
	    		"The master bedroom",
	    		"Shhhh be very quiet, we don't want to wake the owners up.\n" +
	    		"Check the drawers for any jewelery and get out of there.\n" + 
	    		"The only way out is to go right and return to the foyer."
	    		);
	    
	    Room office = new Room(
	    		"Office",
	    		"The home office",
	    		"There's some tech around here that you can steal. Is that a rotary dial telephone?\n" +
	    		"People still use that? Why would they have that? Why are you taking it? Whatever...\n" + 
	    		"You can head to the right to return back to the kitchen."
	    		);
	    
	    Room invalid = new Room(
	    		"Not a valid location",
	    		"A wall or locked door",
	    		"Invalid"
	    		);
	    
	    
	    // Setting room values
	    this.rooms[0] = backyard;
	    this.rooms[1] = garden;
	    this.rooms[2] = kitchen;
	    this.rooms[3] = pool;
	    this.rooms[4] = shed;
	    this.rooms[5] = laundry;
	    this.rooms[6] = closet;
	    this.rooms[7] = foyer;
	    this.rooms[8] = bedroom;
	    this.rooms[9] = office;
	    this.rooms[10] = invalid;
	  
	    // Backyard
	    Room[] exits0 = new Room[4];
	   	exits0[0] = rooms[1];
	   	exits0[1] = rooms[2];
	    exits0[2] = rooms[3];
	    exits0[3] = rooms[10];
	    
	    backyard.setExits(exits0);
	    
	    // Garden
	    Room[] exits1 = new Room[4];
	   	exits1[0] = rooms[10];
	   	exits1[1] = rooms[4];
	    exits1[2] = rooms[0];
	    exits1[3] = rooms[10];
	    
	    garden.setExits(exits1);
	    
	    // Kitchen
	    Room[] exits2 = new Room[4];
	   	exits2[0] = rooms[5];
	   	exits2[1] = rooms[7];
	    exits2[2] = rooms[9];
	    exits2[3] = rooms[0];
	    
	    kitchen.setExits(exits2);
	    
	    // Pool
	    Room[] exits3 = new Room[4];
	    exits3[0] = rooms[0];
	    exits3[1] = rooms[10];
	    exits3[2] = rooms[10];
	    exits3[3] = rooms[10];
	    
	    pool.setExits(exits3);
	    
	    // Shed
	    Room[] exits4 = new Room[4];
	    exits4[0] = rooms[10];
	    exits4[1] = rooms[5];
	    exits4[2] = rooms[0];
	    exits4[3] = rooms[1];
	    
	    shed.setExits(exits4);
	    
	    // Laundry
	    Room[] exits5 = new Room[4];
	    exits5[0] = rooms[10];
	    exits5[1] = rooms[6];
	    exits5[2] = rooms[2];
	    exits5[3] = rooms[4];
	    
	    laundry.setExits(exits5);
	    
	    // Closet
	    Room[] exits6 = new Room[4];
	    exits6[0] = rooms[10];
	    exits6[1] = rooms[10];
	    exits6[2] = rooms[7];
	    exits6[3] = rooms[5];
	    
	    closet.setExits(exits6);
	    
	    // Foyer
	    Room[] exits7 = new Room[4];
	    exits7[0] = rooms[6];
	    exits7[1] = rooms[10];
	    exits7[2] = rooms[8];
	    exits7[3] = rooms[2];
	    
	    foyer.setExits(exits7);
	    
	    // Bedroom
	    Room[] exits8 = new Room[4];
	    exits8[0] = rooms[7];
	    exits8[1] = rooms[10];
	    exits8[2] = rooms[10];
	    exits8[3] = rooms[10];
	    
	    bedroom.setExits(exits8);
	    	    
	    // Office
	    Room[] exits9 = new Room[4];
	    exits9[0] = rooms[2];
	    exits9[1] = rooms[10];
	    exits9[2] = rooms[10];
	    exits9[3] = rooms[10];
	    
	    office.setExits(exits9);
	    
	    this.startingRoom = backyard;
	}
}
