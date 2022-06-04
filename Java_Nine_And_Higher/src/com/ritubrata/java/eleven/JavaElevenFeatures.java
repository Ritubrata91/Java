package com.ritubrata.java.eleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaElevenFeatures {

	public static void main(final String[] args) throws IOException {
		final Path path = Paths.get("./resources/sample.txt");
		final String fileContent = Files.readString(path);
		System.out.println(fileContent);


		final Path new_path = Paths.get("./resources/sample_two.txt");
		Files.writeString(new_path, fileContent.concat("jkl"));
	}

}
