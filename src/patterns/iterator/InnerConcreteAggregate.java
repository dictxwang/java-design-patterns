package patterns.iterator;

public class InnerConcreteAggregate extends InnerAggregate {

	private Object[] objs = {"Jupiter", "Earth", "Moon", "Mars"};
	
	public IInnerIterator createIterator() {
		return new InnerConcreteIterator();
	}

	private class InnerConcreteIterator implements IInnerIterator {
		private int index = 0;
		
		public void first() {
			this.index = 0;
		}
		
		public void next() {
			if (index < objs.length) {
				index++;
			}
		}

		public boolean isDone() {
			return index >= objs.length;
		}
		
		public Object currentItem() {
			if (index < objs.length) {
				return objs[index];
			} else {
				return null;
			}
		}
	}
}
