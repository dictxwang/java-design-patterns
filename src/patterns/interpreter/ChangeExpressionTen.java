package patterns.interpreter;

public class ChangeExpressionTen extends ChangeExpression {

	public String getPostfix() {
		return "十";
	}
	
	public long getMultiplier() {
		return 10l;
	}
}
