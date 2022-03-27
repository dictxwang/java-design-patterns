package patterns.iterator;

public interface IOuterIterator {

	public void first();
	public void next();
	public Object currentItem();
	public boolean isDone();
}
