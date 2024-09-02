import java.util.*;
class AreaCircle2
{
public static void main(String[] args){
	area obj=new area();
	obj.get();
	obj.cal();
	obj.disp();
	}
}
class area
{
	Scanner s=new Scanner(System.in);
	int r;
	double c;

	void get()
	{
		System.out.println("Enter Radius of circle: ");
		r=s.nextInt();
	}
	void cal()
	{
		c=r*r*3.14;
	}
	void disp(){
		System.out.println("Area of circle= "+c);
	}
}
