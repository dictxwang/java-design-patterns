package patterns.factory;

public class PlantFactoryWoody extends PlantFactory {

	public PlantOneYear creator() {
		return new PlantOneYearSoybean();
	}

	public PlantMultiYear creator(int age) {
		return new PlantMultiYearPine(age);
	}
}
