/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Parent
{
    Parent(String name)
    {
        System.out.println("Hi I am "+name);
    }
}
class Child extends Parent
{
    Child(String name)
    {
        super("Super class");
        System.out.println("Hi I am "+name);
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    Child c=new Child("Sub class");
	}
}
