package patterns.singleton;

public class SingletonA {

	public SingletonA(){}
	
	private static SingletonA instance = new SingletonA();
	
	public static SingletonA getInstance() {
		return instance;
	}
	
	public static SingletonA getNewInstance() {
		return new SingletonA();
	}
	
	public void getSingetonInfo() {
		System.out.println("This is Singleton A.");
	}
}
