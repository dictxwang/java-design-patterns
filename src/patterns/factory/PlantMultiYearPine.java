package patterns.factory;

public class PlantMultiYearPine extends PlantMultiYear {

	public PlantMultiYearPine(int age) {
		super(age);
	}

	public void getAgeInfo() {
		System.out.println("Pine is a perennial, it is "
				+ this.getAge() + " years old.");
	}
}
