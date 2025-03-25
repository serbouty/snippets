public class SimpleGameLauncherA {
	
	/**
	 * Output:
	 * enter a number  2
	 * hit
	 * enter a number  3
	 * hit
	 * enter a number  4
	 * miss
	 * enter a number  1
	 * kill
	 * You took 4 guesses
	 */
	public static void main(String[] args) {

		SimpleGame game = new SimpleGame();

		int[] locations = {1, 2, 3};
		game.setLocationCells(locations);

		int guess = 2;
		int numOfGuesses = 0;
		
		boolean isAlive = true;
		String result;

		while (isAlive) {
			
			numOfGuesses++;

			System.out.print("enter a number  ");
			System.out.println(guess);

			result = game.checkYourself(guess);
			System.out.println(result);
			
			if (result.equals("hit")) {
				guess++;
			}
			
			if (result.equals("miss")) {
				guess = 1;
			}

			if (result.equals("kill")) {
				isAlive = false;
			}
		}
		
		System.out.println("You took " + numOfGuesses + " guesses");
	}
}