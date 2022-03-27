package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ProductObserverB implements Observer {

	private String observername = "Observer-B";
	private float price = 0.0f;
	
	public void update(Observable observable, Object obj) {
		if (obj instanceof Float) {
			price = ((Float)obj).floatValue();
			System.out.println(observername + ": price change to " + price);
		}
	}
}
