package comparable;

import java.util.Arrays;

public class StudentDriver {
	
	public static void main(String[] args) {
		Student[] students= {new Student(1,"aniket",99.99),
				new Student(2,"deep",88.88),
				new Student(3,"bhaskar",77.77)
		};
		
		Arrays.sort(students);
		for(Student student:students) {
			System.out.println(student);
		}
	}

}
