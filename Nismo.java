import java.util.Scanner;

public class Nismo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the calculator");
		System.out.println("Choose an action!");

		printMenu();
		double userNum;
		double userNum2;

		String userChoice = scan.next().toLowerCase().substring(0, 1);
		while (!userChoice.equals("q")) {

			if (userChoice.equals("m")) {
				System.out.println("Please enter two numbers! ");
				userNum = scan.nextDouble();
				System.out.println("First number: " + userNum);

				userNum2 = scan.nextDouble();
				System.out.println("Second number: " + userNum2);
				multiply(userNum, userNum2);

			} else if (userChoice.equals("d")) {
				System.out.println("Please enter two numbers! ");

				userNum = scan.nextDouble();
				System.out.println("First number: " + userNum);

				userNum2 = scan.nextDouble();
				System.out.println("Second number: " + userNum2);
				divide(userNum, userNum2);

			} else if (userChoice.equals("a")) {
				System.out.println("Please enter two numbers! ");

				userNum = scan.nextDouble();
				System.out.println("First number: " + userNum);

				userNum2 = scan.nextDouble();
				System.out.println("Second number: " + userNum2);

				add(userNum, userNum2);
			} else if (userChoice.equals("s")) {
				System.out.println("Please enter two numbers! ");

				userNum = scan.nextDouble();
				System.out.println("First number: " + userNum);

				userNum2 = scan.nextDouble();
				System.out.println("Second number: " + userNum2);
				subtract(userNum, userNum2);

			} else if (userChoice.equals("f")) {
				System.out.println("Choose an action!");
				printMenu();
			} else {
				System.out.println("Enter a valid number");
			}
			userChoice = scan.next().toLowerCase().substring(0, 1);
		}
		System.out.println("Thank you for using our calculator!");

	}

		public static void printMenu() {
		lines();
		System.out.println("M: Multiply");
		System.out.println("D: Divide");
		System.out.println("A: Add");
		System.out.println("S: Subtract");
		System.out.println("Q: Quit");
		System.out.println("F: Show Menu");
		for (int i = 0; i < 25; i++) {
			System.out.print("-");
		}
		System.out.println("");
	}

	public static void multiply(double num1, double num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		lines();
		System.out.println("Choose an action!");
	}

	public static void divide(double num1, double num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		lines();
		System.out.println("Choose an action!");
	}

	public static void add(double num1, double num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		lines();
		System.out.println("Choose an action!");
	}

	public static void subtract(double num1, double num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		lines();
		System.out.println("Choose an action!");
	}
	
	
	public static void lines() {
		for (int i = 0; i < 25; i++) {
			System.out.print("-");
		}
		System.out.println();
		
	}
}
