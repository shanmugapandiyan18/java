import java.util.Scanner;

class TriangleTest
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        
        Triangle obj=new Triangle();
        obj.get(base,height);
        obj.cal();
        obj.disp();
    }
}

class Triangle
{
    double base;
    double height;
    double area;
    
    void get(double x,double y)
    {
        base=x;
        height=y;
    }
    void cal()
    {
        area=0.5*base*height;
    }
    void disp(){
        System.out.println("The area of the triangle is: "+area);
    }
}