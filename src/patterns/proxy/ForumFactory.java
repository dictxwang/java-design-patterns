package patterns.proxy;

public abstract class ForumFactory {

	private static Object initLock = new Object();
	private static ForumFactory factory = null;
	private static String classname = "patterns.proxy.DBForumFactory";

	public static ForumFactory getInstance(
			ForumPermissions permission) {
		if (factory == null) {
			synchronized(initLock) {
				if (factory == null) {
					try {
						factory = (ForumFactory)Class.forName(classname).newInstance();
					} catch (Exception exp) {
						return null;
					}
				}
			}
		}
		return new ForumFactoryProxy(factory, permission);
	}

	public abstract IForum createForum(String name, String description);
}
