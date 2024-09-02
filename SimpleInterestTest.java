class SimpleInterestTest
{
    public static void main(String[] args){
        SimpleInterest obj=new SimpleInterest();
        obj.get(10000,5,2);
        obj.cal();
        obj.disp();
    }
}

class SimpleInterest
{
    double principal;
    double rate;
    double time;
    double interest;
    
    void get(double x,double y,double z)
    {
        principal=x;
        rate=y;
        time=z;
    }
    void cal()
    {
        interest=(principal*rate*time)/100;
    }
    void disp(){
        System.out.println("The simple interest is: "+interest);
    }
}