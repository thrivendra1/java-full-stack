package Module_1.Day_15;

import java.util.Arrays;
import java.util.List;
/*
3. You are a teacher in school. In your class there are 10 students, you have decided to give special gifts to those students whose names start with “A”. You are asked to separate those students with the help of a Java program.
Requirement:
Use List interface to store the student name
Use a lambda expression and the Stream API to filter the students

 */

public class Question3 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Ava");

        // Filtering students whose names start with "A"
        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        // Printing
        System.out.println("Students receiving special gifts: " + studentsWithA);
    }
}
