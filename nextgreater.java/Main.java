
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int size = obj.nextInt();
        System.out.println("Enter the array elements");
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        a[i]=obj.nextInt();
        System.out.println("Leaders are");
        int max = a[size-1];
        int index=0;
        int b[] = new int[size];
        b[index]=max;
        for(int i=size-2;i>=0;i--){
            if(a[i]>max){
                max = a[i];
                b[index++]=max;
            }
        }
        for(int i=index-1;i>=0;i--){
            System.out.println(b[i]);
        }
    }
}