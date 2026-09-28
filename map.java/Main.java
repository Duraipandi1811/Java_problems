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
	    Map <String,Integer> list=new LinkedHashMap<>();
	    list.put("Number0",12);
	    list.put("Number1",13);
	    list.put("Number2",14);
	    list.put("Number3",15);
	    list.put("Number4",16);
		System.out.println("Values:"+list);
		System.out.println("Size:"+list.size());
		System.out.println("Size:"+list.keySet());
		System.out.println("Size:"+list.values());              
// 		list.clear();
		System.out.println("Size:"+list);
		System.out.println("Size:"+list.entrySet());
for(Map.Entry<String,Integer> i:list.entrySet())
{
    System.out.print(i.getKey()+" "+i.getValue());
}
	}
}
