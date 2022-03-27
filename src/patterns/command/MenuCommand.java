package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements ICommand {

	private List<ICommand> menu = new ArrayList<ICommand>();

	public void addCommand(ICommand command) {
		this.menu.add(command);
	}

	public List<ICommand> getMenu() {
		return this.menu;
	}

	public void setCooker(ICooker cooker) {
		return;
	}

	public int getTabNum() {
		return 0;
	}

	public void execute() {
		CommandQueue.addCommand(this);
	}
}
