//Beseyata DeShmaya
package model;

public class Registration {
	private String title;
	private int marks;
	private Instructor instructor;

	public Registration(String title) {
		this.title = title;
	}

	public Registration(String title, Instructor instructor) {
		this.title=title;
		this.instructor=instructor;
	}

	public String getTitle() {
		return title;
	}

	public int getMarks() {
		return marks;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public String[] getGradeReport() {
		if (marks < 50)
			return new String[] { "F", "Failing" };
		if (marks < 60)
			return new String[] { "D", "Passing" };
		if (marks < 70)
			return new String[] { "C", "Competent" };
		if (marks < 80)
			return new String[] { "B", "Good" };
		if (marks < 90)
			return new String[] { "A", "Excellent" };
		return new String[] { "A+", "Exceptional" };
	}

	public String getInformation() {
		if(instructor==null)
			return title+" has not yet been assigned an instructor";
		String[] report = getGradeReport();
		return title + ", taught by " + instructor.getName() + ", is completed with raw marks " + marks + " ("
				+ report[0] + " ; " + report[1] + ")";
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
		
	}

	public void setMarks(int marks) {
		this.marks = marks;
		
	}

}
