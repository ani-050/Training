package caseStudy;

public class Book {
	
	public String title;
	public Author author;
	
	public Book(String title, Author author) {
		this.title=title;
		this.author=author;
	}
	
//	public String getTitle() {
//		return this.title;
//	}
//	
//	public String getAuthor() {
//		return author.toString();
//	}
	
	@Override
	public String toString() {
		return "Book titole:"+this.title+author.toString();
	}

}
