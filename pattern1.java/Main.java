import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num += (n - j - 1);
            }
            System.out.println();
        }
    }
}
