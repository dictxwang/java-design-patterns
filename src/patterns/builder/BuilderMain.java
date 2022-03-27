package patterns.builder;

public class BuilderMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IBuilder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();

		MessageProduct product = (MessageProduct)builder.getProduct();
		product.showAllMsg();
	}

}
