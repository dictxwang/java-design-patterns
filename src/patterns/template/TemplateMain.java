package patterns.template;


public class TemplateMain {

	public static void main(String[] args) {
		BenchMark method = new BenchMarkMethod();
		long durationtime = method.repeatTime(1);
		double seconds = durationtime / 1000.0d;
		System.out.println("Duration time is " + seconds + " seconds.");
	}
}
