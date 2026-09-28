import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String s = scanner.nextLine();
        
        int countA = 0;
        int countB = 0;
        
        // Count occurrences of 'a' and 'b'
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countA++;
            } else if (c == 'b') {
                countB++;
            }
        }
        
        // Minimum flips required
        int minFlips = Math.min(countA, countB);
        
        // Output the result
        System.out.println(minFlips);
        
        scanner.close();
    }
}
