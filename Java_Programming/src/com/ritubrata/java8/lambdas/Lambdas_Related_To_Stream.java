package com.ritubrata.java8.lambdas;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambdas_Related_To_Stream {


	private static List<Book> useOfSummingInt(final Book book1, final Book book2, final Book book3) {
		final List<Book> books = Arrays.asList(book1, book2, book3);
		final int total = books.stream()
				.collect(Collectors.summingInt(Book::getPages));
		System.out.println(total);
		return books;
	}

	private static void removeDuplicates(final Book book1, final Book book2, final Book book3) {
		//create a list with duplicates
		final List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
		System.out.println("Before removing duplicates: ");
		System.out.println(dupBooks.toString());

		final Collection<Book> noDups = new HashSet<>(dupBooks);
		System.out.println("After removing duplicates: ");
		System.out.println(noDups.toString());
	}

	public static void main(final String[] args) {

		//total pages in your book collection
		final Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
				"Ranson", "Riggs", 382);
		final Book book2 = new Book("Harry Potter and The Sorcerers Stone",
				"JK", "Rowling", 411);
		final Book book3 = new Book("The Cat in the Hat",
				"Dr", "Seuss", 45);

		final List<Book> books = useOfSummingInt(book1, book2, book3);

		removeDuplicates(book1, book2, book3);

		final List<String> list = books.stream()
				.map(Book::getAuthorLName)
				.collect(Collectors.toList());
		System.out.println(list);

		//example of using Set to eliminate dups and sort automatically
		final Set<Integer> numbers = new HashSet<>(asList(4, 3, 3, 3, 2, 1, 1, 1));
		System.out.println(numbers.toString());

		Arrays.asList("red", "green", "blue")
		.stream()
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);

		//example of Stream.of with a filter
		Stream.of("apple", "pear", "banana", "cherry", "apricot")
		.filter(fruit -> fruit.startsWith("a"))
		//if the foreach is removed, nothing will print,
		//the foreach makes it a terminal event
		.forEach(fruit -> System.out.println("Starts with A: " + fruit));

		//using a stream and map operation to create a list of words in caps
		final List<String> collected = Stream.of("Java", " Rocks")
				.map(String::toUpperCase)
				.collect(toList());
		System.out.println(collected.toString());
		IntStream.range(1, 4)
		.forEach(System.out::println);

		//find the average of the numbers squared
		Arrays.stream(new int[]{1, 2, 3, 4})
		.map(n -> n * n)
		.average()
		.ifPresent(System.out::println);

		//map doubles to ints
		Stream.of(1.5, 2.3, 3.7)
		.mapToInt(Double::intValue)
		.forEach(System.out::println);
	}




}
