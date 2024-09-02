class PalindromeThread extends Thread {
    public void run() {
        try {
            for (int i = 10; i <= 100; i++) {
                int num = i;
                int reverse = 0;
                while (num != 0) {
                    int digit = num % 10;
                    reverse = reverse * 10 + digit;
                    num /= 10;
                }
                if (i == reverse) {
                    System.out.println("Palindrome Number: " + i);
                    Thread.sleep(1000); 
                }
            }
            System.out.println("Exiting Palindrome Thread");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class PrimeThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime && i != 1) {
                    System.out.println("Prime Number: " + i);
                    Thread.sleep(2000);                 }
            }
            System.out.println("Exiting Prime Thread");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class MultithreadTest3 {
    public static void main(String[] args) {
        PalindromeThread palindrome = new PalindromeThread();
        PrimeThread prime = new PrimeThread();
        palindrome.start();
        prime.start();
    }
}