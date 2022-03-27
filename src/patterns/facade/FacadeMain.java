package patterns.facade;

public class FacadeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Example car facade:");
		CarFacade car = new CarFacade();
		car.carRun();
		car.carStop();

		System.out.println("=================================");
		System.out.println("Example drawer facade:");
		DrawerFacade drawer = new DrawerFacade();
		drawer.openDrawer();
	}

}
