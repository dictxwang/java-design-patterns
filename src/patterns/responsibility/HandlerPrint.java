package patterns.responsibility;

public class HandlerPrint extends Handler {

	public void handlerRequest(Request request) {
		if (request instanceof RequestPrint) {
			System.out.print("This is print handler.\t");
			request.execute();
		} else {
			if (this.getHandler() != null) {
				this.getHandler().handlerRequest(request);
			}
		}
	}
}
