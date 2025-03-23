package Module_1.Day_13;

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {


    }


    public static void predicate() {
        // Predicate -> check an input and returns boolean
        List<Integer> list = Arrays.asList(10, 4, 1, 3, 20);

        Predicate<Integer> predicate = (i) -> i % 2 == 0;
        Predicate<Integer> predicate1 = (i) -> i > 5;


        for (Integer i : list) {
            if (predicate.and(predicate1).test(i)) {
                System.out.println(i);
            }
        }

    }

    public static void function() {
        // Function -> accepts a parameter and returns a parameter
//        Function<Integer, Boolean> function = (i) -> i % 2 == 0;
        Function<Integer, Integer> function = (i) -> i * i;
        Function<Integer, Integer> function1 = (i) -> i / 2;

        System.out.println(function.andThen(function1).apply(10));

    }

    public static void consumer() {
        // consumer -> accepts an input and returns void
        Consumer<Integer> consumer = (i) -> System.out.println(i);
        consumer.accept(10);
    }

    public static void supplier() {
        // supplier -> no input but gives you an output
        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());
    }


}
