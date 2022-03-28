package patterns.prototype;

public abstract class AbstractSpoon {

	String spoonname;

	public Object clone() {
		Object object;
		
		try {
			object = super.clone();
		} catch (Exception exp) {
			exp.printStackTrace();
			object = null;
		}
		return object;
	}
	
	public void getSpoonInfo() {
		System.out.println("This is " + this.spoonname + ".");
	}

	/**
	 * @return the spoonname
	 */
	public String getSpoonname() {
		return spoonname;
	}

	/**
	 * @param spoonname the spoonname to set
	 */
	public void setSpoonname(String spoonname) {
		this.spoonname = spoonname;
	}
}
