package patterns.command;

public class CommandBeen implements ICommand {

	private final String name = "豆角";
	private ICooker cooker = null;
	private int tabnum;
	
	public CommandBeen(int tabnum) {
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
