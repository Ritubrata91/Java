package com.ritubrata.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas_Related_To_Stream {


	public static void main(final String[] args) {
		//total pages in your book collection
		final Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
				"Ranson", "Riggs", 382, "Film");
		final Book book2 = new Book("Harry Potter and The Sorcerers Stone",
				"JK", "Rowling", 411, "Film");
		final Book book3 = new Book("The Cat in the Hat",
				"Dr", "Seuss", 45, "Comedy");

		final List<Book> bookList = Arrays.asList(book1, book2, book3);

		//use of summingInt
		final int total = bookList.stream()
				.collect(Collectors.summingInt(Book::getPages));
		System.out.println(total);

		//use of count
		System.out.println("no of books having more than 30 pages : " + bookList.stream()
		.filter(book -> book.getPages()>30)	.count());

		//use of findAny
		System.out.println(bookList.stream()
				.filter(e->e.getTitle().contains("The")).findAny());

		//use of groupBy
		final Map<String, List<Book>> map = bookList.stream()
				.collect(Collectors.groupingBy(Book::getCategory));
		map.forEach((category,bookListTemp)->System.out.println("Name: "+category+" ==>"+bookListTemp));

		//use of sorted
		Arrays.asList("red", "green", "blue").stream().sorted()
		.findFirst().ifPresent(System.out::println);

		//example of Stream.of with a filter
		Stream.of("apple", "pear", "banana", "cherry", "apricot")
		.filter(fruit -> fruit.startsWith("a")).forEach(fruit -> System.out.println("Starts with a: " + fruit));

		//use of average
		Arrays.stream(new int[]{1, 2, 3, 4}).map(n -> n * n)
		.average().ifPresent(System.out::println);

		//use of mapToInt and max
		Stream.of(1.5, 2.3, 3.7).mapToInt(Double::intValue)
		.max().ifPresent(System.out::println);



	}




}
