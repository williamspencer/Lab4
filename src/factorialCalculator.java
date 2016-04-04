import java.util.Scanner;

public class factorialCalculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Factorial Calculator!");
		long x = 1;
		String answer = "y";

		while (answer.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than 0 but less than 10: ");
			x = in.nextInt();
			System.out.println("The factorial of " + x + " is: " + getFact(x));
			System.out.print("Continue? (y/n): ");
			answer = in.next();
		}
		System.out.println("Goodbye.");
		in.close();
	}

	public static long getFact(long x) {
		if (x == 1)
			return 1;
		return x * getFact(x - 1);

		// long result = 1;
		// for (int i = 1; i <= x; i++) {
		// result *= i;
		// }
		// return result;
	}
}