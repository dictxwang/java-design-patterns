package patterns.adapter;

public class AdapterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Example mailer adapter I:");
		IOuterMailer mailAdapterI = new OuterMailerAdapterI();
		mailAdapterI.sendMail();

		System.out.println("===============================");
		System.out.println("Example mailer adapter II:");
		IOuterMailer mailAdapterII = new OuterMailerAdapterII();
		mailAdapterII.sendMail();

		System.out.println("===============================");
		System.out.println("Example create adapter.");
		CreateAdapter createAdapter = new CreateAdapter();
		createAdapter.getSquare();
		createAdapter.getCircle();
	}

}
