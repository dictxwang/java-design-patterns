package patterns.state;

public class StateDring implements IWashingMachineState {

	private final String statename = "��ˮ";
	
	public void getState() {
		System.out.println("����" + this.statename + "...");
	}
	
	public void handle() {
		System.out.println(this.statename + "��ʼ��");
	}
}
