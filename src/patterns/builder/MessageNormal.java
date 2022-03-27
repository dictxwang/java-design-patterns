package patterns.builder;

public class MessageNormal implements IMessage {

	private String msgcontent = "";
	
	public MessageNormal(String msgcontent) {
		this.msgcontent = msgcontent;
	}
	
	public void showMsgInfo() {
		System.out.println("Normal Message is: " + this.msgcontent);
	}
}
