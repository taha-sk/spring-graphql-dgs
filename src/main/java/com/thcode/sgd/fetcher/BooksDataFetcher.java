package com.thcode.sgd.fetcher;

import java.util.List;
import java.util.stream.Collectors;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.thcode.sgd.model.Book;

@DgsComponent
public class BooksDataFetcher {
	
	private final List<Book> books = List.of(
			new Book("Why Nations Fail: The Origins of Power, Prosperity, and Poverty", "Daron Acemoglu", "Profile Books", 2013),
			new Book("Freakonomics", "Steven Levitt", "William Morrow Paperbacks", 2020),
			new Book("Salem's Lot", "Stephen King", "Anchor", 2013),
			new Book("Unfinished Tales of Numenor and Middle-Earth", "J. R. R. Tolkien", "HarperCollins", 2010),
			new Book("1984", "George Orwellg", "Hawk Press", 1994)
	);
	
	@DgsQuery
	public List<Book> books(@InputArgument String titleFilter){
		if (titleFilter == null) {
			return books;
		} else {
			return books.stream().filter(s -> s.getTitle().toLowerCase().contains(titleFilter.toLowerCase())).collect(Collectors.toList());
		}
	}

}
