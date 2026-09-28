import java.util.*;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        String res="";
        BigInteger fac=BigInteger.ONE;
        for(int i=a;i>=1;i--)
        {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        res=res+fac;
        System.out.print(res);
    }
}































class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=" ";
        BigInteger fac=BigInteger.ONE;
        for(int i=n; i>=1; i--
        {
         fac=fac.multiply(BigInteger.valueOf(i));   
        }
        res=res+fac;
    }
}