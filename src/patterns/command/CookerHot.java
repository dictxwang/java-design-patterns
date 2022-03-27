package patterns.command;

public class CookerHot implements ICooker, Runnable {

	private String name = "";

	public CookerHot (String name) {
		this.name = name;
	}

	public void cook(int tabnum, String name) {
		int cooktime = (int)(20 * Math.random());

		System.out.println(this.name + "为" + tabnum + "号桌做" + name + "...");
		try {
			Thread.sleep(cooktime * 1000);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		System.out.println("**" + this.name + "为" + tabnum
				+ "号桌做完" + name + ", 功耗时"
				+ cooktime + "毫秒");
	}

	public void run() {
		while (true) {
			ICommand command = CommandQueue.getOneCommand();
			if (command != null) {
				command.setCooker(this);
				command.execute();
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception exp) {
				exp.printStackTrace();
			}
		}
	}
}
