import java.util.*;

class Rectangle {
    Scanner sc = new Scanner(System.in);
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double a = length * width;
        System.out.format("Area of the rectangle = %.3f", a);
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(10.5, 5.5);
        myRectangle.area();
    }
}