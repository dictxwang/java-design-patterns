package patterns.singleton;

public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SingletonA singletonA = SingletonA.getInstance();
		singletonA.getSingetonInfo();
		SingletonA singletonA2 = SingletonA.getInstance();
		if (singletonA.equals(singletonA2)) {
			System.out.println("Method getInstance is Singleton.");
		} else {
			System.out.println("Method getInstance is not Singleton.");
		}
		
		SingletonA notSingletonA = SingletonA.getNewInstance();
		SingletonA notSingletonA2 = SingletonA.getNewInstance();
		if (notSingletonA.equals(notSingletonA2)) {
			System.out.println("Method getNewInstance is Singleton.");
		} else {
			System.out.println("Method getNewInstance is not Singleton.");
		}
		
		SingletonB singletonB = SingletonB.getInstance();
		singletonB.getSingletonInfo();
		SingletonB singletonB2 = SingletonB.getInstance();
		if (singletonB.equals(singletonB2)) {
			System.out.println("SingletonB is Singleton.");
		} else {
			System.out.println("SingletonB is not Singleton.");
		}
	}

}
