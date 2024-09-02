//overriding
abstract class Shape
{
    double area, volume;
    abstract void calculateArea();
    abstract void calculateVolume();
}

class Sphere extends Shape
{
    double radius;
    void getRadius(double r)
    {
        radius = r;
    }
    void calculateArea()
    {
        area = 4 * Math.PI * radius * radius;
        System.out.println("Area of Sphere : " + area);
    }
    void calculateVolume()
    {
        volume = (4/3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere : " + volume);
    }
}

class Cone extends Shape
{
    double radius, height;
    void getRadiusHeight(double r, double h)
    {
        radius = r;
        height = h;
    }
    void calculateArea()
    {
        area = Math.PI * radius * (radius + Math.sqrt(height*height + radius*radius));
        System.out.println("Area of Cone : " + area);
    }
    void calculateVolume()
    {
        volume = (1/3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone : " + volume);
    }
}

class Cylinder extends Shape
{
    double radius, height;
    void getRadiusHeight(double r, double h)
    {
        radius = r;
        height = h;
    }
    void calculateArea()
    {
        area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Area of Cylinder : " + area);
    }
    void calculateVolume()
    {
        volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder : " + volume);
    }
}

class ShapeMain
{
    public static void main(String arg[])    
    {
        Sphere sphere = new Sphere();
        sphere.getRadius(5);
        sphere.calculateArea();
        sphere.calculateVolume();

        Cone cone = new Cone();
        cone.getRadiusHeight(3, 7);
        cone.calculateArea();
        cone.calculateVolume();

        Cylinder cylinder = new Cylinder();
        cylinder.getRadiusHeight(2, 10);
        cylinder.calculateArea();
        cylinder.calculateVolume();
    }
}