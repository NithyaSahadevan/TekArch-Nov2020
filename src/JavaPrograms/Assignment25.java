package JavaPrograms;

import java.util.Scanner;

public class Assignment25 {

	//WJP to Check the given word is present in a given string.!String = "this is me doing qa automation testing" Word="qa" 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str, substring;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		str=sc.nextLine();
		System.out.println("Enter the word to search");
		substring=sc.nextLine();
		sc.close();
		
		String[] words = str.split(" ");
		
		for(int i=0; i<words.length; i++) {
			if(words[i].equals(substring)) {
				System.out.println("Word is present");
				System.exit(0);
			}
		}
		System.out.println("Word is not present");
	}

}
