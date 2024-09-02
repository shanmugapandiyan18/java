class A
{
int a,b,c;
void get(int x)
{
a=x;
b=x;
}
void cal()
{
c=a+b;
System.out.println("Addition1 : "+c);
}
}
class B extends A
{
int d,e;
void get(int z)
{
super.get(z);
d=z;
}
void cal ()
{
super.cal();
e=a+b+c+d;
System.out.println("Addition2 : "+e);
}
}
class AB
{ 
public static void main(String arg [])
{
B obj=new B();
obj.get(10);
obj.cal();
}
}