package patterns.singleton;

public class SingletonB {

	private static SingletonB instance = null;

	public static SingletonB getInstance() {
		if (instance == null) {
			instance = new SingletonB();
		}
		return instance;
	}
	
	public void getSingletonInfo() {
		System.out.println("This is Singleton B.");
	}
}
