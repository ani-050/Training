package inheritance;

public class Student extends Person {
	
	private int studentId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	Student(){}
	
	Student(int studentId,String name,int age){
		super(name,age);
		this.studentId=studentId;
	}
	
	void displayDetails() {
		this.displayParentDetails();
		System.out.println(this.studentId);
	}

}
