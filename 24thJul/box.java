class box
{
    double w,h,d;

    void get()
    {
        w=10.5;
        h=20.5;
        d=5.5;
    }
    void volume()
    {
        double vo=w*h*d;
        System.out.println("Volume of Box = "+vo);
    }
}
class BoxOOP
    {
        public static void main(String[] args)
        {
              box obj=new box();
              obj.get();
              obj.volume();
        }
}
