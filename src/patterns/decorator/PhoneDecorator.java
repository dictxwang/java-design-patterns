package patterns.decorator;

public abstract class PhoneDecorator implements IPhone {

	private PhoneBasic phone;

	public PhoneDecorator(PhoneBasic phone) {
		if (phone != null) {
			this.phone = phone;
		} else {
			this.phone = new PhoneBasic();
		}
	}

	public void showCallRing() {
		this.phone.showCallRing();
	}
}
