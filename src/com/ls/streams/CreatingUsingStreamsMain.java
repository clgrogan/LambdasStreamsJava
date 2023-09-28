package com.ls.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingUsingStreamsMain {
	public static void main(String args[]) {

		Integer[] scores = { 80, 50, 77, 205, 6 };
		Stream<Integer> scoresStream = Arrays.stream(scores);

		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("milk");
		shoppingList.add("biscuits");
		shoppingList.add("taco kit");
		shoppingList.add("Tacis Fuego");
		shoppingList.add("spaghetti");
		shoppingList.add("tri-color rotini");
		shoppingList.add("whole grain bread");
		shoppingList.add("coffee");

		Stream<String> shoppingListStream = shoppingList.stream();
		Stream<String> sls2 = shoppingList.stream();
		Stream<String> sls3 = shoppingList.stream();
		System.out.println("shoppingListStream, sls2, sls3:\n\t\t\t" + shoppingList.toString());
		
		System.out.println("\tshoppingListStream.sorted().forEach(e -> System.out.println(e));");
		shoppingListStream.sorted().forEach(e -> System.out.println("\t\t" + e));

		System.out.println("\tsls2.map( e -> e.toUpperCase()).forEach(e -> System.out.println(\"\\t\" + e));");
		sls2.map( e -> e.toUpperCase()).forEach(e -> System.out.println("\t\t" + e));

		System.out.println("\tsls3.filter( e -> (startsWith(\"t\") || e.charAt(0) == 'T')).forEach(e -> System.out.println(\"\\t\\t\" + e));");
		sls3.filter( e -> (e.startsWith("t") || e.charAt(0) == 'T')).forEach(e -> System.out.println("\t\t" + e));
		
		System.out.println("\nAssigning the stream to a variable is not typical.\nUsually you stream a List or an Array and work with it directly.\n\tStreams are intended for one time use, as above it makes for a lot of repetion to assign a stream to a var.");
		System.out.println("\nshoppingList: " + shoppingList.toString());
		shoppingList.stream().sorted().forEach(e -> System.out.println("\t\t" + e));
		
		List<String> slListUpperCase = shoppingList.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		System.out.println("\nUsing stream does not change the underlying list");
		System.out.println("		List<String> slListUpperCase = shoppingList.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());");
		System.out.println("slListUpperCase: " + slListUpperCase);
		System.out.println("\nshoppingList: " + shoppingList);
		
		Stream<String> lettersStream = Stream.of("C", "O", "V", "E", "N");
		
		lettersStream.map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));
		
		Integer totalOfScores = scoresStream.reduce(0, (e1,e2) -> e1+e2);
		System.out.println("totalOfScores = "+ totalOfScores);


	}
}
