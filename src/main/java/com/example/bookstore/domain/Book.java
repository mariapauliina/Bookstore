package com.example.bookstore.domain;

public class Book {
String title, author,ISBN;
double price;
int publicationYear;
	public Book(String title, String author, String ISBN, double price, int publicationYear) {
	
	}
	
	public Book() {
		super();
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		this.publicationYear = publicationYear;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price
				+ ", publicationYear=" + publicationYear + "]";
	}

}
