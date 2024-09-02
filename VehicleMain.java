//overriding
class Movable
{
    void move()
    {
        System.out.println("Moving...");
    }
}

interface Drivable
{
    void drive();
}

interface Flyable
{
    void fly();
}

class Vehicle extends Movable implements Drivable, Flyable
{
    public void drive()
    {
        System.out.println("Driving...");
    }
    public void fly()
    {
        System.out.println("Flying...");
    }
}

class VehicleMain
{
    public static void main(String arg[])    
    {
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.drive();
        vehicle.fly();
    }
}