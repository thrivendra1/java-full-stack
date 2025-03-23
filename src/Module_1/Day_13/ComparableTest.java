package Module_1.Day_13;

import java.util.*;
import java.util.Comparator;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Student s1 = new Student("john", 18, 9);
        Student s2 = new Student("peter", 20, 8);
        Student s3 = new Student("zack", 10, 7);

        List<Student> list = Arrays.asList(s1, s2, s3);
        System.out.println(list);

//        Comparator<Student> comparator = (o1, o2) -> o1.getAge() - o2.getAge();



        list.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(list);
        System.out.println("-----------------------------------------------");

        Comparator<Student> granscomputer=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };
        list.sort(granscomputer);
        System.out.println(list);

//        System.out.println(new AgeComparator());

    }
}

// comparable -> compareTo -> multi values we cannot compare bc only 1 method -> comparator
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}

class GradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGrade() - o2.getGrade();
    }
}
