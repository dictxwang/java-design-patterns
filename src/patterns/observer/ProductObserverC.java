package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ProductObserverC implements Observer {

	private final String observername = "Observer-C";
	private String name = "";
	private float price = 0.0f;
	
	public void update(Observable observable, Object obj) {
		if (obj instanceof Object[]) {
			Object[] objs = (Object[])obj;
			name = (String)objs[0];
			price = ((Float)objs[1]).floatValue();
			
			System.out.println(observername + ": Add new product, name is "
					+ name + ", and price is " + price);
		}
	}
}
