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
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0; i<arr.length-1; i++)
	    {
	        for(int j=0; j<n-i-1; j++)
	        {
	            if(arr[j]>arr[j+1])
	            {
	                int t=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=t;
	            }
	        }
	    }
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}
