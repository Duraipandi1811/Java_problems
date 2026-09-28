import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        int month = 1; // January is the first month
        int day = 1; // We are checking 1st January
        int K = year % 100; // Year of the century
        int J = year / 100; // Century
        if (month == 1 || month == 2) 
        {
            month += 12;
            K--;
        }

        // Zeller's congruence formula
        int h = (day + (13 * (month + 1)) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;
        System.out.println(h);

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        System.out.println(days[h]);
    }
}
