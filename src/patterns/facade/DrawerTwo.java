package patterns.facade;

public class DrawerTwo {

	public void open() {
		System.out.println("Drawer two be opened.");
		getFile();
	}
	
	private void getFile() {
		System.out.println("Get The file.");
	}
}
