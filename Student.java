package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name method has been Executed");
	}

	public void studentDept() {
		System.out.println("Student Department method has been Executed");
	}

	public void studentId() {
		System.out.println("Student ID method has been Executed");
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
}
