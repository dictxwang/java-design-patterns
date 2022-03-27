package patterns.factory;

public class FactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("1 Animal Factory Test:");
		Animal animal = AnimalFactory.getAnimal('d');
		animal.getBarking();

		System.out.println("\n2 Plant Factory Herbal Test:");
		PlantFactoryHerbal plantfactoryherbal = new PlantFactoryHerbal();
		PlantOneYear plantoneyearA = plantfactoryherbal.creator();
		PlantMultiYear plantmultiyearA = plantfactoryherbal.creator(10);
		plantoneyearA.getNameInfo();
		plantmultiyearA.getAgeInfo();

		System.out.println("\n3 Plant Factory Woody Test:");
		PlantFactoryWoody plantfactorywoody = new PlantFactoryWoody();
		PlantOneYear plantoneyearB = plantfactorywoody.creator();
		PlantMultiYear plantmultiyearB = plantfactorywoody.creator(30);
		plantoneyearB.getNameInfo();
		plantmultiyearB.getAgeInfo();
	}

}
