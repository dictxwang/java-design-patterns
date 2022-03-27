package patterns.bridge;

public class CoffeeMakerAddSugar implements ICoffeeMaker {

	public CoffeeMakerAddSugar() {}
	
	public void makeCoffee() {
		System.out.println(" add sugar.");
	}
}
