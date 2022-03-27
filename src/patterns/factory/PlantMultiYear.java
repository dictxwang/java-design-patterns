package patterns.factory;

public abstract class PlantMultiYear {

	private float length = 0;
	private int age = 0;
	
	public PlantMultiYear(int age) {
		this.age = age;
	}
	
	public abstract void getAgeInfo();

	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		this.length = length;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
