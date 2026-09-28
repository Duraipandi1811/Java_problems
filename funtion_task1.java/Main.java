import java.util.Scanner;
public class Main{
    public static int calculate(int x, int n)  
    {
        int sum = 0;
        int term = x;   
        
        for (int i = 1; i <= n; i++) {   
            sum =sum+term;  
            System.out.print(sum+" ");
            term = term*x;    
            System.out.print(term+" ");
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = scanner.nextInt();
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        int result = calculate(x, n);
        System.out.println("The result is\n" + result);
    }
}
