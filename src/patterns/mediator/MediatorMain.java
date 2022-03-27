package patterns.mediator;

public class MediatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IMediator mediator = new ConcreteMediator();
		Colleague colleagueA = new ColleagueA(mediator);
		Colleague colleagueB = new ColleagueB(mediator);
		mediator.addColleague(colleagueA);
		mediator.addColleague(colleagueB);
		
		mediator.colleagueChanged(colleagueB);
	}
}
