import java.util.Scanner;

class SimpleInterest {
    void calculateInterest(double principal, double rate, int time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleInterest si = new SimpleInterest();
        
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period in years: ");
        int time = sc.nextInt();
        
        si.calculateInterest(principal, rate, time);
    }
}
