package patterns.state;

public class WashingMachine {

	public static final int STATE_WATERING = 1;
	public static final int STATE_WASHING = 2;
	public static final int STATE_DRING = 3;
	public static final int STATE_STOP = 0;
	
	private IWashingMachineState state = new StateWatering();
	
	public void switchState(int state) {
		switch (state) {
		case 1:
			this.state = new StateWatering();
			break;
		case 2:
			this.state = new StateWashing();
			break;
		case 3:
			this.state = new StateDring();
			break;
		case 0:
			this.state = new StateStop();
	        break;
	    default:
	    	this.state = new StateStop();
	        break;
		}
	}
	
	public void handle() {
		this.state.handle();
	}

	public void getState() {
		this.state.getState();
	}
}
