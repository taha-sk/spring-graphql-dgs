package com.thcode.sgd.model;

public class Book {
	
	private final String title;
	private final String author;
	private final String publisher;
	private final Integer publicationYear;
	
	public Book(String title, String author, String publisher, Integer publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public Integer getPublicationYear() {
		return publicationYear;
	}
	
}
