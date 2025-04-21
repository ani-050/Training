package collection;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1.add employee\n2.print all employee\n"
					+ "3.search employee\n4.search employee by id\n"
					+ "5.delete employeee\n6.delete employee by id\n"
					+ "7.update employee by id\n8.sort employee based on id\n--------------------------------");
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				Employee emp=createEmployeeObject(sc);
				Employees.addEmployee(emp);
				break;
			}
			
			case 2:{
				Employees.print();
				break;
			}
			
			case 3:{
				System.out.println("enter employee details to search:");
				Employee emp=createEmployeeObject(sc);
				boolean result=Employees.searchObject(emp);
				if(result) {
					System.out.println("employee found\n------------");
				}
				else {
					System.out.println("employee not found\n--------------------");
				}
				break;
			}
			
			case 4:{
				System.out.println("enter id to be searched:");
				int id=sc.nextInt();
				boolean result=Employees.searchById(id);
				if(result) {
					System.out.println("employee found\n----------");
				}
				else {
					System.out.println("employee not found\n-------------------");
				}
				break;
			}
			
			case 5:{
				System.out.println("enter employee details to delete:");
				Employee emp=createEmployeeObject(sc);
				Employees.removeObject(emp);
				break;
			}
			
			case 6:{
				System.out.println("enter id to be remove:");
				int id=sc.nextInt();
				Employees.removeById(id);
				break;
			}
			
			case 7:{
				System.out.println("enter id to be update:");
				int id=sc.nextInt();
				boolean result=Employees.searchById(id);
				if(result) {
					Employees.updateById(id, sc);
				}
				else {
					System.out.println("employee not found\n-------------------");
				}
				break;
			}
			
			case 8:{
				Employees.sort();
				break;
			}
			
			default:System.exit(0);
			}
		}
	}
	
	private static Employee createEmployeeObject(Scanner sc) {
		System.out.println("enter id, name, salary");
		Employee emp=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		return emp;
	}

}
