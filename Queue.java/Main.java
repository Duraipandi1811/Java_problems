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
	    Queue<Integer>list=new ArrayDeque<>();
	    list.add(19);
	    list.add(20);
	    list.add(38);
	    list.add(14);
	    list.offer(20);
	    list.offer(36);
	    list.add(38);
	    System.out.println("...ArrayDeque method...\n");
	    System.out.println("Elements in Queue:"+list);
	    System.out.println("Head of Queue using element method:"+list.element());
	    System.out.println("Head of Queue using peek method:"+list.peek());
	    System.out.println("Head of Queue Using remove method:"+list.remove());
	    System.out.println("Elements in Queue:"+list);
	    System.out.println("Head of Queue Using remove method:"+list.poll());
	    System.out.println("Elements in Queue:"+list);
	    
	    System.out.println("\n\n...PriorityQueue Method...\n\n");
	    Queue<Integer>list1=new PriorityQueue<>();
	    list1.add(190);
	    list1.add(203);
	    list1.add(388);
	    list1.add(140);
	    list1.offer(250);
	    list1.offer(368);
	    list1.add(385);
	    System.out.println("Elements in Queue:"+list1);
	    System.out.println("Head of Queue using element method:"+list1.element());
	    System.out.println("Head of Queue using peek method:"+list1.peek());
	    System.out.println("Head of Queue Using remove method:"+list1.remove());
	    System.out.println("Elements in Queue:"+list1);
	    System.out.println("Head of Queue Using remove method:"+list1.poll());
	    System.out.println("Elements in Queue:"+list1);
	    
	    
	    System.out.println("\n\n...LinkedQueue Method...\n\n");
	    Queue<Integer>list2=new PriorityQueue<>();
	    list2.add(1);
	    list2.add(20);
	    list2.add(48);
	    list2.add(14);
	    list2.offer(28);
	    list2.offer(98);
	    list2.add(35);
	    System.out.println("Elements in Queue:"+list2);
	    System.out.println("Head of Queue using element method:"+list2.element());
	    System.out.println("Head of Queue using peek method:"+list2.peek());
	    System.out.println("Head of Queue Using remove method:"+list2.remove());
	    System.out.println("Elements in Queue:"+list2);
	    System.out.println("Head of Queue Using remove method:"+list2.poll());
	    System.out.println("Elements in Queue:"+list2);
	    
	    
	    
	    
	}
}
