package patterns.visitor;

public class VisitorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectStructure structure = new ObjectStructure();
		structure.addNode(new NodeA());
		structure.addNode(new NodeB());
		
		IVisitor visitor = new VisitorA();
		structure.action(visitor);
	}

}
