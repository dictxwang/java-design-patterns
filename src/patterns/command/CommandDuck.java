package patterns.command;

public class CommandDuck implements ICommand {

	private final String name = "烤鸭";
	private ICooker cooker = null;
	private int tabnum;
	
	public CommandDuck(int tabnum) {
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
