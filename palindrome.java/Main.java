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
		int sr=sc.nextInt();
		int er=sc.nextInt();
	    int n=sc.nextInt();
	    int x=n;
	    int t;
	    int sum=0;
	    while(n!=0)
	    {
	        t=n%10;
	        sum=sum*10+t;
	        n=n/10;
	        
	    }
	if(x==sum)
	{
	    System.out.println("yes palindrome");
	    
	}
	else
	{
	    System.out.println("No palindrome");
	    
	}
}
}