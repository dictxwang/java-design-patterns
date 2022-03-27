package patterns.state;

public class StateWashing implements IWashingMachineState {

	private final String statename = "ϴ��";
	
	public void getState() {
		System.out.println("����" + this.statename + "...");
	}
	
	public void handle() {
		System.out.println(this.statename + "��ʼ��");
	}
}
