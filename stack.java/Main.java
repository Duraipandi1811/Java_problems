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
	    Stack <Integer> list=new Stack<>();
	    list.push(20);
	    list.push(30);
	    list.push(40);
	    list.push(50);
	    list.push(60);
	    list.push(70);
		System.out.println("Stack elements: "+list);
		System.out.println(list.pop());
		System.out.println("Stack elements: "+list);
		System.out.println("Top of value in Stack: "+list.peek());
		System.out.println("Stack elements: "+list);	
		System.out.println("Search element: "+list.search(20));
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println("Check Empty Stack or Not: "+list.empty());	
		
		
		
	}
}
