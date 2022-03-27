package patterns.command;

public class CommandChicken implements ICommand {

	private final String name = "烧鸡块";
	private ICooker cooker = null;
	private int tabnum;
	
	public CommandChicken(int tabnum) {
		this.tabnum = tabnum;
	}
	
	public void setCooker(ICooker cooker) {
		this.cooker = cooker;
	}
	
	public int getTabNum() {
		return this.tabnum;
	}
	
	public void execute() {
		this.cooker.cook(tabnum, name);
	}
}
