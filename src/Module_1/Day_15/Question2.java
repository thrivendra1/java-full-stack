package Module_1.Day_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
2. Write a program to check whether the Strings in the List are empty or not and print the list having non-empty strings. If the given List is: List strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
 */
public class Question2
{
    public static void main(String[] args) {
        List<String> Values = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyValues= Values.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(nonEmptyValues);
    }
}
