class Shape {
    double ra;

    Shape(double r) {
        ra = r;
    }

    double getArea() {
        return 0;
    }

    double getVolume() {
        return 0;
    }
}

class Sphere extends Shape {
    double ra;

    Sphere(double r) {
        ra = r;
    }

    double getArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }
}

class Test {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0);
        System.out.println("Area: " + sphere.getArea());
        System.out.println("Volume: " + sphere.getVolume());
    }
}