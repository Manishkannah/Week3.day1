package week3.org;


public class Student extends Department {
	public void studentDepartment() {
		System.out.println("Electrical");
	}
	public void studentName() {
		System.out.println("Manish");
	}
	public void studenID() {
		System.out.println("94335432");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.departmentName();
		std.studentDepartment();
		std.studentName();
		std.studenID();
	}

}
