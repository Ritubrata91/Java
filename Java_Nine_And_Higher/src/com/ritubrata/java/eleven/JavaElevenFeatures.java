package com.ritubrata.java.eleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class JavaElevenFeatures {

	public static void main(final String[] args) throws IOException {
		//fileReadWrite();
		predicateNotMethod();
	}

	private static void fileReadWrite() throws IOException {
		final Path path = Paths.get("./resources/sample.txt");
		final String fileContent = Files.readString(path);
		System.out.println(fileContent);

		final Path new_path = Paths.get("./resources/sample_two.txt");
		Files.writeString(new_path, fileContent.concat("jkl"));
	}

	private static void predicateNotMethod() throws IOException {
		final List<Integer> list = List.of(2,3,4,56,45,76,97);
		list.stream().filter(Predicate.not(n->n%2==0)).forEach(System.out::println);
	}

}
