import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();    
        int leftSum = 0;
        for (int i = 0; i < B; i++)
        {
            leftSum += A.get(i);   //5 2 3   8
        }
        int maxSum = leftSum;   //8
        int rightSum = 0;
        for (int i = 0; i < B; i++) {
            rightSum += A.get(n - 1 - i);
            
            leftSum -= A.get(B - 1 - i); 
            leftSum += A.get(n - 1 - i);
            maxSum = Math.max(maxSum, leftSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        
        Solution s = new Solution();

        // Test case 1
        Integer[] list1 = {5, -2, 3, 1, 2};
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(list1));
        int sum1 = s.solve(A1, 3);  // Should return 8

        // Test case 2
        Integer[] list2 = {1, 2};
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(list2));
        int sum2 = s.solve(A2, 1);  // Should return 2

        System.out.println(sum1);  // Output: 8
        System.out.println(sum2);  // Output: 2
    }
}