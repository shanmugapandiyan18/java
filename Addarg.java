class test
{
	int a,b,c,d;
	test(int x,int y,int z){
	a=x;
	b=y;
	c=z;
	}
	void cal()
	{
		d=a+b+c;
	}
	void disp(){
		System.out.println("Output= "+d);
	}
}
class Addarg
{
public static void main(String[] args){
	test obj=new test(5,12,24);
	obj.cal();
	obj.disp();
	}
}
