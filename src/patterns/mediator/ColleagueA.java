package patterns.mediator;

public class ColleagueA extends Colleague {

	public ColleagueA(IMediator mediator) {
		super(mediator);
	}
	
	public void action() {
		System.out.println("ColleagueA action...");
	}
}
