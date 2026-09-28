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
	    ArrayList <Integer>arr=new ArrayList<>();
	    arr.add(10);
	    arr.add(11);
	    arr.add(115);
	   // arr.add("_19_");
	    arr.add(210);
	    arr.add(189);
		System.out.println("Elements:"+arr);
		 ArrayList <Integer>arr1=new ArrayList<>();
	    arr1.add(10);
	    arr1.add(11);
	    arr1.add(115);
	    arr1.add(210);
	    arr1.add(189);
		System.out.println("Elements:"+arr1);
		
		arr.addAll(arr1);
		System.out.println(arr);
		
		
		arr.remove(2);
				System.out.println("Elements:"+arr);
				
		
	}
}
