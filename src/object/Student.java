package object;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double percentage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	Student(){}
	
	Student(int id,String name,double percentage) {
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	
	@Override
	public String toString() {
		return "id:"+this.id+"\tname:"+this.name+"\tpercentage:"+this.percentage;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.percentage);
	}
	
	@Override
	public boolean equals(Object obj) {
		Student e=(Student) obj;
		return this.id==e.id && this.name.equals(e.name) && this.percentage==e.percentage;
	}

}
