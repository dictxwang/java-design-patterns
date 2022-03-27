package patterns.state;

public class StateStop implements IWashingMachineState {

	private final String statename = "Í£Ö¹";
	
	public void getState() {
		System.out.println("Ï´ÒÂ»ú´¦ÓÚ" + this.statename + "×´Ì¬!");
	}
	
	public void handle() {
		System.out.println("Ï´ÒÂÍê±Ï£¬" + this.statename  + "Ï´ÒÂ»ú!");
	}
}
