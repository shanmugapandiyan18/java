import java.util.*;
class boxinput
	{
        Scanner sc=new Scanner(System.in);
	double w;
	double h;
	double d;
	boxinput(double x,double y,double z)
		{
		w=x;
		h=y;
		d=z;
		}
	void vol()
		{
		double v=w*h*d;
		System.out.format("Volume of the box= %.3f :",v);
		}
	
	}
class boxtest6{
	public static void main(String [] args){
		boxinput mybox=new boxinput(20.5,10.5,4.5);		
		mybox.vol();
		}
}