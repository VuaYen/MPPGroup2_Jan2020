package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
	List<Author> authors = new ArrayList<>();
	List<BookCopy> bookcopys = new ArrayList<>();
	private String title;
	private String iSBN;
	private int status; // 1 available 
	
	public Book( String iSBN,String title,  int status,List<Author> authors) {
		this.authors = authors;
		this.title = title;
		this.iSBN = iSBN;
		this.status = status;
	}

	public Book( String iSBN,String title,List<Author> authors, List<BookCopy> bookcopys,  int status) {
		this.authors = authors;
		this.bookcopys = bookcopys;
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
