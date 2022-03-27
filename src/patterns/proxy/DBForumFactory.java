package patterns.proxy;

public class DBForumFactory extends ForumFactory {

	public IForum createForum(String name, String description) {
		DetailForum forum = new DetailForum();
		forum.setName(name);
		forum.setDescription(description);
		return forum;
	}
}