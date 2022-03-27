package patterns.factory;

public abstract class PlantOneYear {

	private String flowercolor = "";
	private String name = "";
	
	public abstract void getNameInfo();

	/**
	 * @return the flowercolor
	 */
	public String getFlowercolor() {
		return flowercolor;
	}

	/**
	 * @param flowercolor the flowercolor to set
	 */
	public void setFlowercolor(String flowercolor) {
		this.flowercolor = flowercolor;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
