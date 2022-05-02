import java.util.*;

class Capitalise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String capStr = capitalise(str);

		System.out.println(capStr);
	}

	static String capitalise(String str) {

		char[] chr = str.toCharArray();

		for (int i = 0; i < chr.length ; i++ ) {

			if (chr[i] >= 'a' && chr[i] <= 'z' ) {

				if (i == 0 || chr[i - 1] == ' ') {
					chr[i] = (char)(chr[i] - 'a' + 'A');
				}

			}
		}
		return String.valueOf(chr);
	}
}


// Problem Description
// Given a paragraph of words, capitalise the first character of each word and return the updated paragraph.

// Note : No inbuilt function such as split() to be used.

// Input format
// One line of input which contains a string, the paragraph.

// Output format
// Return the paragraph after capitalising each word.

// Sample Input 1
// the quick Brown fox jumps over The lazy dog.

// Sample Output 1
// The Quick Brown Fox Jumps Over The Lazy Dog.

// Constraints
// Length of paragraph < 100

// The paragraph contains spaces, lowercase, uppercase characters and ‘.’.