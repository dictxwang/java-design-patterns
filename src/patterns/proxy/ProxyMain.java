package patterns.proxy;

public class ProxyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int guest = 0;
		int admin = 1;
		String firstname = "First Forum";
		String description = "Forum description";
		String changedname = "Changed Forum";

		DBForum forum = new DBForum();
		forum.setName(firstname);

		ForumPermissions permission = new ForumPermissions(admin);

		ForumProxy forumproxy = new ForumProxy(forum, permission);
		forumproxy.changeForumName(changedname);

		ForumFactoryProxy factory = (ForumFactoryProxy)ForumFactory.getInstance(permission);
		ForumProxy createdforumproxy = (ForumProxy)factory.createForum(firstname, description);
		if (createdforumproxy != null) {
			createdforumproxy.getForumInfo();
		}
	}
}
