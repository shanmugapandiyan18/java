class boxarg{
	double w;
	double h;
	double d;
	void get(double x,double y, double z)
	{
		w=x;
		h=y;
		d=z;
	}
	void vol(){
		double v=w*h*d;
		System.out.format("Volume of the box= %.3f",v);
		}
}
class boxtest2{
	public static void main(String [] args){
		boxarg mybox=new boxarg();
		mybox.get(2.1,3.4,4.3);
		mybox.vol();
		}
}