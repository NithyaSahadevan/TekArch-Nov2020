package JavaPrograms;

public class sumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum=1, sum=0;
		while (iNum <= 10) {
			sum = sum + iNum;
			iNum++;
		}
			
		System.out.println("Sum of first 10 natural numbers : " + sum);
	}

}
