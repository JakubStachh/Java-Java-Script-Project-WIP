# 📚 Student Management System

## 📜 Overview

The **Student Management System** is designed to manage a list of students and their enrolled courses. The system supports the following features:
- **Adding Students** to the database.
- **Adding and Removing Courses** for students.
- **Displaying Student Information**, including the courses they are enrolled in.

---

## ✨ Features

- **➕ Add Student**: Allows you to add a new student with a roll number and name.
- **📚 Add Course**: Enroll a student in a new course.
- **📝 Remove Course**: Remove a course from a student's list of courses.
- **🔍 Display Info**: View the student's roll number, name, and courses they are enrolled in.

---

## 🛠 Components

### **Student.java**:
The `Student` class represents an individual student with a roll number, name, and a list of courses they are enrolled in. It provides methods to add courses, remove courses, and display student information.

```java
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
StudentManagementSystem.java:
The StudentManagementSystem class manages the student database using a HashMap where the key is the student's roll number, and the value is the Student object. It provides methods to add students and retrieve them by their roll number.

java
Copy
Edit
import java.util.*;

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
        // Add a new student
        addStudent(1, "John Doe");

        // Retrieve and manage the student
        Student student = getStudent(1);

        // Add courses for the student
        student.addCourse("Mathematics");
        student.addCourse("Computer Science");

        // Display the student information
        student.displayInfo();
    }
}
⚙️ How It Works
➕ Add Student: You can add a student by calling the addStudent method, providing the student's roll number and name.

java
Copy
Edit
addStudent(1, "John Doe");
📚 Add Course: A student can be enrolled in one or more courses using the addCourse method.

java
Copy
Edit
student.addCourse("Mathematics");
student.addCourse("Computer Science");
📝 Remove Course: If necessary, a course can be removed from the student's list by using the removeCourse method.

java
Copy
Edit
student.removeCourse("Computer Science");
🔍 Display Info: To view a student's details, including their enrolled courses, you can use the displayInfo method.

java
Copy
Edit
student.displayInfo();
📝 Example Usage
1. Adding Students:
Student 1: John Doe (Roll Number: 1)

2. Adding Courses:
John Doe is enrolled in Mathematics and Computer Science.

3. Displaying Student Information:
John Doe’s information will be displayed:

yaml
Copy
Edit
Roll Number: 1
Name: John Doe
Courses: Mathematics, Computer Science
