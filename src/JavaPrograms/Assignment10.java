package JavaPrograms;

import java.util.Scanner;

public class Assignment10 {

	//Calculate Area  
	public static float area_circle(int radius) {
		return (float) (3.14*radius*radius);
		
	}
	
	//Circumference
	public static float circum_circle(int radius) {
		return (float) (2*3.14*radius);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radius;
		System.out.println("Enter the radius of the circle: ");
		Scanner sc= new Scanner(System.in);
		
		radius=sc.nextInt();
		sc.close();
		
		float area = area_circle(radius);
		float circumference = circum_circle(radius);
		

		System.out.println("Area " + area);
		System.out.println("Circumference " + circumference);
		System.out.println("Area + circumference " + (area+circumference));
	}

}
