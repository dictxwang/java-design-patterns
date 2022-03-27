package patterns.interpreter;

public class ChangeExpressionTThousand extends ChangeExpression {

	public String getPostfix() {
		return "万";
	}
	
	public long getMultiplier() {
		return 10000l;
	}
}
