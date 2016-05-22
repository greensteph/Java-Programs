import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
class GuessingGame {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		out.print("Enter an int from 1 to 5:");
		int inputNumber = myScanner.nextInt();
		int randomNumber = new Random().nextInt(5) + 1;
		if (inputNumber == randomNumber) {
			out.println("*You Win*");
		} else {
			out.println("You Lose.");
			out.print("The random number was ");
			out.println(randomNumber + ".");
		}
		out.println("What happens in Vegas stays in Vegas");
	}
}