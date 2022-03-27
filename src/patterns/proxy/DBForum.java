package patterns.proxy;

public class DBForum implements IForum {

	private String name = "";
	
	public void changeForumName(String name) {
		this.name = name;
	}

	public void getForumInfo() {
		System.out.println("Forum Name is " + this.name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
