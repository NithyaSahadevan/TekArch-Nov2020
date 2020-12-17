package JavaPrograms;

import java.util.Scanner;

public class Assignment30 {

	// Write a Java method to count all vowels in a string.
	static char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		sc.close();

		System.out.println(isVowel(str));
	}

	public static int isVowel(String str) {
		String lowerWord = str.toLowerCase(); // Make word lowercase to be able to check for uppercase vowels, too
		int count = 0;
		if (str.length() > 0) {
			for (int i = 0; i < str.length(); i++) {
				for (char ch : vowels) {
					// If the character is a vowel, return true
					if (lowerWord.charAt(i) == ch) {
						count += 1;
					}
				}
			}
		}
		return count;
	}
}
