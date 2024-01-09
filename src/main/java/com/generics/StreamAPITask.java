package com.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class StreamAPITask {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        //initializing the array
        String p1 = "Lorem ipsum dolor sit amet consectetur adipiscing elit Sed id lorem non arcu aliquam egestas id ac nulla Ut semper pulvinar interdum Vestibulum quis mi ante";
        String p2 = "Sed vulputate varius sem ut accumsan magna Vestibulum ullamcorper fermentum posuere Nam ac velit leo";
        String p3 = "Donec ultrices orci elit at gravida risus semper eget";
        text.addAll(Arrays.stream(p1.split(" ")).toList());
        text.add(" ");
        text.addAll(Arrays.stream(p2.split(" ")).toList());
        text.add(" ");
        text.addAll(Arrays.stream(p3.split(" ")).toList());
        //length of each element in the list
        text.stream().mapToLong(s -> s.codePoints().count()).forEach(System.out::println);

        //non-empty list elements not containing the character d
        System.out.println();
        text.stream().filter(word -> !word.contains("d"))
                     .filter(Objects::nonNull)
                     .filter(Predicate.not(String::isEmpty)).forEach(System.out::println);

        //list items in alphabetical order
        System.out.println();
        text.stream().sorted().forEach(System.out::println);

    }
}