package patterns.visitor;

public class NodeB extends Node {

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public void executeB() {
		System.out.println("Execute B.");
	}
}
