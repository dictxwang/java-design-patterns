package patterns.strategy;

public class BubbleSort implements ISort {

	private final String sortname = "Bubble-Sort";
	
	public String getSortName() {
		return this.sortname;
	}
	
	public void sort(int[] input) {
		int length = input.length;
		
		if (length < 1) {
			System.out.println("Array length is zero, sort invalid.");
		}
		long starttime = System.currentTimeMillis();
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (input[j] < input[j - 1]) {
					int swap = input[j - 1];
					input[j - 1] = input[j];
					input[j] = swap;
				}
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println(this.sortname + " sort end, duration time is " + (endtime - starttime) + " milliseconds.");
	}
}
