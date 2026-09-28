public class Solution
 {
    public int solve(int A, ArrayList<Integer> B)
     {
        long totalSum = 0;
        for (int num : B) 
        {
            totalSum += num;
        }
        if (totalSum % 3 != 0)
         {
            return 0;
        }
        long targetSum = totalSum / 3;
        long currentSum = 0;
        int countTargetSum = 0;
        int ways = 0;
        for (int i = 0; i < A; i++)
         {
            currentSum += B.get(i);
            if (currentSum == 2 * targetSum) 
            {
                ways += countTargetSum;
            }
            if (currentSum == targetSum) 
            {
                countTargetSum++;
            }
        }

        return ways;
    }