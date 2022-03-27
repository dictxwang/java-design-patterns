package patterns.iterator;

public class OuterConcreteIterator implements IOuterIterator {

	private OuterConcreteAggregate aggregate;
	private int index = 0;
	private int size = 0;

	public OuterConcreteIterator(OuterConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		this.index = 0;
		this.size = aggregate.size();
	}

	public void first() {
		this.index = 0;
	}

	public void next() {
		if (this.index < this.size) {
			this.index++;
		}
	}

	public boolean isDone() {
		return this.index >= this.size;
	}

	public Object currentItem() {
		return this.aggregate.get(this.index);
	}
}
