package caseStudy;

public class Author {
	
	public String name;
	public int age;
	
	public Author(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Author name:"+this.name+"Author age:"+this.age;
	}

}
