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
			System.out.println("��̳�����޸���ϣ�" + name);
		} else {
			System.out.println("û��ϵͳ����̳����Ȩ�ޡ�");
		}
	}

	public void getForumInfo() {
		this.forum.getForumInfo();
	}
}
