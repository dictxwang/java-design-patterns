package patterns.state;

public class StateStop implements IWashingMachineState {

	private final String statename = "Stop";
	
	public void getState() {
		System.out.println("current state is " + this.statename);
	}
	
	public void handle() {
		System.out.println(this.statename  + " is handling");
	}
}
