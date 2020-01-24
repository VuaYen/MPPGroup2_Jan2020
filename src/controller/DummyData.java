package controller;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Address;
import model.Author;
import model.Book;
import model.BookCopy;
import model.Member;
import model.Role;
import model.User;

public final class DummyData {
	static ObservableList<User> users = FXCollections.observableArrayList();
	static {
		users.add(new User("John","Mathew","012345667","john@gmail.com","admin","123",Role.ADMIN));
		users.add(new User("May","Mathew","012345667","may@gmail.com","librarian","123",Role.LIBRARIAN));
		users.add(new User("Luiz","Mathew","012345667","may@gmail.com","ladin","123",Role.BOTH));
	}
	
	//data address
	static ObservableList<Address> addresses = FXCollections.observableArrayList();
	static 
		{
		addresses.add(new Address("101 S. Main", "Fairfield", "IA", "52556"));
		addresses.add(new Address("51 S. George", "Georgetown", "MI", "65434"));
		addresses.add(new Address("23 Headley Ave", "Seville", "Georgia", "41234"));
		addresses.add(new Address("1 N. Baton", "Baton Rouge", "LA", "33556"));
		addresses.add(new Address("5001 Venice Dr.", "Los Angeles", "CA", "93736"));
		addresses.add(new Address("1435 Channing Ave", "Palo Alto", "CA", "94301"));
		addresses.add(new Address("42 Dogwood Dr.", "Fairfield", "IA", "52556"));
		addresses.add(new Address("501 Central", "Mountain View", "CA", "94707"));
		}
	
	//data authors
	static ObservableList<Author> allAuthors = FXCollections.observableArrayList();
	static {
		allAuthors.add(new Author("Joe", "Thomas", "641-445-2123", addresses.get(0), "A happy man is he."));
		allAuthors.add(new Author("Sandra", "Thomas", "641-445-2123", addresses.get(0), "A happy wife is she."));
		allAuthors.add(new Author("Nirmal", "Pugh", "641-919-3223", addresses.get(1), "Thinker of thoughts."));
		allAuthors.add(new Author("Andrew", "Cleveland", "976-445-2232", addresses.get(2), "Author of childrens' books."));
		allAuthors.add(new Author("Sarah", "Connor", "123-422-2663", addresses.get(3), "Known for her clever style."));
		}
	//data member
	static ObservableList<Member> members =FXCollections.observableArrayList();
	static {
	members.add( new Member(1001, "Andy", "Rogers", "641-223-2211", addresses.get(4)));
	members.add( new Member(1002, "Drew", "Stevens", "702-998-2414", addresses.get(5)));
	members.add( new Member(1003, "Sarah", "Eagleton", "451-234-8811", addresses.get(6)));
	members.add( new Member(1004, "Ricardo", "Montalbahn", "641-472-2871", addresses.get(7)));
	}

	// data for Book
	static ObservableList<Book> books =FXCollections.observableArrayList();
	static {
		books.add(new Book("23-11451", "The Big Fish", 1, Arrays.asList(allAuthors.get(0), allAuthors.get(1))));
		books.add(new Book("28-12331", "Antartica", 1, Arrays.asList(allAuthors.get(2))));
		books.add(new Book("99-22223", "Thinking Java", 1, Arrays.asList(allAuthors.get(3))));
		books.add(new Book("48-56882", "Jimmy's First Day of School", 1, Arrays.asList(allAuthors.get(4))));		
	
	}
	// data for BookCopy
		static ObservableList<BookCopy> bookcopylist =FXCollections.observableArrayList();
		static {
			bookcopylist.add(new BookCopy(books.get(0),110));
			bookcopylist.add(new BookCopy(books.get(0),111));
			bookcopylist.add(new BookCopy(books.get(0),112));
			bookcopylist.add(new BookCopy(books.get(0),113));
			bookcopylist.add(new BookCopy(books.get(0),114));
		
		}
		
	public static Book getBook(String isbn) {
		for (Book b : books) {
			if (b.getiSBN().contains(isbn) ) {
				return b;
			}
		}
		return null;
	}
	
	public static Author getAuthor(String name) {
		for (Author b : allAuthors) {
			if (b.getFirstName().contains(name) ) {
				return b;
			}
		}
		return null;
	}

	public static void addBook(String issn,String title, String author) {
		
		Book book = new Book(issn, title,1,null);
		books.add(book);
	}

	public static void deleteBook(Book book) {
		books.remove(book);
	}
	
	public static Book getBookByCopyNO(int copyId) {
		for (BookCopy c : bookcopylist) {
			if (c.getcopyNO() == copyId) {
				return c.getBook();
			}
		}
		return null;
	}

	/*
	 * public static void addBookCopy(int bookId) { bookCopyData.add(new
	 * BookCopy(bookId, bookCopyAutoIncrement++)); }
	 */

	public static int getBookCopyNum(int bookId) {
		int count = 0;
		for (BookCopy c : bookcopylist) {
			if (c.getcopyNO() == bookId)
				count++;
		}
		return count;
	}

	
}
 