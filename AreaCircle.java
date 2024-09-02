class AreaCircle
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
	int r;
	double c;
	void get()
	{
		r=10;
	}
	void cal()
	{
		c=r*r*3.14;
	}
	void disp(){
		System.out.println("Area of circle= "+c);
	}
}
