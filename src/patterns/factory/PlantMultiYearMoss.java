package patterns.factory;

public class PlantMultiYearMoss extends PlantMultiYear {

	public PlantMultiYearMoss(int age) {
		super(age);
	}

	public void getAgeInfo() {
		System.out.println("Moss is perennial, it is "
				+ this.getAge() + " years old.");
	}
}
