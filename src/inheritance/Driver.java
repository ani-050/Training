package inheritance;

public class Driver {
	
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		Dog dog=new Dog();
		
		System.out.println(animal.a);
		System.out.println(dog.a);
		
		System.out.println(animal.x);
		System.out.println(dog.x);
		
		System.out.println(dog.b);
		
		System.out.println(dog.y);
		
		animal.methodOfParent();
		dog.methodOfParent();
		
		animal.methodOfParent2();
		dog.methodOfParent2();
		
		dog.methodOfChild();
		
		dog.methodOfChild2();
		
	}

}
