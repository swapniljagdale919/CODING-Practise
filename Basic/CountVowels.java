import java.util.*;

class CountVowels {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int vowels = countVowels(str);
		System.out.println(vowels);
	}


	static int countVowels(String str) {

		char[] chr = str.toCharArray();

		int count = 0;
		for (int i = 0 ; i < str.length(); i++) {

			char ch = chr[i];

			if (ch == 'a' || ch == 'A' || ch == 'i' || ch == 'I' || ch == 'e' ||
			        ch == 'E' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'    ) {
				count++;
			}

		}
		return count;
	}
}








// Problem Description
// Given a string, count the total number of vowels present in that string.

// Note: The string contains uppercase and lowercase english alphabets only.

// Input format
// One line of input, which contains the given string.

// Output format
// Print the total number of vowels.

// Sample Input 1
// language

// Sample Output 1
// 4

// Explanation 1
// There are a total of 4 vowels in the string "language" i.e. 'a', 'u', 'a', 'e'.