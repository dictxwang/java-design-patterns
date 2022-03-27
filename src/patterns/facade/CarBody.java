package patterns.facade;

public class CarBody {

	private final int wheelcount = 4;
	private CarEngine carengine = new CarEngine();
	private CarWheel[] carwheels = new CarWheel[wheelcount];

	public CarBody() {
		for (int i = 0; i < wheelcount; i++) {
			carwheels[i] = new CarWheel();
		}
	}

	/**
	 * @return the carengine
	 */
	public CarEngine getCarengine() {
		return carengine;
	}

	/**
	 * @return the carwheels
	 */
	public CarWheel[] getCarwheels() {
		return carwheels;
	}
}
