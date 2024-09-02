class S {
    double a;

    void c(int s) {
        a = s * s;
    }

    void c(double l, double w) {
        a = l * w;
    }

    void c(double r) {
        a = Math.PI * r * r;
    }
    }
}

class area {
    public static void main(String[] args) {
        S s = new S();
        s.c(5);
        s.c(4.0, 6.0);
        s.c(3.0);
    }
}