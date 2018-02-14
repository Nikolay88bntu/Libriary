package by.htp.library1;
import java.util.*;
import java.util.Comparator;
public class Book implements Comparable<Book> {
	
private String titleOfBook;
private String writerOfBook;
private int yearOfPublishing;
private int numberOfPages;

public Book(String titleOfBook, String writerOfBook,
		int yearOfPublishing, int numberOfPages){ // konstruktor
	
	this.titleOfBook = titleOfBook;
	this.yearOfPublishing = yearOfPublishing;
	this.numberOfPages = numberOfPages;
	this.writerOfBook = writerOfBook;
	
	}
public String getTitleOfBook(){
	return titleOfBook;
}

public String getWriterOfBook(){
	return writerOfBook;
}
public String toString(){ // mozhno bylo napisat' svoy metod tipa public String printInfo
	return "Title: " + titleOfBook +  " Writer: " + writerOfBook + " Published in: " + yearOfPublishing + " Pages: " +numberOfPages;
}


/*public int compareTo(Book book)
{
  Book tmp = (Book)book;
  if(this.yearOfPublishing < tmp.yearOfPublishing)
  {
    /* текущее меньше полученного */
  //  return -1;
 // }   
 // else if(this.yearOfPublishing > tmp.yearOfPublishing)
 // {
    /* текущее больше полученного */
 //   return 1;
 // }
  /* текущее равно полученному */
 // return 0;  
//}
//
public int compareTo (Book book){
 return (this.yearOfPublishing - book.yearOfPublishing);
}
}

