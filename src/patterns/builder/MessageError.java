package patterns.builder;

public class MessageError implements IMessage {

	private String msgcontent = "";
	
	public MessageError(String msgcontent) {
		this.msgcontent = msgcontent;
	}
	
	public void showMsgInfo() {
		System.out.println("Error Message is: " + this.msgcontent);
	}
}
