package patterns.state;

public class StateStop implements IWashingMachineState {

	private final String statename = "ֹͣ";
	
	public void getState() {
		System.out.println("ϴ�»�����" + this.statename + "״̬!");
	}
	
	public void handle() {
		System.out.println("ϴ����ϣ�" + this.statename  + "ϴ�»�!");
	}
}
