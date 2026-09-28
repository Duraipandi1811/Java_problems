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
        System.out.println("Enter the value :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        num=n;
        int sum=0;
        int t;
        while(num!=0)
        {
           t=num%10;
           int v=1;
           for(int i=1; i<=count; i++)
              v=v*t;
            sum=sum+v;
            num=num/10;
        }
        System.out.println(sum);
        if(sum==n)
        {
            System.err.println("Its Armsrtong Number");
        }
        else{
            System.out.println("Its Not a Armstrong number");
        }
    }
}