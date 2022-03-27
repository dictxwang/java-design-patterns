package patterns.interpreter;

public class ChangeExpressionThousand extends ChangeExpression {

	public String getPostfix() {
		return "千";
	}
	
	public long getMultiplier() {
		return 1000l;
	}
}
