import java.util.*;

public class LongestSumZero {

    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.

        HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();

        int n = arr.length;
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            } else {
                if (ans.get(sum) != null) {
                    maxLen = Math.max(maxLen, i - ans.get(sum));
                } else
                    ans.put(sum, i);
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter array elements (can be positive, negative or zero):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get result
        int longestLength = getLongestZeroSumSubarrayLength(arr);
        System.out.println("Length of the longest subarray with sum 0 is: " + longestLength);
    }
}
