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
	   System.out.println("Enter the Arraysize: ");
	   int n=sc.nextInt();
	   int arr1[]=new int [n];
	   int arr2[]=new int [n];
	   System.out.println("Enter the Array1 elements: ");
	   for(int i=0; i<n; i++)
	   {
	       arr1[i]=sc.nextInt();
	   }
	   System.out.println("Enter the Array2 elements: ");
	   for(int j=0; j<n; j++)
	   {
	       arr2[j]=sc.nextInt();
	   }
	   int index1=0 ,index2=0, count=0;
	   for(int i=0; i<n; i++)
	   {
	       if(arr1[i]!=arr2[i])
	       {
	           count++;
	           if(index1==0)
	           {
	               index1=i;
	           }
	           else if(index2==0)
	           {
	               index2=i;
	           }
	           else
	           {
	               System.out.println("false");
	               return;
	           }
	       }
	   }
	   if(count==0)
	   {
	       System.out.println("true");
	       return;
	   }
	   if(count==2)
	   {
	       int t=arr1[index1];
	       arr1[index1]=arr1[index2];
	       arr1[index2]=t;
	       for(int i=0; i<n; i++)
	       {
	           if(arr1[i]!=arr2[i])
	           {
	               System.out.println("false");
	               return;
	           }
	       }
	       System.out.println("true");
	       return;
	   }
	   else{
	       System.out.println("false");
	   }
	   
	}
}
