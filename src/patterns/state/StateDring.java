package patterns.state;

public class StateDring implements IWashingMachineState {

	private final String statename = "脱水";
	
	public void getState() {
		System.out.println("正在" + this.statename + "...");
	}
	
	public void handle() {
		System.out.println(this.statename + "开始～");
	}
}
