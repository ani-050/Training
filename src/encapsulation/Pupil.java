package encapsulation;

public class Pupil {
	private String name;
	private String email;
	private Subject[] subjects=new Subject[5];
	
	Pupil(String name,String email) {
		this.name=name;
		this.email=email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Subject[] getSubjects() {
		return subjects;
	}
	
	int i=0;
	void addSubject(String subject,int duration) {
		subjects[i]=new Subject(subject,duration);
		i++;
	}
	void display() {
		System.out.println("student has:"+i+" subjects");
		for(Subject s : subjects) {
			if(s!=null) {
				System.out.print(s.getSubject()+"\t");
				System.out.println(s.getDuration());
			}
			
		}
	}

}
