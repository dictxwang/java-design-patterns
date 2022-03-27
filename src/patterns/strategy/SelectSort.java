package patterns.strategy;

public class SelectSort implements ISort {

	private final String sortname = "Select-Sort";
	
	public String getSortName() {
		return this.sortname;
	}
	
	public void sort(int[] input) {
		int length = input.length;
		
		if (length < 1) {
			System.out.println("Array length is zero, select sort invalid.");
		} else {
			long starttime = System.currentTimeMillis();
			for (int i = 0; i < length - 1; i++) {
				int swapindex = i;
				for (int j = i + 1; j < length; j++) {
					if (input[j] < input[swapindex]) {
						swapindex = j;
					}
				}
				int swap = input[i];
				input[i] = input[swapindex];
				input[swapindex] = swap;
			}
			long endtime = System.currentTimeMillis();
			System.out.println(this.sortname + " sorted end, duration time is " + (endtime - starttime) + "milliseconds.");
		}
	}
}
