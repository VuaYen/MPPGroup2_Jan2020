package model;


public class BookCopy {

	private int copyNO;
	private boolean status;
	private Book book;
	private CheckOutEntries chekout;

	public CheckOutEntries getChekout() {
		return chekout;
	}
	public void setChekout(CheckOutEntries chekout) {
		this.chekout = chekout;
	}
	
	
	BookCopy(Book book, int copyNO, boolean status) {
		this.book = book;
		this.copyNO = copyNO;
		this.status = status;
	}
	
	public BookCopy(Book book, int copyNO) {
		this.book = book;
		this.copyNO = copyNO;
		this.status =true;
	}
	
	
	public boolean getStatus() {
		return status;
	}
	

	public int getcopyNO() {
		return copyNO;
	}
	
	public Book getBook() {
		return book;
	}
	
	public void changeAvailability() {
		status = !status;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof BookCopy)) return false;
		BookCopy copy = (BookCopy)ob;
		return copy.book.getiSBN().equals(book.getiSBN()) && copy.copyNO == copyNO;
	}
	

}