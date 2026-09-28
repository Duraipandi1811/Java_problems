/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Car{
    String address="Chennai";
    Car(int modelno)
    {
        System.out.println("Car Showroom");
        System.out.println("Car modelno "+modelno);
    }
    void open()
    {
        System.out.println("Showroom open 09.00 Am and close 10.00 Pm");
    }
}
class Bike extends Car
{
    String address="Coimbatore";
    Bike()
    {
        super(20);
        System.out.println("Bike showroom");
        System.out.println(address);
        System.out.println(super.address);
        super.open();
    }
}
public class Main
{
	public static void main(String[] args)
	{
		Bike bike=new Bike();
	}
}
