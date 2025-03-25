import java.util.Scanner;

 public class Player {
	 
	/**
	 * Get command-line input from the player.
	 */
	public int getUserInput(String prompt) {
		System.out.print(prompt + ": ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
 }