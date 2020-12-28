package day3435Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda10 {

	public static void main(String[] args) throws IOException {

		//Read the text from LambdaFile01
        Files.lines(Paths.get("src/main/java/LambdaFile01")).forEach(System.out::println);
        
        System.out.println("============================");

        //Read the text from LambdaFile01 in upper cases
        Files.lines(Paths.get("src/main/java/LambdaFile01")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("============================");

        //Read just the first row from LambdaFile01 in lower cases
        //1. Way:
        Files.lines(Paths.get("src/main/java/LambdaFile01")).limit(1).map(String::toLowerCase).forEach(System.out::println);
        //2.Way:

        System.out.println(Files.lines(Paths.get("src/main/java/LambdaFile01")).map(String::toLowerCase).findFirst());
        System.out.println("============================");
​
        //Read just the third row from LambdaFile01 in upper cases
        //1. Way:
        Files.lines(Paths.get("src/main/java/LambdaFile01")).skip(2).limit(1).map(String::toUpperCase).forEach(System.out::println);
        //2.Way:
        System.out.println(Files.lines(Paths.get("src/main/java/LambdaFile01")).skip(2).map(String::toUpperCase).findFirst());
​
        System.out.println("============================");
​
        //Find the number of lines which the word "lambda" is used by ignoring cases
        System.out.println(Files.lines(Paths.get("src/main/java/LambdaFile01")).filter(t->t.toLowerCase().contains("lambda")).count());
​
        System.out.println("============================");
​
        //Print all different words from the file in a list
        System.out.println(Files.
                            lines(Paths.get("src/main/java/LambdaFile01")).
                            map(t->t.toLowerCase().replace("_", " ").split(" ")).
                            flatMap(Arrays::stream).
                            map(t->t.replaceAll("\\W", "")).
                            distinct().
                            collect(Collectors.toList()));
​
        System.out.println("============================");
​
        //Count the different words used in the file
        System.out.println(Files.
                                lines(Paths.get("src/main/java/LambdaFile01")).
                                map(t->t.toLowerCase().replace("_", " ").split(" ")).
                                flatMap(Arrays::stream).
                                map(t->t.replaceAll("\\W", "")).
                                distinct().
                                count());
​
        System.out.println("============================");
​
        //Find the number of the word "lambda" used in the file (Ignore cases)
        System.out.println(Files.
                                lines(Paths.get("src/main/java/LambdaFile01")).
                                map(t->t.toLowerCase().replace("_", " ").split(" ")).
                                flatMap(Arrays::stream).
                                map(t->t.replaceAll("\\W", "")).
                                filter(t->t.equals("and")).
                                count());
    }
​
}