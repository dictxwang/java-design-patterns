package patterns.strategy;

public class SortHandler {

	private ISort sortmethod;
	
	public SortHandler() {
		
	}
	
	public SortHandler(ISort sortmethod) {
		this.sortmethod = sortmethod;
	}
	
	public void setSortMethod(ISort sortmethod) {
		this.sortmethod = sortmethod;
	}
	
	public void executeSort(int[] input) {
		if (this.sortmethod == null) {
			System.out.println("Please set sort method first.");
		} else {
		    this.sortmethod.sort(input);
		}
	}
}
