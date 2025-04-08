package linkedList;

public class CllDriver {
	public static void main(String[] args) {
		CLL c=new CLL();
		c.append(10);
		c.display();
		c.append(20);
		c.display();
		c.append(30);
		c.display();
		c.append(40);
		c.display();
		c.prepend(0);
		c.display();
		c.insert(15, 2);
		c.display();
		c.deleteFirst();
		c.display();
		c.deleteLast();
		c.display();
		c.deleteIndex(1);
		c.display();
		c.update(22, 1);
		c.display();
		System.out.println(c.search(22));
		c.reverse();
		c.display();
		}

}
