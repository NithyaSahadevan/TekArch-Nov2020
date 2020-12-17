package JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment24 {

	 //WJP to check two strings are anagrams of each other.
	
	 static boolean areAnagram(char[] str1, char[] str2)
	    {
	        // Get lengths of both strings
	        int n1 = str1.length;
	        int n2 = str2.length;
	 
	        // If length of both strings is not same,
	        // then they cannot be anagram
	        if (n1 != n2)
	            return false;
	 
	        // Sort both strings
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	 
	        // Compare sorted strings
	        for (int i = 0; i < n1; i++)
	            if (str1[i] != str2[i])
	                return false;
	 
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1, str2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string ");
		str1=sc.nextLine();
		System.out.println("Enter second string ");
		str2=sc.nextLine();
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		sc.close();
		
		if (areAnagram(c1, c2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
	}

}
