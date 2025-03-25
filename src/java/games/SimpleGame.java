public class SimpleGame {

	private int[] locationCells;
	private int numOfHits = 0;

	/**
	 * Ensure privacy for 'locationCells'.
	 */
	public void setLocationCells(int[] locations) {
		locationCells = locations;
	}

	/**
	 * Return "hit", "miss" or "kill" depending on
	 * the player guess.
	 */
	String checkYourself(int guess) {
		
		String result = "miss";

		for (int cell : locationCells) {

			if (guess == cell) {
				
				result = "hit";

				numOfHits++;
				
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {

			result = "kill";
		}

		return result;
	}
}