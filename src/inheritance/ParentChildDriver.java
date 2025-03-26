package inheritance;

public class ParentChildDriver {
	
	public static void main(String[] args) {
		
		Parent.parent();
		//Parent.child();
		System.out.println("\n");
		Child.parent();
		System.out.println("\n");
		Child.child();
	}

}
