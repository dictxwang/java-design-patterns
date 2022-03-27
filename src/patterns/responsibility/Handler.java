package patterns.responsibility;

public abstract class Handler {

	private Handler handler = null;
	
	public abstract void handlerRequest(Request request);

	/**
	 * @return the handler
	 */
	public Handler getHandler() {
		return handler;
	}

	/**
	 * @param handler the handler to set
	 */
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
