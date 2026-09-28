import java.util.*;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n=sc.nextInt();
        int arr[] =new int [n];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int min2=arr[1];
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<n-1; j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                }
            }
            
        }
        System.out.println("Min "+min);
    }
}   