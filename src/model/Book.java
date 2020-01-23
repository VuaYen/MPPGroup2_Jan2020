package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
	List<Author> authors = new ArrayList<>();
	List<BookCopy> bookcopys = new ArrayList<>();
	private String title;
	private String iSBN;
	private int status;

}
