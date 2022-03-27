package patterns.interpreter;

import java.util.Enumeration;

public abstract class ChangeExpression {

	public void interpret(ChangeContext context) {
		int statementlength = context.getStatement().length();
		if (statementlength == 0) {
			return;
		}
		Enumeration<String> keys = ChangeKeyToValue.contrast.keys();
		while (keys.hasMoreElements()) {
			String itemkey = keys.nextElement();
			if (context.getStatement().startsWith("十")) {
				context.setStatement("一" + context.getStatement());
				break;
			} else if (context.getStatement().endsWith("万")
					|| context.getStatement().endsWith("亿")) {
				context.changeMultiplier();
				context.setStatement(context.getStatement().substring(
						0, context.getStatement().length() - 1));
				
			} else if (context.getStatement().endsWith(itemkey + this.getPostfix())) {
				context.setValue(context.getValue()
						+ ChangeKeyToValue.contrast.get(itemkey) * this.getMultiplier()
						* context.getMultiplier());
				
				context.setStatement(context.getStatement()
						.substring(0, statementlength - 1
								- this.getPostfix().length()));

			} else if (context.getStatement().endsWith("零")) {
				context.setStatement(context.getStatement().substring(
						0, context.getStatement().length() - 1));
			}
		}
	}

	public abstract String getPostfix();

	public abstract long getMultiplier();
}