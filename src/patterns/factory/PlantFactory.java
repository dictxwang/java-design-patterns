package patterns.factory;

public abstract class PlantFactory {

	public abstract PlantOneYear creator();
	public abstract PlantMultiYear creator(int age);
}