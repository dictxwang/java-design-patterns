package patterns.interpreter;

import java.util.Hashtable;

public class ChangeKeyToValue {

	public static Hashtable<String,Integer> contrast;
	
	static {
		contrast = new Hashtable<String,Integer>();

		contrast.put("一", 1);
		contrast.put("二", 2);
		contrast.put("三", 3);
		contrast.put("四", 4);
		contrast.put("五", 5);
		contrast.put("六", 6);
		contrast.put("七", 7);
		contrast.put("八", 8);
		contrast.put("九", 9);
	}
}
