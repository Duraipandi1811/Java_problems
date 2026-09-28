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
	    int arr[]={ 1,2,9};
	    String value="";
	    for(int i=0; i< arr.length; i++)
	    {
	        value=value+arr[i];
	    }
	    long int_value= Long.parseLong(value)+1;
	    int temp=int_value;
	    int count=0;
	    while(temp!=0)
	    {
	        temp=int_value/10;
	        count++;
	    }
	    int result[]=new int [];
	    for(int i=count-1; i>=0; i--
	    {
	        result[i]=(int)int_value%10;
	        int_value=int_value/10;
	    }
	    
	}
}
