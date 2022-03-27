package patterns.prototype;

public class PrototypeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractSpoon soupspoon = new SoupSpoon();
		AbstractSpoon saladspoon = new SaladSpoon();
		
		AbstractSpoon saladspoonB = (SaladSpoon)saladspoon.clone();
		
		soupspoon.getSpoonInfo();
		saladspoon.getSpoonInfo();
		saladspoonB.getSpoonInfo();
	}

}
