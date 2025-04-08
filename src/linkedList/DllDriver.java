package linkedList;

public class DllDriver {
	
	public static void main(String[] args) {
		DLL d=new DLL();
		d.append(10);
		d.display();
		d.append(20);
		d.display();
		d.append(30);
		d.display();
		d.prepend(0);
		d.display();
		d.insert(15, 2);
		d.display();
		d.deleteFirst();
		d.display();
		d.deleteLast();
		d.display();
		d.deleteIndex(1);
		d.display();
		d.update(1,1);
		d.display();
		System.out.println(d.search(20));
		d.reverse();
		d.displayReverse();
	}

}
