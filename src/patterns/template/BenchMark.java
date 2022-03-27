package patterns.template;

public abstract class BenchMark {

	public abstract void benchmark();
	
	public final long repeatTime(int count) {
		long durationtime = 0;
		long starttime = System.currentTimeMillis();
		long endtime = 0;
		for (int i = 0; i < count; i++) {
			benchmark();
		}
		endtime = System.currentTimeMillis();
		durationtime = endtime - starttime;
		return durationtime;
	}
}
