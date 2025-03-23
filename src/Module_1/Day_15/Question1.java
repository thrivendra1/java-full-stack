package Module_1.Day_15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
1.Write a program using map( ) method, to convert a list of Strings into uppercase. If the given List is: Stream names = Stream.of("aBc", "d", "ef");
 */
public class Question1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");

        List<String> uppercaseNames = names
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);
    }
}
