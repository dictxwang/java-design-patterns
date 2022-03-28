package patterns.state;

public class StateWashing implements IWashingMachineState {

	private final String statename = "Washing";
	
	public void getState() {
		System.out.println("current state is " + this.statename + "...");
	}
	
	public void handle() {
		System.out.println(this.statename + " is handling");
	}
}
