/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class computer
{
    void display()
    {
        System.out.println("Power is on then we use the computer.");
    }
}
class power
{
    computer com;
    power()
    {
        this.com=new computer();
    }
    void caltocomputer()
    {
        com.display();
    }
}
public class Main
{
	public static void main(String[] args)
	{
		power n=new power();
		n.caltocomputer();
	}
}
