/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class SinleLinkedList
{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int value)
        {
            this.data=value;
            this.next=null;
        }
    }
    void insert(int value)
    {
        Node newnode=new Node(value);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
}
public class Main
{
	public static void main(String[] args) 
	{
	    SinleLinkedList list=new SinleLinkedList();
	    list.insert(20);
	    list.insert(40);
	    list.insert(60);
	    list.insert(80);
	    list.insert(100);
	    System.out.println("--Data--");
	    list.display();
	}
}
