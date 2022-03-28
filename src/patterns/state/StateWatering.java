package patterns.state;

public class StateWatering implements IWashingMachineState {

	private final String statename = "watering";
	
	public void getState() {
		System.out.println("current state is " + this.statename + "...");
	}
	
	public void handle() {
		System.out.println(this.statename + " is handling");
	}
}
