package JavaPrograms;

public class Assignment26 {
	//WJP to print the names of students by creating a Student class. 
	//If no name is passed while creating an object of Student class, then the name should be "Unknown", 
	//otherwise the name should be equal to the String value passed while creating object of Student class.

	public static void main(String[] args) {
		Student s1 = new Student(1, "Nithya");
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		Student s2 = new Student(2, "");
		System.out.println(s2.id);
		System.out.println(s2.name);
	}
}

