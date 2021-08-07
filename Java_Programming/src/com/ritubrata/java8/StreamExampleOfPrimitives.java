package com.ritubrata.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExampleOfPrimitives {
	public static void main(final String[] args) {
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

		//use of max
		System.out.println(Stream.of(1,5,2,3,4,7).max(Integer::compare).get());

		System.out.println(IntStream.range(1, 5).reduce(2, (a,b)-> a+b));

		System.out.println(Stream.generate(()-> "DBOI").limit(10).collect(Collectors.toList()));

		System.out.println( IntStream.range(1, 20)
				.filter(v -> v%4 ==0)
				.filter(v -> v <10)
				.max().getAsInt());

		System.out.println(Arrays.asList(Arrays.asList(1,2), Arrays.asList(5,6))
				.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList()));

		System.out.println(!IntStream.rangeClosed(2, -1/2)
				.anyMatch(i->29%i==0));

	}

}
