import java.util.*;
class boxinput
	{
        Scanner sc=new Scanner(System.in);
	double w;
	double h;
	double d;
	boxinput()
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
class boxtest5{
	public static void main(String [] args){
		boxinput mybox=new boxinput();		
		mybox.vol();
		}
}