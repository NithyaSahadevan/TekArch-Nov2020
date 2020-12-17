package JavaPrograms;

import java.util.Scanner;

public class Assignment19 {

	//WJP to create the concatenation of the two strings except removing the first character of each string
	//Test Data: Str1 = Python Str2 = TutorialSample Output: ythonutorial
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1, str2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings ");
		str1=sc.nextLine();
		str2=sc.nextLine();
		sc.close();
		
		System.out.println(str1.substring(1) + str2.substring(1));
	}

}
