import java.util.*;
class box
	{
        Scanner sc=new Scanner(System.in);
	double c;
        int choise(){

	void get()
		{
                System.out.println("Enter Celcius=");
		c=sc.nextDouble();
		}
	void vol()
		{
		double f = (c*9/5)+32 ;
		System.out.format("Celsius to Fahreinhet= %.3f :",f);
		}
	
	}
class cf{
	public static void main(String [] args){
		box mybox=new box();
		box mybox1=new box();
		mybox.get();
		mybox.vol();
		}
}
