package patterns.bridge;

public class BridgeMain {

	public static void main(String[] args) {
		
		ICoffeeMaker maker;
		CoffeeBigCup bigcup;
		CoffeeSmallCup smallcup;

		// ��ţ�̿���
		maker = new CoffeeMakerAddMilk();
		bigcup = new CoffeeBigCup(maker);
		smallcup = new CoffeeSmallCup(maker);
		bigcup.getCoffee();
		smallcup.getCoffee();
		System.out.println("=====================================");

		// ���ǿ���
		maker = new CoffeeMakerAddSugar();
		bigcup = new CoffeeBigCup(maker);
		smallcup = new CoffeeSmallCup(maker);
		bigcup.getCoffee();
		smallcup.getCoffee();
		System.out.println("=====================================");

		// ʲô������
		maker = new CoffeeMakerNoAdd();
		bigcup = new CoffeeBigCup(maker);
		smallcup = new CoffeeSmallCup(maker);
		bigcup.getCoffee();
		smallcup.getCoffee();
		
	}
}
