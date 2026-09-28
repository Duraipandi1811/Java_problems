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
	    int arr[]=new int [n];
	    int sum=0;
	    int max=Integer.MIN_VALUE;
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	        sum=sum+arr[i];
	        max=Math.max(sum,max);
	        if(sum<0)
	        {
	            sum=0;
	        }
	    }
	    System.out.println(max);
	}
}
