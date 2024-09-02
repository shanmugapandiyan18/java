class NegativeNumbersThread extends Thread {
    public void run() {
        for (int i = -1; i >= -9; i--) {
            System.out.println("Negative Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Exiting NegativeNumbersThread");
    }
}

class FibonacciThread extends Thread {
    public void run() {
        int n1 = 0, n2 = 1;
        for (int i = 0; i < 9; i++) {
            System.out.println("Fibonacci Number: " + n1);
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Exiting FibonacciThread");
    }
}

public class Multt2 {
    public static void main(String[] args) {
        NegativeNumbersThread negativeThread = new NegativeNumbersThread();
        FibonacciThread fibonacciThread = new FibonacciThread();
        negativeThread.start();
        fibonacciThread.start();
    }
}