package marks;

import java.util.Scanner;

public class Grade_Calculator {

	public static void main(String[] args) {	//main method
		marks();
	}

	public static void marks() {				//method
		int subCounter = 1;
		float totalMarks = 0f;
		float average = 0.00f;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter total number of Subjects");
		if (sc.hasNextInt()) {
			int subjects = sc.nextInt();
			for (int i = 0; i < subjects; i++) {
				System.out.println("Please enter marks in subject: " + subCounter);
				if (sc.hasNextInt()) {
					totalMarks = totalMarks + sc.nextInt();
					subCounter++;
					average = totalMarks / (subCounter - 1);
				} else {
					System.out.println("Invalid input");
					sc.next();
					i--;
				}
			}
			System.out.println("");
			System.out.println("Total Marks obtained: " + totalMarks + " out of " + subjects * 100);
			System.out.println("Average Percentage: " + average + "%");
			
				//Grades based on Percentage
			if (average >= 80) {
				System.out.print("Grade: A");
			} else if (average >= 60 && average < 80) {
				System.out.print("Grade: B");
			} else if (average >= 40 && average < 60) {
				System.out.print("Grade: C");
			} else {
				System.out.print("Grade: Fail");
			}
		} 
		else {
			System.out.println("Invalid input, Please enter numbers only");
			marks();
		}
	}
}
