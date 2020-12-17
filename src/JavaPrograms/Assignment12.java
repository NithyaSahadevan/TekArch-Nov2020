package JavaPrograms;

import java.util.ArrayList;

public class Assignment12 {

	public static void main(String[] args) {

		int i = 1;
		ArrayList<Integer> divisibleByThree = new ArrayList<>();
		ArrayList<Integer> divisibleByFive = new ArrayList<>();
		ArrayList<Integer> divisibleByThreeAndFive = new ArrayList<>();
		System.out.println("Numbers divisible by 3,5 and both");
		while (i <= 100) {
			if (i % 3 == 0) {
				divisibleByThree.add(i);
			} else if (i % 5 == 0) {
				divisibleByFive.add(i);
			}
			if ((i % 3 == 0) && (i % 5 == 0)) {
				divisibleByThreeAndFive.add(i);
			}
			i++;
		}

		System.out.println("Numbers divisible by 3: ");
		System.out.print(divisibleByThree);
		System.out.println();

		System.out.println("Numbers divisible by 5: ");
		System.out.print(divisibleByFive);
		System.out.println();

		System.out.println("Numbers divisible by 3 and 5: ");
		System.out.print(divisibleByThreeAndFive);
	}
}
