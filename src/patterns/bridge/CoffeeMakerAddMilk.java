package patterns.bridge;

public class CoffeeMakerAddMilk implements ICoffeeMaker{

	public CoffeeMakerAddMilk() {}
	
	public void makeCoffee() {
		System.out.println(" add milk.");
	}
}
