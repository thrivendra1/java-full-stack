package Module_1.Day_13;

import java.util.*;

public class ddd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, 1, 3, 20);
        List<Integer> evenList = list.stream()
                .filter(i -> i % 2 == 0)  // Keeps only even numbers: [10, 4, 20]
                .peek(i -> System.out.println("from filter " + i))

                .map(i -> i * i)          // Squares each element: [100, 16, 400]
                .peek(i -> System.out.println("from map " + i))

                .map(i -> i / 2)          // Divides each element by 2: [50, 8, 200]

                .sorted((o1, o2) -> o2.compareTo(o1))  // Descending order: [200, 50, 8]
                .peek(i -> System.out.println("from sorted " + i))

                .toList();  // Converts to a list (Java 16+)

        evenList.forEach(i -> System.out.println(i)); // Prints final list elements


        System.out.println(evenList);

    }
}
