package patterns.adapter;

public class CreateAdapter extends CreateSquare {

	private CreateCircle createCircle = new CreateCircle();

	public void getCircle() {
		this.createCircle.getCircle();
	}
}
