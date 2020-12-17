package JavaPrograms;

import java.util.Scanner;

public class Assignment20 {

	//WJP to check whether a given string ends with the contents of another string.
	//test data"Python Exercises" ends with "se"? false   "Python Exercise" ends with "se"? true
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str1, str2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		str1=sc.nextLine();
		System.out.println("Enter the substring to search");
		str2=sc.nextLine();
		sc.close();

		String s = str1.length() > 2 ? str1.substring(str1.length() -2) : str1;
		if(s.equals(str2))
			System.out.println("True");
		else
			System.out.println("false");
	}

}
