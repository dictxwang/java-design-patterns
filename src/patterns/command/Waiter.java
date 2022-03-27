package patterns.command;

public class Waiter {

	private MenuCommand menu = new MenuCommand();

	public void orderDish(ICommand command) {
		this.menu.addCommand(command);
	}

	public void orderOver() {
		this.menu.execute();
	}
}
