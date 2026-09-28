import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        int R2 = R * R;
        int d1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1); 
        int d2 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);
        int d3 = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2); 
        if ((d1 <= R2 && d2 <= R2) || (d1 <= R2 && d3 <= R2) || (d2 <= R2 && d3 <= R2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
