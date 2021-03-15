//Beseyata DeShmaya
package model;

public class Instructor {
	
	private String name;
	private int extension;
	private String email;

	public Instructor(String name, int extension, String email) {
		this.name = name;
		this.extension = extension;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneExtension() {
		return extension;
	}

	public void setPhoneExtension(int extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInformation() {
		
		return "Instructor "+name+" has campus phone extension "+extension+" and contact email "+email;
	}

}
