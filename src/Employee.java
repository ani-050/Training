package collection;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private int id;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee [id: "+id+"	name: "+name+" salary: "+salary+"]"+"\n----------------------------------------";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}

}
