import java.util.*;

class Student {
    private int rollNumber;
    private String name;
    private List<String> courses;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Courses: " + String.join(", ", courses));
    }
}

public class StudentManagementSystem {
    private static Map<Integer, Student> studentDatabase = new HashMap<>();

    public static void addStudent(int rollNumber, String name) {
        Student student = new Student(rollNumber, name);
        studentDatabase.put(rollNumber, student);
    }

    public static Student getStudent(int rollNumber) {
        return studentDatabase.get(rollNumber);
    }

    public static void main(String[] args) {
        addStudent(1, "Joe Momma");
        Student student = getStudent(1);
        student.addCourse("Mathematics");
        student.addCourse("Computer Science");
        student.displayInfo();
    }
}
