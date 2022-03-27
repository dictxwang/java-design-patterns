package patterns.command;

public class CookerManager {

	private static boolean runFlag = false;
	
	public static void manageCooker() {
		if (!runFlag) {
			runFlag = true;
			
			CookerHot cooker1 = new CookerHot("陈厨子");
			CookerHot cooker2 = new CookerHot("李厨子");
			CookerHot cooker3 = new CookerHot("周厨子");

		    Thread t1 = new Thread(cooker1);
		    Thread t2 = new Thread(cooker2);
		    Thread t3 = new Thread(cooker3);

		    t1.start();
		    t2.start();
		    t3.start();
		}
	}
}
