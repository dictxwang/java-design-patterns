package patterns.builder;

public class Director {

	private IBuilder builder;
	
	public Director(IBuilder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		this.builder.buildNormalMessage();
		this.builder.buildErrorMessage();
		this.builder.buildWarningMessage();
	}
}
