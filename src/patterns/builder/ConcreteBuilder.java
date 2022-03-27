package patterns.builder;

public class ConcreteBuilder implements IBuilder {

	private IMessage normalMessage, errorMessage, warningMessage;

	public void buildNormalMessage() {
		normalMessage = new MessageNormal("Hello World.");
	}

	public void buildErrorMessage() {
		errorMessage = new MessageError("Bad Choose.");
	}

	public void buildWarningMessage() {
		warningMessage = new MessageWarning("Not Good.");
	}

	public IProduct getProduct() {
		MessageProduct product = new MessageProduct();
		product.setNormalMessage((MessageNormal)normalMessage);
		product.setErrorMessage((MessageError)errorMessage);
		product.setWarningMessage((MessageWarning)warningMessage);
		return product;
	}
}
