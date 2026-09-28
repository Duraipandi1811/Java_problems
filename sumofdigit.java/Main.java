import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int n=sc.nextInt();
        int x=n;
        int Sum=0;
        int t;
        while(x!=0)
        {
            t=n%10;
            Sum=Sum+t;
            x=x/10;
        }
        System.out.println(n);
        System.out.println("Sum of digits in "+Sum);
    }
}   