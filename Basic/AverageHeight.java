import java.util.*;


class AverageHeight {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a[] = new float[n];

		for (int i = 0; i < n; i++) {
			a[i] = Float.parseFloat(sc.next());
		}

		float avgHeight = averageHeight(n, a);
		System.out.println(avgHeight);
	}

	static float averageHeight(int n, float[] arr) {
		float ans = 0;

		for (int i = 0 ; i < n; i++) {
			ans += arr[i];
		}
		ans = (float)ans / n;
		ans = Float.parseFloat(String.format("%.5f", ans)) ;
		return ans;
	}
}


/*
Problem Description
Given the heights of n students of a class, find the average height. Your answer should be accurate upto 5 decimal places.

Input format
There are two lines of input.

First line contains an integer n,the number of students.

Second line contains n space-separated decimal numbers - The array with the heights of the students.

Output format
Print the average height.

Sample Input 1
6

2.2 1 3 1.9 2.4 1.7

Sample Output 1
2.033333

Explanation 1
(2.2+1+3+1.9+2.4+1.7) / 6 = 12.2/6 = 2.03333

Constraints
0 < n < 100

0 < height < 100


*/