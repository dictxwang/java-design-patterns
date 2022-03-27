package patterns.memento;

import java.io.Serializable;

public class NewsMemento implements Serializable {

	private String title = "";
	private String content = "";

	public NewsMemento(News news) {
		this.title = news.getTitle();
		this.content = news.getContent();
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
