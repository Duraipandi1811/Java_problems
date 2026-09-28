import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prime(n));
        
    }
     public static boolean prime(int n)
		{
		    int c=0;
		    for(int j=1;j<=n; j++)
		    {
		        if(n%j==0)
		        {
		            c++;
		        }
		    }
		    if(c==2)
		    {
		      return true;   
		    }
		    else
		    {
		      return false;
		    }
		}
}