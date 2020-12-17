package JavaPrograms;

import java.util.Scanner;
import java.lang.Math; 

public class Assignment9 {

	//Area
	public static int area_rectangle(int length, int width) {
		return length*width;
		
	}
	
	//Diagonal
	public static float diagonal_rectangle(int length, int width) {
		int x = (length*length) + (width*width);
		return (float) Math.sqrt(x);
		
	}
	
	//Circumference
	public static float circum_rectangle(int length, int width) {
		return 2*(length+width);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length, width;
		System.out.println("Enter the lenght and width od rectangle: ");
		Scanner sc= new Scanner(System.in);
		
		length=sc.nextInt();
		width=sc.nextInt();
		sc.close();
		
		int area = area_rectangle(length, width);
		float diagonal = diagonal_rectangle(length, width);
		float circumference = circum_rectangle(length, width);
		
		System.out.println("Area " + area);
		System.out.println("Diagonal " + diagonal);
		System.out.println("Circumference " + circumference);
		System.out.println("Area + diagonal length + circumference " + (area+diagonal+circumference));
	}

}
