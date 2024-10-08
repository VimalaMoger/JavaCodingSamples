package java8.collection;

import model.sortBookData.Book;
import java.util.Set;
import java.util.TreeSet;

public class AscendingBookYearOrTitle {
	private static void treeSetDemo() {
		Book book1 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book2 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book3 = new Book("Walden", "Henry David Thoreau", 1854);
		Book book4 = new Book("Effective Java", "Joshua Bloch", 2001);
		Book book5 = new Book("The Last Lecture", "Randy Pausch", 2008);
		Book newBook = new Book();
		Set<Book> books = new TreeSet<>(newBook.new PubDateCompartors().new PubDateAscComparator());
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);

		for (Book book : books) {
			System.out.println(book);
		}
	}
	public static void main(String[] args) {
		treeSetDemo();//new TitleComparator());
	}
}
