import java.util.*;
class Addtest2s
{
public static void main(String[] args){
	Add obj=new Add();
	obj.get();
	obj.cal();
	obj.disp();
	}
}
class Add
{
	Scanner s=new Scanner(System.in);
	int a;
	int b;
	int c;
	void get()
	{ 
		System.out.println("Enter the value of A: ");
		a=s.nextInt();
		System.out.println("Enter the value of B: ");
		b=s.nextInt();
	}
	void cal()
	{
		c=a+b;
	}
	void disp(){
		System.out.println("Output= "+c);
	}
}
