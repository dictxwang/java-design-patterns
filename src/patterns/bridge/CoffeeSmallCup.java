package patterns.bridge;

public class CoffeeSmallCup extends CoffeeBase {

	public CoffeeSmallCup(ICoffeeMaker maker) {
		super(maker);
	}
	
	public void getCoffee() {
		System.out.print("Small cup coffee,");
		this.getMaker().makeCoffee();
	}
}
