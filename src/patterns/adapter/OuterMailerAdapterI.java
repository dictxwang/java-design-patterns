package patterns.adapter;

public class OuterMailerAdapterI extends OuterMailer implements IOuterMailer {

	public void sendMail () {
		super.sendMail();
	}
}
