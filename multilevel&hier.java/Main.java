/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Car{
    void carrace()
    {
        System.out.println("Ready to car race");
    }
}
class Bike extends Car{
    void race()
    {
        System.out.println("Ready to bike race");
    }
}
class Cycle extends Bike
{
    void cyclerace()
    {
        System.out.println("Ready to cycle race");
    }
}
public class Main
{
	public static void main(String[] args) 
	{
// 		Bike bi =new Bike();
// 		bi.race();
		Cycle cy =new Cycle();
		cy.cyclerace();
		cy.race();
		cy.carrace();
	}
}
