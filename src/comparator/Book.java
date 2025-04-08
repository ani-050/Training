package comparator;

public class Book implements Comparable{
	
	int id;
	double price;
	String title;
	
	public Book(int id,double price,String title) {
		this.id=id;
		this.price=price;
		this.title=title;
	}
	
	@Override
	public String toString() {
		return id+"\t"+price+"\t"+title;
	}
	
	@Override
	public int compareTo(Object o) {
		Book b=(Book) o;
		return this.title.compareTo(b.title);
	}
	

}
