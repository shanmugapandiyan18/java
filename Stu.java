class Stu {
    String n;
    int m, s, e, c;

    Stu(String n, int m, int s, int e, int c) {
        this.n = n;
        this.m = m;
        this.s = s;
        this.e = e;
        this.c = c;
    }

    void display() {
        int t = m + s + e + c;
        double a = (t / 400.0) * 100;
        String g;
        if (a > 75) {
            g = "Distinction";
        } else if (a >= 60 && a < 75) {
            g = "First Division";
        } else if (a >= 50 && a < 60) {
            g = "Second Division";
        } else if (a >= 40 && a < 50) {
            g = "Third Division";
        } else {
            g = "Fail";
        }
        System.out.println(n + " Total Marks: " + t);
        System.out.println(n + " Aggregate: " + a + "%");
        System.out.println(n + " Grade: " + g);
    }
}

class StuTest {
    public static void main(String[] args) {
        new Stu("John", 85, 90, 78, 92).display();
    }
}