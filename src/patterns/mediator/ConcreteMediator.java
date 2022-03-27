package patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements IMediator {

	private List<Colleague> colleagues;
	
	public ConcreteMediator() {
		this.colleagues = new ArrayList<Colleague>();
	}

	public void addColleague(Colleague c) {
		this.colleagues.add(c);
	}
	
	public void removeColleague(Colleague c) {
		for (Colleague item : this.colleagues) {
			if (item.equals(c)) {
				this.colleagues.remove(item);
				break;
			}
		}
	}

	public void colleagueChanged(Colleague c) {
		for (Colleague item : this.colleagues) {
			if (!item.equals(c)) {
				item.action();
			}
		}
	}
}
