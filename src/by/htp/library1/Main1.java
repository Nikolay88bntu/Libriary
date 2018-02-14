package by.htp.library1;
import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		
		
		Librarian librarian = new Librarian();
		
		Book book1 = new Book("Jane Eyre", "Ch.Bronte", 1978, 564);
		Book book2 = new Book("Tom Soyer", "Mark Twain", 1981, 345);
		Book book3 = new Book("Gone with the wind", "Margaret Mitchel", 1993, 1067);
		Book book4 = new Book("Catcher in the rye", "Eugene Sellenjer", 2001, 183);
		
		
		Bookcase bookcase = librarian.openLibrary(1, 10);
		Bookcase deletedbooks = librarian.deletedBookBox(2, 10);
		
		librarian.addNewBook(book1, bookcase);
		librarian.addNewBook(book2, bookcase);
		librarian.addNewBook(book3, bookcase);
		librarian.addNewBook(book4, bookcase);
		
		librarian.printListOfBooks(bookcase);
		
		bookcase.deleteOneBook();
		//librarian.deleteOneBook();// ne udalyaetsa kniga
		
		//librarian.printListOfBooks(deletedbooks);
		//librarian.printListOfDeletedBooks(deletedbooks);
		
		 
		
		//Arrays.sort(bookcase.getBooks());// ne sortiruetsa massiv
		
		librarian.printListOfBooks(bookcase);
		
	}
	}


