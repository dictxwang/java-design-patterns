package patterns.interpreter;

public class InterpreterMain {

	public static void main(String[] args) {
//		String statement = "三万六千八百五十七亿八千零三十一万二千四百五十三";
		String statement = "三百万";
		long value = 0;
		ChangeContext context = new ChangeContext(statement);
		value = ChangeHandler.getContextValue(context);
		System.out.println(value);
	}
}
