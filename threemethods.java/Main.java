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
	    ArrayList list=new ArrayList();
	    list.add(10);
	    list.add(40);
	    list.add(150);
	    list.add(103);
	    list.add(105);
	    list.add(100);
	    list.add(50);
	    list.add(80);
		System.out.println("Elements:"+list);
		list.set(2,20);
		System.out.println("After value change:"+list);
		System.out.println("index 4 value:"+list.get(4));
		list.clear();
		System.out.println("Elements:"+list);
		
	}
}
