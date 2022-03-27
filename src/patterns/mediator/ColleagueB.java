package patterns.mediator;

public class ColleagueB extends Colleague {

	public ColleagueB(IMediator mediator) {
		super(mediator);
	}

	public void action() {
		System.out.println("ColleagueB action...");
	}
}
