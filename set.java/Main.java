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
	    System.out.println("|...HashSet...|");
	    HashSet list=new HashSet();
	    list.add(10);
	    list.add(40);
	    list.add(20);
	    list.add(10);
	    list.add(50);
		System.out.println("Elements "+list);
		System.out.println("\n|...LinkedHashSet...|\n");
		LinkedHashSet list1=new LinkedHashSet();
	    list1.add(10);
	    list1.add(40);
	    list1.add(20);
	    list1.add(10);
	    list1.add(50);
		System.out.println("Elements "+list1);
		System.out.println("\n|...TreeSet...|\n");
		TreeSet list2=new TreeSet();
	    list2.add(10);
	    list2.add(40);
	    list2.add(20);
	    list2.add(10);
	    list2.add(50);
		System.out.println("Elements "+list2);
		
		
	}
}
