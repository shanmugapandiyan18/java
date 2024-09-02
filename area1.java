class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    double getVolume() {
        return getArea() * height;
    }
}

class area1 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Area of circle: " + cylinder.getArea());
        System.out.println("Volume of cylinder: " + cylinder.getVolume());
    }
}