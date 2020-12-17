package JavaPrograms;

import java.util.Scanner;

public class stringReverseA14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str, revStr="";
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        str=sc.next();
        for (int i = str.length() - 1; i >= 0; i--) {
        	revStr = revStr + str.charAt(i);
        }

        System.out.println("Reversed string " + revStr);
	}
}
