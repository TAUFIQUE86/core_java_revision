package Bikes;

abstract class Vehicle
{
abstract void start();
}

class Car extends Bike{
void start()
{
System.out.println(" Car Engine starts");
}
}

public class Main1{
public static void main(String args[]){
Car c1 = new Car();
c1.start();
}
}