package patterns.decorator;

public class PhoneMoto extends PhoneDecorator {

	public PhoneMoto(PhoneBasic phone) {
		super(phone);
	}

	public void showCallRing() {
		super.showCallRing();
		System.out.println("Moto phone ring: MOTO,MOTO,MOTO,бл,бл");
	}
}
