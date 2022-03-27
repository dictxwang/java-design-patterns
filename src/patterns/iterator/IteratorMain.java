package patterns.iterator;

public class IteratorMain {

	public static void main(String[] args) {
		
		System.out.println("Outer(White-Box) iterator:==========");
		OuterAggregate outaggregate = new OuterConcreteAggregate();
		IOuterIterator iterator = outaggregate.createIterator();
		while (!iterator.isDone()) {
			System.out.println(iterator.currentItem().toString());
			iterator.next();
		}
		
		System.out.println("\nOuter(Black-Box) iterator:==========");
		InnerAggregate inneraggregate = new InnerConcreteAggregate();
		IInnerIterator inneriterator = inneraggregate.createIterator();
		while (!inneriterator.isDone()) {
			System.out.println(inneriterator.currentItem().toString());
			inneriterator.next();
		}
		
	}
}
