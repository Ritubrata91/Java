package com.ritubrata.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExampleOfPrimitives {

	public static boolean isPrime(final int number) {
		return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}
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
		System.out.println(" use of max : " + Stream.of(1,5,2,3,4,7).max(Integer::compare).get());

		System.out.println(" use of reduce : " + IntStream.range(1, 5) //return 1 to 4
		.reduce(6, (a,b)-> a+b));

		System.out.println(" use of limit : " +Stream.generate(()-> "DBOI").limit(10).collect(Collectors.toList()));

		System.out.println( IntStream.range(1, 20)
				.filter(v -> v%4 ==0)
				.filter(v -> v <10)
				.max().getAsInt());

		System.out.println(isPrime(25));

		System.out.println(isPrime(23));

		final List<String> stringList = Arrays.asList( "-1" , "2", "3", "4", "5" );
		final List<Integer> newIntList = stringList.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println(" Convert List<String> to List<Integer> : " + newIntList);

		final List<Integer> intList = Arrays.asList( 1,2,3,4,5 );
		final List<String> newStringList = intList.stream()
				.map(String::valueOf)
				.collect(Collectors.toList());
		System.out.println(" Convert List<Integer> to List<String> : " + newStringList);
	}

}
