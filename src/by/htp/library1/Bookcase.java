package by.htp.library1;
import java.util.Arrays;
public class Bookcase {
	
	
	private Book[] books;
	public Book[] deletedbooks;
//private WriterOfBook[] writers;
private int lastIndex;
private int number;

public Bookcase(int number, int size){
	lastIndex = 0;
	this.number = number;
	books = new Book[size];
	deletedbooks = new Book[size];
	//sozdali massive, razmernost'u, kotoruu my peradadim v size
}
public void addBook(Book book){ // dobavlyaem knigu v knigo-hranilische
	books[lastIndex] = book; 
	lastIndex++;
	
}
public void deleteOneBook(){
books[3] = null;
for(int i = 0; i<books.length; i++){
	if (books[i]!=null){
		deletedbooks[i]=books[i];
	}
	
}
	
}
public Book[] getBooks(){
	return books;
}


public Book[] getDeletedBooks(){
	return deletedbooks;
}

}
