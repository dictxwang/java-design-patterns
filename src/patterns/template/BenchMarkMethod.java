package patterns.template;

public class BenchMarkMethod extends BenchMark {

	public void benchmark() {
		int count = Integer.MAX_VALUE / 1024 / 4;
		for (int i = 0; i < count; i++) {
			System.out.println(i);
		}
	}
}
