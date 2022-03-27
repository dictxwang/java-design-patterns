package patterns.memento;

public class MementoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String newstitle = "Main News";
		String newscontent = "This is news's content.";
		String changedtitle = "Changed News";
		String changedcontent = "Changed content.";
		
		News news = new News();
		news.setTitle(newstitle);
		news.setContent(newscontent);
		news.getNewsTitleAndContent();
		
		NewsMemento memento = news.getMemento();
		
		news.setTitle(changedtitle);
		news.setContent(changedcontent);
		news.getNewsTitleAndContent();
		
		news.setMemento(memento);
		news.getNewsTitleAndContent();
	}

}
