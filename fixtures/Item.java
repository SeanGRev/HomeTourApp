package fixtures;

public class Item extends Fixture {

	String dialogue;
	
	public Item(String name, String shortDescription, String longDescription, String dialogue) {
		super(name, shortDescription, longDescription);
		this.dialogue = dialogue;
	}
	
	public String getDialogue() {
		return this.dialogue;
	}
	
}
