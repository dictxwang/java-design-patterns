package patterns.command;

public class CommandMain {

	public static void main(String args[]) {
		CookerManager.manageCooker();
		
		for (int i = 1; i <= 5; i++) {
			Waiter waiter = new Waiter();
			
			ICommand been = new CommandBeen(i);
			ICommand chicken = new CommandChicken(i);
			ICommand duck = new CommandDuck(i);
			
			waiter.orderDish(been);
			waiter.orderDish(chicken);
			waiter.orderDish(duck);
			
			waiter.orderOver();
		}
	}
}
