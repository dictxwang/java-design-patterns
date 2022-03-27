package patterns.adapter;

public class OuterMailerAdapterII implements IOuterMailer {

	private OuterMailer mailer = new OuterMailer();
	
	public void sendMail() {
		this.mailer.sendMail();
	}
}
