package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {

	private static List<ICommand> commandlist = new ArrayList<ICommand>();
	
	public synchronized static void addCommand(MenuCommand menu) {
		for (ICommand command : menu.getMenu()) {
			commandlist.add(command);
		}
	}

	public synchronized static ICommand getOneCommand() {
		ICommand command = null;

		if (commandlist.size() > 0) {
			command = commandlist.get(0);
			commandlist.remove(0);
		}

		return command;
	}
}
