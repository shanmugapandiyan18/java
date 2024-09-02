//Argument passing
class Addtest
{
public static void main(String[] args){
	Add obj=new Add();
	obj.get(20,30);
	obj.cal();
	obj.disp();
	}
}
class Add
{
	int a;
	int b;
	int c;
	void get(int x,int y)
	{
		a=x;
		b=y;
	}
	void cal()
	{
		c=a+b;
	}
	void disp(){
		System.out.println("Output= "+c);
	}
}
