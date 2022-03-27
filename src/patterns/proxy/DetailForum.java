package patterns.proxy;

public class DetailForum implements IForum{

	private String name = "";
	private String description = "";
	
	public void changeForumName(String name) {
		return;
	}
	
	public void getForumInfo() {
		StringBuffer info = new StringBuffer();
		info.append("Forum Name: ")
		    .append(this.name)
		    .append("\n")
		    .append("Forum Description: ")
		    .append(this.description);
		System.out.println(info.toString());
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

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
