package patterns.interpreter;

public class ChangeContext {

	private String statement = "";
	private long value =  0l;
	private long multiplier = 1l;

	public ChangeContext(String statement) {
		this.statement = statement;
	}

	public void changeMultiplier() {
		if (this.statement.endsWith("万")) {
			this.multiplier = 10000l * this.multiplier;
		} else if (this.statement.endsWith("亿")) {
			this.multiplier = 100000000l;
		}
	}

	public void resetMultiplier() {
		this.multiplier = 1l;
	}

	/**
	 * @return the statement
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * @param statement the statement to set
	 */
	public void setStatement(String statement) {
		this.statement = statement;
	}

	/**
	 * @return the value
	 */
	public long getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * @return the multiplier
	 */
	public long getMultiplier() {
		return multiplier;
	}
}
