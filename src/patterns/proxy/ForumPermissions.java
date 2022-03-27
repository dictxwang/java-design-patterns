package patterns.proxy;

public class ForumPermissions {

	public static final int READ = 0;
	
	public static final int SYSTEM_ADMIN = 1;
	
	public static final int FORUM_ADMIN = 2;
	
	private int permissionvalue = 0;
	
	public ForumPermissions (int permission) {
		this.permissionvalue = permission;
	}

	public boolean isSysOrForumAdmin() {
		return (this.permissionvalue == this.SYSTEM_ADMIN
				|| this.permissionvalue == this.FORUM_ADMIN);
	}
	
	public boolean isSysAdmin() {
		return this.permissionvalue == this.SYSTEM_ADMIN;
	}
}
