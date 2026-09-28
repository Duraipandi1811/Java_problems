import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int c=1;
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<=i; j++)
        //     {
        //         System.out.print(c+" ");
        //         c++;
        //     }
        //     System.out.println();
        // }
        
        // int val=sc.nextInt();
        // int oldval=val;
        // int rev=0;
        // while(oldval!=0)
        // {
        //     int digit=oldval%10;
        //     rev=(rev*10)+digit;
        //     oldval=oldval/10;
        // }
        // System.out.println(rev);
        // if(val==rev)
        // {
        //     System.out.println("It is palindrome.");
        // }else{
        //     System.out.println("It is not palindrome.");
        // }
        
        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // for(int i=1; i<=4; i++)
        // {
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // for(int i=1; i<=4; i++)
        // {
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        
        // int n=4;
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     {
        //         if(j==0 || j==i || i==n-1 )
        //         {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        
        // int n1=3;
        // int n2=5;
        // for(int i=0; i<n1; i++)
        // {
        //     for(int j=0; j<n2; j++)
        //     {
        //         if(i==0 || i==n1-1 || j==0 || j==n2-1)
        //         {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        
        // int val=10;
        // int sum=0;
        // for(int i=1; i<=10; i++)
        // {
        //     if(val%i==0)
        //     {
        //         sum=sum+i;
        //         System.out.println(i);
        //     }
        // }
        // System.out.println(sum);
        
        // int n1=284;
        // int n2=220;
        // int sum1=0;
        // for(int i=1; i<n1; i++)
        // {
        //     if(n1%i==0)
        //     {
        //         sum1=sum1+i;
        //     }
        // }
        // int sum2=0;
        // for(int i=1; i<n2; i++)
        // {
        //     if(n2%i==0)
        //     {
        //         sum2=sum2+i;
        //     }
        // }
        // if(n1==sum2 && n2==sum1)
        // {
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("No");
        // }
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        //int max=arr[0];
        int sum=0;
        int sum2=1;
        for(int i=0; i<n ;i++)
        {
            // if(arr[i]>max)
            // {
            //     max=arr[i];
            // }
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }else{
                sum2=sum2*arr[i];
            }
            
        }
        System.out.println("Even value:"+sum);
        System.out.println("Odd value"+ sum2);
        //System.out.println("Mx value: "+max);
        
    }
}