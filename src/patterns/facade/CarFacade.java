package patterns.facade;

public class CarFacade {

	private CarBody carbody = new CarBody();

	public void carRun() {
		this.carbody.getCarengine().engineWork();
		for (CarWheel item : carbody.getCarwheels()) {
			item.wheelWork();
		}
	}

	public void carStop() {
		this.carbody.getCarengine().engineStop();
		for (CarWheel item : carbody.getCarwheels()) {
			item.wheelStop();
		}
	}
}
