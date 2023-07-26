import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// 1. Initialize any variables and objects you need (i.e. a scanner, some
		// counters for a total running sum, and a number tracking the # of scores inputted
		boolean indicator = true;
		double sum = 0;
		double average = 0;
		int count = 0;
		Scanner inputVal = new Scanner(System.in);
		
		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
		// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again
		while (indicator) {
			System.out.println("Please enter a number");
			int val = Integer.parseInt(inputVal.nextLine());
			if (val == -1){
				indicator = false;
				inputVal.close();
				break;
			}
			if (val <= 100) {
				sum += val;
				count++;
			}
		}

		// 4. Calculate the average of all scores collected during the loop
		average = sum/count;
		
		// 5. Display the average grade and corresponding message
		// - If over 90: "Excellent Work!"
		// - If over 80: "Good Job!"
		// - If over 70: "Keep it up!"
		// - anything else: "Let's work hard to get those grades up!"
		if (average > 90) {
			System.out.println("Excellent Work!");
		} else if (average > 80) {
			System.out.println("Good Job!");
		} else if (average > 70) {
			System.out.println("Keep it up!");
		} else {
			System.out.println("Let's work hard to get those grades up");
		}
	}
}