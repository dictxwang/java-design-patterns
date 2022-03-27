package patterns.facade;

public class DrawerFacade {

	private DrawerOne drawerone;
	private DrawerTwo drawertwo;
	
	public DrawerFacade() {
		drawerone = new DrawerOne();
		drawertwo = new DrawerTwo();
	}
	
	public void openDrawer() {
		drawerone.open();
		drawertwo.open();
	}
}
