package by.htp.library1;
import java.util.*;

public class Librarian {
	
	private Book[] books;
	//private WriterOfBook[] writers;
	private String firstLibrarianName;
	private String secondLibrarianName;
	int lastIndex;
	
	public Librarian () { //konstruktor
		
		this.firstLibrarianName = "Anna Semenovna";
		this.secondLibrarianName = "Snejana Denisovna";
		//lastIndex = 0;
	}
	public Bookcase openLibrary(int bookcaseNumber, int size){
		
		Bookcase bookcase = new Bookcase(bookcaseNumber, size);//vernet massiv knig
		return bookcase;
	}
	
public Bookcase deletedBookBox(int bookcaseNumber, int size){
		
		Bookcase deletedbooks = new Bookcase(bookcaseNumber, size);//vernet razmer massiva udalennih knig
		return deletedbooks;
	}
	public void addNewBook (Book book, Bookcase bookcase) {
		
		//group.addStudent(student);
		bookcase.addBook(book);
		}
	
//public Book deleteOneBook (Book book, Bookcase deletedbooks) {
		
		//group.addStudent(student);
	//	deletedbooks.deleteBook(book);
	//return book;
	//	}
	
	
public void printListOfBooks(Bookcase bookcase){
	
	Book[] list = bookcase.getBooks();
	
	for (int i = 0; i<list.length; i++){
	
		if(list[i]!=null){
		
			System.out.println(list[i]);
	}
	}

}
public void printListOfDeletedBooks(Bookcase deletedbooks){
	
	Book[] list =deletedbooks.getDeletedBooks();
	
	for (int i = 0; i<list.length; i++){
	
		if(list[i]!=null){
		
			System.out.println(list[i]);
	}
	}

}


/*public void sortBooks(Bookcase bookcase){
	
	Book[] list = bookcase.getBooks();
	//int a = list.length;
	//Book sortedBooks[][] = new 
	for (int i = 0; i<list.length; i++){
	
		if(list[i]!=null){
		
			System.out.println(list[i]);
	}
	}

}*/
}
