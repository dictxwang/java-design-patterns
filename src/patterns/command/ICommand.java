package patterns.command;

public interface ICommand {

	public void execute();
	public void setCooker(ICooker cooker);
	public int getTabNum();
}
