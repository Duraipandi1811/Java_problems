/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int a=x,t;
	    int b=y;
	    while(b!=0)
	    {
	        t=b;
	        b=a%b;
	        a=t;
	    }
	    int gcd=a;
		System.out.println("GCD of ("+a+","+b+")");
		int n=x*y;
		int lcm=n/gcd;
		System.out.println("LCM of ("+a+","+b+") "+lcm);
	}
}
