package patterns.decorator;

public class DecoratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneBasic basicphone = new PhoneBasic();
		basicphone.showCallRing();
		
		IPhone motophone = new PhoneMoto(basicphone);
		motophone.showCallRing();
		
		IPhone nokiaphone = new PhoneNokia(basicphone);
		nokiaphone.showCallRing();
	}
}
