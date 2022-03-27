package patterns.strategy;

public class StrategyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inputSelect = {12,32,1,3,545,3212,13,30,2323,834,677};
		int[] inputBubble = {12,32,1,3,545,3212,13,30,2323,834,677};
		
		ISort methodselect = new SelectSort();
		ISort methodbubble = new BubbleSort();

		SortHandler handler = new SortHandler();
		handler.setSortMethod(methodselect);
		handler.executeSort(inputSelect);
		handler.setSortMethod(methodbubble);
		handler.executeSort(inputBubble);
	}

}
