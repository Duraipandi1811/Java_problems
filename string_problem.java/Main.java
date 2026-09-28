/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
	    // input sleep output sle*ep
		String value="sleep";
		StringBuilder values=new StringBuilder(value);
		for(int i=0; i<value.length()-1; i++)
		{
		    if(value.charAt(i)==value.charAt(i+1))
		    {
		        values.insert(i+1,'*');
		    }
		}
		System.out.println(values);
	}
}
