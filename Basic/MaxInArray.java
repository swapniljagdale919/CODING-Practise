import java.util.*;

class MaxInArray {
	// NOTE: Please do not modify this function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int result = maxInArray(n, arr);
		System.out.println(result);
	}

	// TODO: Implement this method
	static int maxInArray(int n, int[] arr) {
		int max = -999;

		for (int i = 0 ; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;


	}
}







// Problem Description
// Given an array of n integers, find the maximum element in the given array.

// Note : Do not use any inbuilt functions that find the maximum element directly.

// Input format
// There are two lines of input

// First line contains the integer n.

// Next line contains n space separated integers.

// Output format
// Print the maximum element in the array.

// Sample Input 1
// 5

// 1 2 3 1 2

// Sample Output 1
// 3

// Explanation 1
// 3 is the maximum value in the array.

// Constraints
// 1 <= n <= 10000

// 1 <= element of array <= 100000