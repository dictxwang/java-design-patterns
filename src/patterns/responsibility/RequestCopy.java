package patterns.responsibility;

public class RequestCopy extends Request {
	
	public RequestCopy(String type) {
		super(type);
	}

	public void execute() {
		System.out.println("Copy request execute.");
	}
}
