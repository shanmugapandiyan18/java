import java.util.*;
class ArrayTest1
{
    public static void main(String arg[])
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array values");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("the array value are");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}