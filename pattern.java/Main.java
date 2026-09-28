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
	    for(int i=0; i<=n; i++)
	    {
	        for(int j=1; j<=i; j++)
	        {
	            if(j==n)
	            {
	                System.out.println(j);
	            }else{
	                System.out.print(j +" ");
	            }
	            
	        }
	        System.out.println();
	    }
		
	}
}
