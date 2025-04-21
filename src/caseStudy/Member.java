package caseStudy;

public class Member extends Person {
	
	private int memberId;
	private Book[] borrowed;
	
	public Member(String name, String email, int memberId) {
		super(name, email);
		this.memberId=memberId;
	}
	
	public int getMemberId() {
		return this.memberId;
	}
	
	

}
