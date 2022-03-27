package patterns.iterator;

public interface IInnerIterator {

	public void first();
	public void next();
	public boolean isDone();
	public Object currentItem();
}
