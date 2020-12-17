package JavaPrograms;

import java.util.Scanner;

public class Assignment29 {

	//Write a Java method to display the middle character of a string. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		sc.close();
		
		int mid= str.length()/2-1;
		if(str.length()>0 && str!=null) {
			if(str.length()%2==0) {
				System.out.println("Middle characters: " + str.charAt(mid)+str.charAt(mid+1));
			}
			else
				System.out.println("Middle characters: " + str.charAt(mid+1));
		}
		
			
	}

}
