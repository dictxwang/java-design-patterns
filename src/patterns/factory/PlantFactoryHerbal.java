package patterns.factory;

public class PlantFactoryHerbal extends PlantFactory {
	
	public PlantOneYear creator() {
		return new PlantOneYearCorn();
	}

	public PlantMultiYear creator(int age) {
		return new PlantMultiYearMoss(age);
	}
}
