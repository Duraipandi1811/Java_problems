import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++) 
        {
            System.out.print("*");
        }
        
        System.out.println();
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("b");
            }
            for (int j = i; j < n; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
