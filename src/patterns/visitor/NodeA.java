package patterns.visitor;

public class NodeA extends Node {

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
	public void executeA() {
		System.out.println("Execute A.");
	}
}
