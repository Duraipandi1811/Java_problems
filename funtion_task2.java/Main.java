import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of triangles");
        int n=sc.nextInt();
        int result=triangle(n);
        System.out.println("Total number of blocks : "+result);
    }
    public static int triangle(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+ triangle(n-1);
        }
    }
}   