import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    String registerNumber;
    String name;
    double marks;

    Student(String r, String n, double m) {
        registerNumber = r;
        name = n;
        marks = m;
    }

    void printDetails() {
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student myStudent = new Student("R12345", "John Doe", 85.0);
        myStudent.printDetails();
    }
}