import java.util.*;

class PyramidPrinting {
	// NOTE: Please do not modify this function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] pattern = pyramidPrinting(n);

		for (int i = 0; i < n; i++)
			System.out.println(pattern[i]);

	}

	// TODO: Implement this method
	static String[] pyramidPrinting(int n) {

		String[] pattern = new String[n];

		for (int i = 1 ; i <= n; i++) {
			String currRow = "";
			for (int j = 1; j <= i; j++) {
				currRow += "*";
				if (i != j) {
					currRow += " ";
				}
			}
			pattern[i - 1] = currRow;
		}
		return pattern;
	}



// Problem Description
// Given a number n, you have to print a triangle - shaped pattern with n rows using '*'.

// For eg. if n = 4 pattern will be:

//                *
//                * *
//                * * *
//                * * * *