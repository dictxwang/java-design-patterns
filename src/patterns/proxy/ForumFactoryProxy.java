package patterns.proxy;

public class ForumFactoryProxy extends ForumFactory {

	protected ForumFactory factory;
	protected ForumPermissions permission;
	
	public ForumFactoryProxy (ForumFactory factory,
			ForumPermissions permission) {
		this.factory = factory;
		this.permission = permission;
	}

	public IForum createForum(String name, String description) {
		if (permission.isSysAdmin()) {
			DetailForum forum = (DetailForum)factory.createForum(name, description);
			return new ForumProxy(forum, permission);
		} else {
			System.out.println("permission not allow");
			return null;
		}
	}
}
