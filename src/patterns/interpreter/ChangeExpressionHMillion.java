package patterns.interpreter;

public class ChangeExpressionHMillion extends ChangeExpression {

	public String getPostfix() {
		return "亿";
	}
	
	public long getMultiplier() {
		return 100000000l;
	}
}
