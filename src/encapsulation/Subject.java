package encapsulation;

public class Subject {
	private String subject;
	private int duration;
	//private Pupil[] pupil=new Pupil[5];
	
	Subject(String subject,int duration) {
		this.subject=subject;
		this.duration=duration;
	}
	
	public String getSubject() {
		return subject;
	}
	public int getDuration() {
		return duration;
	}
//	public Pupil[] getPupil() {
//		return pupil;
//	}

}
