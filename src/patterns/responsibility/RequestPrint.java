package patterns.responsibility;

public class RequestPrint extends Request {

	public RequestPrint(String type) {
		super(type);
	}

	public void execute() {
		System.out.println("Print request execute.");
	}
}
