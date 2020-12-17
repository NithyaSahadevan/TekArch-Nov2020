package JavaPrograms;

import java.util.Scanner;

public class Assignment16 {
	public static void main(String[] args) {
		//Reverse a word
		
		String str, revStr="";
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the string");
	    str=sc.next();
	    sc.close();
	    
	    for (int i = str.length() - 1; i >= 0; i--) {
	    	revStr = revStr + str.charAt(i);
	    }

	    System.out.println("Reversed string " + revStr);
	}
	
}
