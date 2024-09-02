class Overload{
    void displayMessage() {
        System.out.println("Welcome to Java");
    }

    void displayMessage(String message) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Welcome to "+message);
        }
    }

    void displayMessage(String message, int c) {
        for (int i = 0; i < c; i++) {
            System.out.println("Welcome to "+message);
        }
    }

}
class print{
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.displayMessage();
        ob.displayMessage("Polymorphism");
        ob.displayMessage("Overloading", 3);
    }
}