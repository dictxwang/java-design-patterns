package patterns.state;

public class StateMain {

	public static void main(String args[]) {
		WashingMachine machine = new WashingMachine();
		machine.switchState(0);
		machine.getState();
		
		machine.switchState(1);
		machine.handle();
		machine.getState();
		
		machine.switchState(2);
		machine.handle();
		machine.getState();

		machine.switchState(3);
		machine.handle();
		machine.getState();

		machine.switchState(0);
		machine.handle();
		machine.getState();
	}
}
