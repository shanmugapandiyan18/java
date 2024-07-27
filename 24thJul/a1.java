import java.util.Scanner;

class Triangle {
    void calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of the Triangle: " + area);
    }
}

 class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        
        triangle.calculateArea(base, height);
    }
}
