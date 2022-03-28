package patterns.state;

public class StateDring implements IWashingMachineState {

	private final String statename = "Dring";
	
	public void getState() {
		System.out.println("current state is " + this.statename + "...");
	}
	
	public void handle() {
		System.out.println(this.statename + " is handling");
	}
}
