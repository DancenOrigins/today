package suspects;

public class BookTest {

	public static void main(String[] args) {
		Book book1=new Book("Daniel Defoe",1719,12,978);
		System.out.print(book1.BookAuth);
		Book book2=new Book("Julius Verne",1872,12,972);
		System.out.print(book2.BookAuth);
		book2.BookAuth = "Jules Verne";
		System.out.print(book2.BookAuth);
	}

}
