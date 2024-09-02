class Bank {
    String name;
    double rate;
    double principal;
    int years;

    Bank(String n, double r, double p, int y) {
        name = n;
        rate = r;
        principal = p;
        years = y;
    }

    void dis() {
        double interest = principal * rate / 100 * years;
        System.out.println( name+" Interest rate: "+interest);
    }
}

class banktest {
    public static void main(String[] args) {
        new Bank("ICICI", 8.4, 1000000, 2).dis();
        new Bank("SBI", 7.3, 1000000, 2).dis();
        new Bank("Axis", 9.7, 1000000, 2).dis();
    }
}	