package Module_1.Day_13;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public int setGrade(int grade) {
        this.grade = grade;
        return grade;
    }

    @Override
    public int compareTo(Student o) {
//        return this.getName().compareTo(o.getName());
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
