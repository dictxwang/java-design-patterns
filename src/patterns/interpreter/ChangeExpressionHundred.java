package patterns.interpreter;

public class ChangeExpressionHundred extends ChangeExpression {

	public String getPostfix() {
		return "百";
	}
	
	public long getMultiplier() {
		return 100l;
	}
}
