package random;
import java.util.Random;
import java.util.Scanner;
public class numbers {
	public static void main(String[] args) {
		System.out.println("I am thinking of a number between 1 and 10. Can you guess what it is?");
		String status = "in game";
		Random rand = new Random();
		int upperbound = 11;
		int rng = rand.nextInt(upperbound);
		while (status == "in game") {
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			int number = Integer.parseInt(input);
			System.out.println("You have chosen number: " + input);

			if (rng > number) {
				System.out.println("Nope! Guess higher.");
			}
			else if (rng < number) {
				System.out.println("Nope! Guess lower.");
			}
			else {
				System.out.println("Correct!");
				break;
			}

		}	
			
	}
	
}
