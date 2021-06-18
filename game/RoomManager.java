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
			"The small backyard. There is a garden to the right. There are toys just left out in the open.\n"
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
	    
	    // Items
	    Item kidBike = new Item(
	    		"A bike",
	    		"Bike for a child",
	    		"Small plastic tricycle. Probably has very little value." + 
	    		"Wait... I just googled it... these things sell for like over $40!",
	    		"You tried to ride it? Why would you do that? You are way too big and old to ride that thing."
	    		);
	    Item baseball = new Item(
	    		"A baseball",
	    		"Dirty baseball",
	    		"This is really nothing special. Not worth taking. Not worth noting but you're doing it anyway.",
	    		"Not sure why you would pick up the baseball but if you really want to steal it go ahead..."
	    		);
	    Item hulaHoop = new Item(
	    		"Hula Hoop",
	    		"A normal hula hoop",
	    		"Just the average hula hoop. Honestly this place is a mess if this is just lying around outside.",
	    		"We are trying to sneak around the house. You cannot just start hula hooping because you feel like it."
	    		);
	    Item tomato = new Item(
	    		"Tomato",
	    		"A tomato in the garden",
	    		"Still on the vine. Looks nice. You could eat it but who on earth just eats a raw tomato?",
	    		"And you just ate it... raw... of course you would..."
	    		);
	    Item cucumber = new Item(
	    		"Cucumber",
	    		"A cucumber in the garden",
	    		"Decently sized. I mean you could eat it too but this really isn't the time or place...",
	    		"And you are just eating it... really like right now? Is it really worth it?"
	    		);
	    Item smallShovel = new Item(
	    		"Small Shovel",
	    		"A small shovel for gardening",
	    		"A small shovel, perfect for gardening. Easily bought at a local gardening store.",
	    		"What's the point in taking the shovel? It's way to small to use for anything else."
	    		);
	    Item deadFrog = new Item(
	    		"Dead Frog",
	    		"A deceased amphibian",
	    		"Ewwww... it's a dead frog. Oh it's so gross... it smells so bad...",
	    		"Oh geez! Why would you touch it! Gross! Gross! Gross! Drop it please!"
	    		);
	    Item dankPoolWater = new Item(
	    		"Dirty Pool Water",
	    		"Green flithy pool water",
	    		"The filthy dirt water at the bottom of a partially drained pool",
	    		"Did you just drink that water!? What is wrong with you!? That's so gross! If you die that's on you!"
	    		);
	    Item nothing = new Item(
	    		"Nothin here",
	    		"Nothing here",
	    		"There is nothing here",
	    		"Umm... I hate to tell you this but that is just air..."
	    		);
	    Item kitchenKnife = new Item(
	    		"Kitchen Knife",
	    		"A knife",
	    		"A knife. Good for cutting fruits and other such assorted goods.\n" +
	    		"Seems low quality, not one of those fancy high class Japanese knives.",
	    		"Well... I guess you could take it... you probably have the same thing at home but it's your choice"
	    		);
	    Item flourBag = new Item(
	    		"Bag of Flour",
	    		"A bag of flour",
	    		"Who keeps a bag of flour sitting in the kitchen? That should be in a cupboard or something!",
	    		"I don't see why you would need to touch this bag of flour but sure... just don't make a mess."
	    		);
	    Item vitamixBlender = new Item(
	    		"Vitamix Blender",
	    		"A nice vitamix blender",
	    		"Nice blender. Actually could be worth something. My aunt always wanted one of those blenders",
	    		"It is strange but yeah sure take it."
	    		);
	    Item pickaxe = new Item(
	    		"Pickaxe",
	    		"A pickaxe",
	    		"A normal pickaxe. No idea what else can describe it.",
	    		"Why do these people own a pickaxe? I guess you could grab it if you really want to."
	    		);
	    Item shirt = new Item(
	    		"Shirt",
	    		"A shirt",
	    		"Plain beige t-shirt. Rather bland if you ask me. Like really? Beige?",
	    		"Out of all the things you want to take... this is the most boring thing by far."
	    		);   
	    Item wetClothes = new Item(
	    		"Clothing",
	    		"Clothing left in the washing machine",
	    		"Looks like they forgot to move their clothing to the dryer before going to bed.",
	    		"You moved their clothing to the dryer? That's rather kind of you but... unnesscessary."
	    		);
	    Item tidePods = new Item(
	    		"Tide Pods",
	    		"A container of Tide Pods",
	    		"I remember when these things were popular on the news",
	    		"Don't eat it... just don't... stop..."
	    		);
	    Item dustyJacket = new Item(
	    		"Jacket",
	    		"A dusty jacket",
	    		"Has anyone put this thing on in the past decade? It's absolutely covered in dust!",
	    		"Just brush it off before you take it with you."
	    		);
	    Item pillow = new Item(
	    		"Pillow",
	    		"A nice soft pillow",
	    		"That pillow looks really comfortable. I personally don't like memory foam pillow but that one looks special.",
	    		"Good choice. Normally I wouldn't advise taking things like this but I'll make an exception for this pillow."
	    		);
	    Item papers = new Item(
	    		"Blank paper",
	    		"Printer paper",
	    		"Printer paper. Would be nice if you could grab some of that. I'm way too lazy to get some at Staples.",
	    		"Nice! Now I can save a trip to Staples. Could always use more office supplies!"
	    		);
	    Item printerInk = new Item(
	    		"Printer Ink",
	    		"Ink for a printer",
	    		"The printer back home ran out of ink. I would grab some.",
	    		"Great! Keep grabbing some of these office supplies. Anything to save a trip to Staples."
	    		);
	    Item coffeeMug = new Item(
	    		"Coffee Mug",
	    		"A #1 dad coffee mug",
	    		"You do not touch another man's #1 dad mug. You leave that thing alone!",
	    		"You may look at it but you are not taking that mug!"
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
	    
	    Item[] items0 = new Item[3];
	    items0[0] = hulaHoop;
	    items0[1] = baseball;
	    items0[2] = kidBike;
	    
	    backyard.setExits(exits0);
	    backyard.setItems(items0);
	    
	    // Garden
	    Room[] exits1 = new Room[4];
	   	exits1[0] = rooms[10];
	   	exits1[1] = rooms[4];
	    exits1[2] = rooms[0];
	    exits1[3] = rooms[10];
	    
	    Item[] items1 = new Item[3];
	    items1[0] = tomato;
	    items1[1] = cucumber;
	    items1[2] = smallShovel;
	    
	    garden.setExits(exits1);
	    garden.setItems(items1);
	    
	    // Kitchen
	    Room[] exits2 = new Room[4];
	   	exits2[0] = rooms[5];
	   	exits2[1] = rooms[7];
	    exits2[2] = rooms[9];
	    exits2[3] = rooms[0];
	    
	    Item[] items2 = new Item[3];
	    items2[0] = kitchenKnife;
	    items2[1] = flourBag;
	    items2[2] = vitamixBlender;
	    
	    kitchen.setExits(exits2);
	    kitchen.setItems(items2);
	    
	    // Pool
	    Room[] exits3 = new Room[4];
	    exits3[0] = rooms[0];
	    exits3[1] = rooms[10];
	    exits3[2] = rooms[10];
	    exits3[3] = rooms[10];
	    
	    Item[] items3 = new Item[3];
	    items3[0] = deadFrog;
	    items3[1] = dankPoolWater;
	    items3[2] = nothing;
	    
	    pool.setExits(exits3);
	    pool.setItems(items3);
	    
	    // Shed
	    Room[] exits4 = new Room[4];
	    exits4[0] = rooms[10];
	    exits4[1] = rooms[5];
	    exits4[2] = rooms[0];
	    exits4[3] = rooms[1];
	    
	    Item[] items4 = new Item[3];
	    items4[0] = smallShovel;
	    items4[1] = pickaxe;
	    items4[2] = nothing;
	    
	    shed.setExits(exits4);
	    shed.setItems(items4);
	    
	    // Laundry
	    Room[] exits5 = new Room[4];
	    exits5[0] = rooms[10];
	    exits5[1] = rooms[6];
	    exits5[2] = rooms[2];
	    exits5[3] = rooms[4];
	    
	    Item[] items5 = new Item[3];
	    items5[0] = shirt;
	    items5[1] = wetClothes;
	    items5[2] = tidePods;
	    
	    laundry.setExits(exits5);
	    laundry.setItems(items5);
	    
	    // Closet
	    Room[] exits6 = new Room[4];
	    exits6[0] = rooms[10];
	    exits6[1] = rooms[10];
	    exits6[2] = rooms[7];
	    exits6[3] = rooms[5];
	    
	    Item[] items6 = new Item[3];
	    items6[0] = shirt;
	    items6[1] = dustyJacket;
	    items6[2] = dustyJacket;
	    
	    closet.setExits(exits6);
	    closet.setItems(items6);
	    
	    // Foyer
	    Room[] exits7 = new Room[4];
	    exits7[0] = rooms[6];
	    exits7[1] = rooms[10];
	    exits7[2] = rooms[8];
	    exits7[3] = rooms[2];
	    
	    Item[] items7 = new Item[3];
	    items7[0] = nothing;
	    items7[1] = nothing;
	    items7[2] = nothing;
	       
	    foyer.setExits(exits7);
	    foyer.setItems(items7);
	    
	    // Bedroom
	    Room[] exits8 = new Room[4];
	    exits8[0] = rooms[7];
	    exits8[1] = rooms[10];
	    exits8[2] = rooms[10];
	    exits8[3] = rooms[10];
	    
	    Item[] items8 = new Item[3];
	    items8[0] = shirt;
	    items8[1] = pillow;
	    items8[2] = nothing;
	    
	    bedroom.setExits(exits8);
	    bedroom.setItems(items8);	    
	    
	    // Office
	    Room[] exits9 = new Room[4];
	    exits9[0] = rooms[2];
	    exits9[1] = rooms[10];
	    exits9[2] = rooms[10];
	    exits9[3] = rooms[10];
	    
	    Item[] items9 = new Item[3];
	    items9[0] = papers;
	    items9[1] = printerInk;
	    items9[2] = coffeeMug;
	    
	    office.setExits(exits9);
	    office.setItems(items9);
	    
	    this.startingRoom = backyard;
	}
}
