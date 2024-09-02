public class PR {

    static class NegativeNumbersRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Negative numbers from -1 to -9:");
            for (int i = -1; i >= -9; i--) {
                System.out.println(i);
            }
        }
    }

    static class FibonacciRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Fibonacci series up to 10 terms:");
            int n1 = 0, n2 = 1;
            System.out.print(n1 + " " + n2);
            for (int i = 2; i < 10; i++) { 
                int n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        NegativeNumbersRunnable negativeRunnable = new NegativeNumbersRunnable();
        FibonacciRunnable fibonacciRunnable = new FibonacciRunnable();

        Thread negativeThread = new Thread(negativeRunnable);
        Thread fibonacciThread = new Thread(fibonacciRunnable);

        negativeThread.start();
        fibonacciThread.start();
    }
}