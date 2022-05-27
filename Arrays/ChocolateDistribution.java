package Arrays;
import java.util.Arrays;

public class ChocolateDistribution {

    public static int distributionDifference(int arr[], int m, int n) {
        int minDiff = Integer.MAX_VALUE;

        if (m == 0 || n == 0) // If numbeer of students = 0 or no chocolates
            return 0;

        Arrays.sort(arr); // sorting the array
        
        if (n < m) // Number of students cannot be more than number of chocolates
            return -1;

        for (int i=0; i+m-1 < n; i+=1) {
            int diff = arr[i+m-1] - arr[i];
            if (diff < minDiff)
                minDiff = diff;
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        int n = arr.length;
        System.out.println(distributionDifference(arr, m, n));
    }
}
