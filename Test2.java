class Student {
    String name;
    int[] marks = new int[6];

    Student(String name, int[] marks) {
        name = name;
        marks = marks;
    }

    int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double getAggregate() {
        return (getTotal() / 600.0) * 100;
    }
}

class GradeCalculator extends Student {
    GradeCalculator(String name, int[] marks) {
        super(name, marks);
    }

    String getGrade() {
        double aggregate = getAggregate();
        if (aggregate > 75) {
            return "Distinction";
        } else if (aggregate >= 60 && aggregate <= 75) {
            return "First Division";
        } else if (aggregate >= 50 && aggregate <= 60) {
            return "Second Division";
        } else if (aggregate >= 40 && aggregate <= 50) {
            return "Third Division";
        } else {
            return "FAIL";
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        int[] marks = {80, 70, 90, 85, 75, 95};
        GradeCalculator student = new GradeCalculator("John Doe", marks);

        System.out.println("Student Name: " + student.name);
        System.out.println("Total: " + student.getTotal());
        System.out.println("Aggregate: " + student.getAggregate() + "%");
        System.out.println("Grade: " + student.getGrade());
    }
}