package patterns.observer;

import java.util.Observable;

public class Product extends Observable {

	private String name = "product";
	private float price = 0.0f;
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers(name);
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
		setChanged();
		notifyObservers(new Float(price));
	}
	
	public void setInfo(String name, float price) {
		this.name = name;
		this.price = price;
		Object[] objs = new Object[2];
		objs[0] = name;
		objs[1] = (Float)price;
		setChanged();
		notifyObservers(objs);
	}
}
