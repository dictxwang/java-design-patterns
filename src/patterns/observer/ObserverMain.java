package patterns.observer;

public class ObserverMain {

	public static void main(String[] args) {
		String name = "Changed-name";
		String nameB = "Changed-name-B";
		float price = 10.2f;
		
		Product product = new Product();
		ProductObserverA observerA = new ProductObserverA();
		ProductObserverB observerB = new ProductObserverB();
		ProductObserverC observerC = new ProductObserverC();
		
		product.addObserver(observerA);
		product.addObserver(observerB);
		product.addObserver(observerC);
		
		product.setName(name);
		product.setPrice(price);
		product.setInfo(name, price);
		product.setName(nameB);
	}
}
