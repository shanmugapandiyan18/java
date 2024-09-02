import java.util.*;
class fah
	{
        Scanner sc=new Scanner(System.in);
	double c;
        }

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
	void vol2(){
	 
			double c = (f-32)*5/9 ;
		System.out.format("Fahreinhet to Celsius= %.3f :",f);
	}
}
class cf2{
	public static void main(String [] args){
	    int ch;
	    ch=1;
	    fah mybox=new fah();
	    if(ch==1)
	    {
	    mybox.get();
		mybox.vol();
	    }
	 	if(ch==2)
	    {
	    mybox.get();
		mybox.vol2();
	    }
	}
}