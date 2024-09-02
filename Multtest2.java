class ArmstrongThread extends Thread
 {
    public void run() 
	{
        for (int i = 1; i <= 1000; i++)
	 {
            int num = i;
            int sum = 0;
            while (num != 0)
	 {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            if (i == sum) {
                System.out.println("Armstrong Number: " + i);
                try	
		 {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
		 {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Exiting Armstrong Thread");
    }
}

class PrimeThread extends Thread 
{
    public void run()
	 {
        for (int i = 1; i <= 1000; i++) 
		{
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) 
			{
                if (i % j == 0)
			 {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i != 1)
		 {
                System.out.println("Prime Number: " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e)
		 {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Exiting Prime Thread");
    }
}

class Multtest2 
{
    public static void main(String[] args) 
	{
        ArmstrongThread armstrong = new ArmstrongThread();
        PrimeThread prime = new PrimeThread();
        armstrong.start();
        prime.start();
    }
}