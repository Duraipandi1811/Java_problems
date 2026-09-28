/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args)
	{
	    
		try {
		    throw new task("Null Pointer");
		    
		}
		catch(Exception e)
		{
		    System.out.print(e);
		}
	}

}
 class task extends Exception
{
    task(String s)
    {
         super(s);
    }
   
}

