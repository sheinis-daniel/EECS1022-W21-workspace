//Beseyata DeShmaya
package model;

public class Participant {

	private String name;
	private Registration[] registrations = new Registration[0];

	public Participant(String name) {
		this.name = name;
	}

	public Registration[] getRegistrations() {
		return registrations;
	}

	public String getGPAReport() {
		int gradesLength = 0;
		for (int i = 0; i < registrations.length; i++) {
			Registration registration = registrations[i];
			if (registration != null)
				gradesLength++;
		}
		
		if(gradesLength==0) 
			return "No GPA available yet for " + name;
		
		int []grades = new int[gradesLength];
		String []letterGrades = new String[gradesLength];
		int index = 0;
		
		for (int i = 0; i < registrations.length; i++) {
			Registration registration = registrations[i];
			if (registration != null) {
				grades[index]=getGpa(registration.getGradeReport()[0]);
				letterGrades[index] = registration.getGradeReport()[0];
				index++;
			}
		}
		
		int sum = 0;
		for(int grade : grades) {
			sum+=grade;
		}
		String average = String.format("%.1f", sum*(1.0/gradesLength));
		
		String gradesReport = grades[0]+" ("+letterGrades[0]+")";
		
		for(int i = 1;i<grades.length;i++) {
			gradesReport+=", "+grades[i]+" ("+letterGrades[i]+")";
		}
		return name+"'s GPA of {"+gradesReport+"}: "+average;
		
	}

	private int getGpa(String string) {
		if(string.equals("F"))
			return 0;
		if(string.equals("D"))
			return 5;
		if(string.equals("C"))
			return 6;
		if(string.equals("B"))
			return 7;
		if(string.equals("A"))
			return 8;
		return 9;
	}

	public int marksOf(String course) {
		for (Registration registration : registrations) {
			if (registration.getTitle().equals(course))
				return registration.getMarks();
		}
		return -1;
	}

	public void addRegistration(String title) {
		addRegistration(new Registration(title));

	}

	public void addRegistration(Registration registration) {
		if (registrations.length < 5) {
			int length = registrations.length;
			Registration[] newRegistrations = new Registration[length + 1];
			for (int i = 0; i < length; i++) {
				newRegistrations[i] = registrations[i];
			}
			newRegistrations[length] = registration;
			registrations = newRegistrations;
		}

	}

	public void updateMarks(String title, int newMark) {
		for (Registration registration : registrations) {
			if (registration.getTitle().equals(title))
				registration.setMarks(newMark);
		}

	}

	public void clearRegistrations() {
		registrations = new Registration[0];

	}

	public boolean isEnrolled(String title) {
		for (Registration registration : registrations) {
			if (registration.getTitle().equals(title))
				return true;
		}
		return false;
	}

}
