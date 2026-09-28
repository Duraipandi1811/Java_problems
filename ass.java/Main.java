import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] seats = new int[100]; 
        System.out.println("Enter the number of seats to be booked:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            try {
                System.out.println("Enter the seat number " +(i+1));
                int seatNumber = sc.nextInt();
                if (seatNumber < 1 || seatNumber > 100)
                {
                    throw new ArrayIndexOutOfBoundsException(seatNumber);
                }
                seats[seatNumber - 1] = 1; 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
                break; 
            }
        }
        System.out.println("The seats booked are:");
        for (int i = 0; i < n; i++)
        {  
                System.out.println(seats[i]); 
        }
    }
}
