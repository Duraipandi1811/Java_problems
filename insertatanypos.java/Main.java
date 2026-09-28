/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class singlelinked
{
    Node head;
    class Node
    {
        int data;
        Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    }
    void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    void insertatanypos(int pos,int data)
    {
        Node newnode = new Node(data);
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
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
	    singlelinked list=new singlelinked();
	    list.insert(10);
	    list.insert(10);
	    list.insert(10);
	    list.insert(10);
	    list.insert(10);
	    list.display();
	    System.out.println();
	    list.insertatanypos(2,15);
	    list.display();
	}
}
