package pkg1;

public class Employee {
	
	String name;
	String number;
	int salary;
	
	Employee(String name,String number,int salary){
		this.name=name;
		this.number=number;
		this.salary=salary;
	}
	Employee(String name,String number){
		this.name=name;
		this.number=number;
	}
	Employee(String name){ 
		this.name=name;
	}
	Employee(){
	}
	public void Display() {
		System.out.print("name:"+name+"\t");
		System.out.print("number:"+number+"\t");
		System.out.println("salary:"+salary+"\t");
	}

}
