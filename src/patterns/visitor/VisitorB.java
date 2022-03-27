package patterns.visitor;

public class VisitorB implements IVisitor {

	public void visit(NodeA nodeA) {
		nodeA.executeA();
	}
	
	public void visit(NodeB nodeB) {
		nodeB.executeB();
	}
}
