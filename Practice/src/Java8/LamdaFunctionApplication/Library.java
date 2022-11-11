package Java8.LamdaFunctionApplication;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Library {
	public static void main(String[] args) {
		System.out.println(Sorting());
	}
	
	
	
	 public static ArrayList<Book> Sorting() {
		 ArrayList<Book> booksList = new ArrayList<Book>();
			booksList.add(new Book(101,"Java","Educational"));
			booksList.add(new Book(301,"Python","Language"));
			booksList.add(new Book(3015,"Angular","IDk"));

		 Collections.sort(booksList, (b1, b2)-> b1.getBookName().compareTo(b2.getBookName()));
	return booksList;	 
	 
	 }

}
