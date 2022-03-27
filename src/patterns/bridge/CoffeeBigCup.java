package patterns.bridge;

public class CoffeeBigCup extends CoffeeBase {

	public CoffeeBigCup(ICoffeeMaker maker) {
		super(maker);
	}
	
	public void getCoffee() {
		System.out.print("Big cup coffee,");
		this.getMaker().makeCoffee();
	}
}