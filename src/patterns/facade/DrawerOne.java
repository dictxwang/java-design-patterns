package patterns.facade;

public class DrawerOne {

	public void open () {
		System.out.println("Drawer one be opened.");
		getKey();
	}
	
	private void getKey() {
		System.out.println("Get the key of drawer two.");
	}
}
