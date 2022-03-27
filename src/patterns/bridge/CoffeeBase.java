package patterns.bridge;

public abstract class CoffeeBase {

	private ICoffeeMaker maker;
	
	public CoffeeBase(ICoffeeMaker maker) {
		this.maker = maker;
	}

	protected ICoffeeMaker getMaker() {
		return this.maker;
	}
	
	public abstract void getCoffee();
}
