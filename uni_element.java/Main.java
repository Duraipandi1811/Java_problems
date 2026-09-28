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
	    sc.nextLine();
	    int arr[]=new int[26];
	    for(int i=0; i<n; i++)
	    {
	        String value=sc.nextLine();
	        char check=value.charAt(0);
	        char lowerCaseInput= Character.toLowerCase(check);
	        arr[lowerCaseInput-'a']++;
	    }
	    int count=0;
	    for(int i=0;i<26; i++)
	    {
	        if(arr[i]>0)
	        {
	            count++;
	        }
	    }
		System.out.println(count);
	}
}
