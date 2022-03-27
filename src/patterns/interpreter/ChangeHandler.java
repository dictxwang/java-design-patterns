package patterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class ChangeHandler {
	
	private static List<ChangeExpression> expressions;

	static {
		expressions = new ArrayList<ChangeExpression>();
		expressions.add(new ChangeExpressionSingle());
		expressions.add(new ChangeExpressionTen());
		expressions.add(new ChangeExpressionHundred());
		expressions.add(new ChangeExpressionThousand());
		expressions.add(new ChangeExpressionTThousand());
		expressions.add(new ChangeExpressionHMillion());
	}

	public static long getContextValue(ChangeContext context) {
		long value = 0l;
		
		while (context.getStatement().length() > 0) {
			for (ChangeExpression item : expressions) {
				item.interpret(context);
			}
		}

		value = context.getValue();
		return value;
	}
}
