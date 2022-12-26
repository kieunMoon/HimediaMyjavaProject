package test;

public class Student extends Person {

	private String studentNo;

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\n", getName(), getPhone(), getStudentNo());
	}

	public Student(String name, String phone, String studentNo) {
		super(name, phone);
		this.studentNo = studentNo;
	}

}