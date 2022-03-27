package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ProductObserverA implements Observer {

	private final String observername = "Observer-A";
    private String name = "";
	
    public void update(Observable observable, Object obj) {
    	if (obj instanceof String) {
	    	name = (String)obj;
	    	System.out.println(observername + ": name change to " + name);
    	}
    }
}
