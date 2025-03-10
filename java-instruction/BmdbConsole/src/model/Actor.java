package model;

public class Actor {
	private int id;
	private String name;
	private String dob;
	
	public Actor(int id, String name, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
}
