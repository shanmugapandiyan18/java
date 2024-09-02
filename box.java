class box{
	double w;
	double h;
	double d;
	void get();
	{
		w=10.5;
		h=20.5;
		d=5.5;
	}
	void vol(){
		double v=w*h*d;
		System.out.println("Volume of the box= "+v);
		}
}
class boxtest{
	public static void main(String [] args){
		box mybox=new box();
		mybox.get();
		mybox.vol();
		}
}