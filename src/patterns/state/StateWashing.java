package patterns.state;

public class StateWashing implements IWashingMachineState {

	private final String statename = "洗涤";
	
	public void getState() {
		System.out.println("正在" + this.statename + "...");
	}
	
	public void handle() {
		System.out.println(this.statename + "开始～");
	}
}
