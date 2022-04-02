package org.students;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Info with ID as an Argument");
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student Info with ID and Name as an Arguments");
	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student Info with Email and Phone Number as an Arguments");
	}

	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentInfo(841638);
		students.getStudentInfo(841638, "Bharath R");
		students.getStudentInfo("barathrju@gmail.com", "8973534991");
	}
}
