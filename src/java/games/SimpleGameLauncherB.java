/**
 * Place one boat on a virtual 1 x 7 grid,
 * then ask for the Player guess.
 *
 * @see Player
 * @see SimpleGame
 */
public class SimpleGameLauncherB {
	public static void main(String[] args) {

		int numOfGuesses = 0;	

		Player player = new Player();

		SimpleGame game = new SimpleGame();

		int firstCell = (int) (Math.random() * 5); // between 0 and 4
		
		int[] locations = {firstCell, firstCell + 1, firstCell + 2};

		game.setLocationCells(locations);

		boolean isAlive = true;


		while (isAlive) {

			int guess = player.getUserInput("enter a number");

			String result = game.checkYourself(guess);
			
			System.out.println(result);

			numOfGuesses++;

			if (result.equals("kill")) {

				isAlive = false;

				System.out.println("You took " + numOfGuesses + " guesses.");	
			}
		}
	}
}