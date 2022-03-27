package patterns.responsibility;

public class HandlerCopy extends Handler {

	public void handlerRequest(Request request) {
		if (request instanceof RequestCopy) {
			System.out.print("This is copy handler.\t");
			request.execute();
		} else {
			if (this.getHandler() != null) {
				this.getHandler().handlerRequest(request);
			}
		}
	}
}
