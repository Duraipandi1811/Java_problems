/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=0,b=1;
	    int c=0;
	    if(n==0 || n==1)
	    {
	        System.out.println("It present in fib");
	    }
	    for(int i=2; i<=n; i++)
	    {
	        c=a+b;
	        if(c==n)
	        {
	            System.out.println("It present in fib");
	        }
	        a=b;
	        b=c;
	    }
	    if(c!=n)
	    {
	        System.out.println("It not present in Fib");
	    }
		
	}
}
