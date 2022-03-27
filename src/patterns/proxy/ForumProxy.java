package patterns.proxy;

public class ForumProxy implements IForum {

	private ForumPermissions permission;
	private IForum forum;

	public ForumProxy(IForum forum, ForumPermissions permission) {
		this.forum = forum;
		this.permission = permission;
	}

	public void changeForumName(String name) {
		if (permission.isSysOrForumAdmin()) {
			this.forum.changeForumName(name);
			System.out.println("论坛名称修改完毕：" + name);
		} else {
			System.out.println("没有系统或论坛管理权限～");
		}
	}

	public void getForumInfo() {
		this.forum.getForumInfo();
	}
}
