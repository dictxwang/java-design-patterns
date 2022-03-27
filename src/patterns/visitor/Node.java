package patterns.visitor;

public abstract class Node {

	public abstract void accept(IVisitor visitor);
}
