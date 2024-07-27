import java.util.*;
class Findarray
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int i, find, flag=0;
        System.out.println("enter the array element");
        for(i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter the array value to find");
        find=s.nextInt();
        for(i=0;i<5;i++)
        {
            if(a[i]==find)
            {
                flag=1;
                break; 
            }
        }
        if(flag==1)
        {
            System.out.println(find+"value is present in the array");
            System.out.println(find+" value is present in the "+i+" position");
        }
        else
        {
            System.out.println(find+" value is not present in the array");
        }
    }
}