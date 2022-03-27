package patterns.builder;

public class MessageWarning implements IMessage {

	private String msgcontent = "";
	
	public MessageWarning(String msgcontent) {
		this.msgcontent = msgcontent;
	}
	
	public void showMsgInfo() {
		System.out.println("Warning Message is: " + this.msgcontent);
	}
}
