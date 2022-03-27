package patterns.builder;

public interface IBuilder {

	public void buildNormalMessage();
	public void buildErrorMessage();
	public void buildWarningMessage();

	public IProduct getProduct();
}
