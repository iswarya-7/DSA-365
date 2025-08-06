import java.io.*;
import java.util.*;

public class CountSubarrayXor {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		int n = arr.size();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			// regenerate the xor every new iteration
			int xor = 0;
			// traverse the array from i to n
			for (int j = i; j < n; j++) {
				// using xor same value will come it cancel and remaining be there (a^b)
				xor = xor ^ arr.get(j);

				// check if the xor is equal to x(target)
				if (xor == x)
					cnt++; // increase the count
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array : ");
		int n = sc.nextInt();
		// array
		ArrayList<Integer> arr = new ArrayList<>();

		System.out.println("Enter the array values:");
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		System.out.println("Enter the target XOR value:");
		int x = sc.nextInt();

		int countSubarray = subarraysXor(arr, x);
		System.out.println("Taget value subarray count : " + countSubarray);

	}
}