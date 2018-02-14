package by.htp.library1;

public class DeletedBooks {
	
	private Book[] deletedBooks;
	private int lastIndex;
	//deletedbooks = new Book[size];
	

	public DeletedBooks(int bookcaseNumber, int size){
		
		lastIndex = 0;
		deletedBooks = new Book[size];//sozdali massive, razmernost'u, kotoruu my peradadim v size
	}
	
}
