package comparable;

public class Student implements Comparable{
	
	int roll;
	String name;
	double percentage;
	
	public Student(int roll,String name,double percentage) {
		this.roll=roll;
		this.name=name;
		this.percentage=percentage;
	}
	
	@Override
	public String toString() {
		return roll+"\t"+name+"\t"+percentage;
	}
	
	@Override
	public int compareTo(Object o) {
		Student s=(Student) o;
			return this.name.compareTo(s.name);
	}

}
