package Module_1.Day_11;

import java.util.LinkedList;
import java.util.List;

public class LinkedListGetExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("LinkedList: " + list);

        // Getting elements by index
        System.out.println("Element at index 0: " + list.get(0)); // Apple
        System.out.println("Element at index 2: " + list.get(2)); // Cherry
    }
}
