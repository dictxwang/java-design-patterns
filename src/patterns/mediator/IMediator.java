package patterns.mediator;

public interface IMediator {

	public void addColleague(Colleague c);
	public void removeColleague(Colleague c);
	public void colleagueChanged(Colleague c);
}
