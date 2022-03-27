package patterns.responsibility;

public abstract class Request {

	private String type = "";
	
	public Request(String type) {
		this.type = type;
	}

	public abstract void execute();

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
