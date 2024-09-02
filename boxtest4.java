import java.util.*;
class boxinput
	{
        Scanner sc=new Scanner(System.in);
	double w;
	double h;
	double d;
	void get()
		{
                System.out.println("enter the width of the box =");
		w=sc.nextDouble();
		System.out.println("enter the height of the box =");
		h=sc.nextDouble();
		System.out.println("enter the depth of the box =");
		d=sc.nextDouble();
		}
	void vol()
		{
		double v=w*h*d;
		System.out.format("Volume of the box= %.3f :",v);
		}
	
	}
class boxtest4{
	public static void main(String [] args){
		boxinput mybox=new boxinput();
		boxinput mybox1=new boxinput();
		mybox.get();
		mybox.vol();
		mybox1.get();
		mybox1.vol();
		}
}
F = (9/5 × C) + 32