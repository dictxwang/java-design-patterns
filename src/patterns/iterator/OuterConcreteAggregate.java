package patterns.iterator;

public class OuterConcreteAggregate extends OuterAggregate {

	private Object[] objs = {"abc", "123", "I II III"};
	
	public IOuterIterator createIterator() {
		return new OuterConcreteIterator(this);
	}
	
	public Object get(int index) {
		if (index < objs.length) {
			return objs[index];
		} else {
			return null;
		}
	}
	
	public int size() {
		return this.objs.length;
	}
}
