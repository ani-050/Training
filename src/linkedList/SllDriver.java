package linkedList;

public class SllDriver {
	public static void main(String[] args) {
		SLL s=new SLL();
		s.append(10);
		s.display();
		s.append(20);
		s.display();
		s.append(30);
		s.display();
		s.prepend(0);
		s.display();
		s.insert(99, 2);
		s.display();
		s.deleteFirst();
		s.display();
		s.deleteLast();
		s.display();
		s.deleteIndex(1);
		s.display();
		s.getSize();
		s.reverse();
		s.update(5, 1);
		s.display();
		System.out.println(s.search(5));
	}

}
