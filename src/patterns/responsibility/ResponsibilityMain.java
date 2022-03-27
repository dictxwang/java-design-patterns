package patterns.responsibility;

public class ResponsibilityMain {

	public static void main(String[] args) {
		
		Request copyrequest = new RequestCopy("copy");
		Request printrequest = new RequestPrint("print");

		Handler copyhandler = new HandlerCopy();
		Handler printhandler = new HandlerPrint();
		copyhandler.setHandler(printhandler);
		
		copyhandler.handlerRequest(copyrequest);
		copyhandler.handlerRequest(printrequest);
	}
}
