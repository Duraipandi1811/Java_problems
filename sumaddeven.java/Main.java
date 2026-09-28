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
	   // int x=n;
	    int t;
	    int sumeven=0,sumodd=0;
	    while(n!=0)
	    {
	        t=n%10;
	        if(t%2==0)
	        {
	           sumeven=sumeven+t; 
	        }
	        else{
	            sumodd=sumodd+t;
	        }
	        n=n/10;
	    }
	    if(sumeven==sumodd)
	    {
	        System.out.println("Yes");
	    }
	    else{
	         System.out.println("No");
	    }
		
	}
}
