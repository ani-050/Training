package comparator;

import java.util.Arrays;

public class BookDriver {
	
	public static void main(String[] args) {
		Book[] books= {new Book(1,45.67,"bengali"),
				new Book(2,34.65,"hindi"),
				new Book(3,76.34,"english")
		};
		System.out.println("default");
		Arrays.sort(books);
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("sort by id");
		SortById sortId=new SortById();
		Arrays.sort(books,sortId);
		for(Book book:books) {
			System.out.println(book);
		}
		System.out.println("sort by price");
		SortByPrice sortPrice=new SortByPrice();
		Arrays.sort(books,sortPrice);
		for(Book book:books) {
			System.out.println(book);
		}
		System.out.println("sort by name");
		SortByName sortName=new SortByName();
		Arrays.sort(books,sortName);
		for(Book book:books) {
			System.out.println(book);
		}
		
	}

}
