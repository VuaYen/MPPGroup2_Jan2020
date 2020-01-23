package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
	List<Author> authors = new ArrayList<>();
	List<BookCopy> bookcopys = new ArrayList<>();
	private String title;
	private String iSBN;
	private int status;
	
	public Book( String title, String iSBN, int status) {
		
		this.title = title;
		this.iSBN = iSBN;
		this.status = status;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<BookCopy> getBookcopys() {
		return bookcopys;
	}

	public void setBookcopys(List<BookCopy> bookcopys) {
		this.bookcopys = bookcopys;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
