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
	    Scanner sc= new Scanner(System.in);
	    int x=sc.nextInt();
	    if(x%4==0 && x%100!=0)
	    {
	         System.out.println(x+" It is Leap year");
	    }
	    else if(x%400==0)
	    {
	        System.out.println(x+" It is Leap year");
	    }
	    else if(x%4==0 && x%100==0)
	    {
	        System.out.println(x+" It is not Leap year");
	    }
	    else{
	        System.out.println(x+" It is not Leap year");
	    }
	
	}
}
