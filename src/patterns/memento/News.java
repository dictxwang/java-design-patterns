package patterns.memento;

public class News {

	private String title = "";
	private String content = "";

	public News() {}
	
	public NewsMemento getMemento() {
		return new NewsMemento(this);
	}
	
	public void setMemento(NewsMemento memento) {
		this.title = memento.getTitle();
		this.content = memento.getContent();
	}
	
	public void getNewsTitleAndContent() {
		System.out.println("News title: " + this.title);
		System.out.println("News content: " + this.content);
		System.out.println("==================================");
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
