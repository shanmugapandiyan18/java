class MT {
    void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    void printTables(int n1, int n2, int n3) {
        printTable(n1);
        System.out.println();
        printTable(n2);
        System.out.println();
        printTable(n3);
    }
}

class MTTest {
    public static void main(String[] args) {
        new MT().printTable(3);
        new MT().printTables(7, 9, 3);
    }
}