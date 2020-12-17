package JavaPrograms;

import java.util.Scanner;

public class palindromeA15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.next();
        sc.close();
        str=str.toLowerCase();
        int  j= str.length()-1;
        for(int i=0; i<str.length()/2; i++,j--)

        {
        	if(str.charAt(j) != str.charAt(i)) {
        		System.out.println("Not a palindrome");
       	        System.exit(0);
        		
        	}
        		
        }
        System.out.println("palindrome");
	}

}
