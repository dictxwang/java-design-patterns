package patterns.mediator;

public abstract class Colleague {

	private IMediator mediator;
	
	public Colleague(IMediator mediator) {
		this.mediator = mediator;
	}

	public IMediator getMediator() {
		return this.mediator;
	}

	public void change() {
		this.mediator.colleagueChanged(this);
	}
	
	public abstract void action();
}
