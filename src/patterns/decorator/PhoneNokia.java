package patterns.decorator;

public class PhoneNokia extends PhoneDecorator {

	public PhoneNokia(PhoneBasic phone) {
		super(phone);
	}
	
	public void showCallRing() {
		super.showCallRing();
		System.out.println("Nokia phone ring: Nokia, Nokia");
	}
}
