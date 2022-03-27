package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	private List<Node> nodelist;

	public ObjectStructure() {
		this.nodelist = new ArrayList<Node>();
	}

	public void action(IVisitor visitor) {
		for (Node item : nodelist) {
			item.accept(visitor);
		} 
	} 

	public void addNode(Node node) {
		this.nodelist.add(node);
	}
}
