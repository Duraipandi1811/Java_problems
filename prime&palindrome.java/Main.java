/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static boolean prime(int n)
		{
		    int c=0;
		    for(int j=1;j<=n; j++)
		    {
		        if(n%j==0)
		        {
		            c++;
		        }
		    }
		    if(c==2)
		    {
		      return true;   
		    }
		    else
		    {
		      return false;
		    }
		}
		public static boolean palindrome(int n)
		{
		    int sum=0,t;
		    int orgn=n;
		    while(orgn!=0)
		    {
		        t=orgn%10;
		        sum=(sum*10)+t;
		        orgn=orgn/10;
		    }
		    if(sum==n)
		    {
		        return true;
		    }
		    else
		    {
		        return false;
		    }
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sr=sc.nextInt();
		int er=sc.nextInt();
		int Count=0;
		for(int i=sr; i<=er; i++)
		{
		    if(prime(i)&&palindrome(i))
		    {
		        Count++;
		    }
		}
		System.out.println("Count"+Count);
	}
}
