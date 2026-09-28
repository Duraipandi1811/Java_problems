import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] treeTypes = new char[n];
        int[] yields = new int[n];
        int uniqueCount = 0;
  
        for (int i = 0; i < n; i++) {
            char treeType = scanner.next().charAt(0);
            int yield = scanner.nextInt();
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (treeTypes[j] == treeType) {
                    yields[j] += yield;
                    found = true;
                    break;
                }
            }
            if (!found) {
                treeTypes[uniqueCount] = treeType;
                yields[uniqueCount] = yield;
                uniqueCount++;
            }
        }
        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (treeTypes[i] > treeTypes[j])
                {
                    char tempTree = treeTypes[i];
                    treeTypes[i] = treeTypes[j];
                    treeTypes[j] = tempTree;
                    int tempYield = yields[i];
                    yields[i] = yields[j];
                    yields[j] = tempYield;
                }
            }
        }
        for (int i = 0; i < uniqueCount; i++) 
        {
            System.out.println(treeTypes[i] + " " + yields[i]);
        }
    }
}
