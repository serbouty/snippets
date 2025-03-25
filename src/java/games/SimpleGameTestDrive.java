public class SimpleGameTestDrive {
	public static void main(String[] args) {
		SimpleGame game = new SimpleGame();

		String failed = "failed";
		String passed = "passed";
		
		/* Virtual grid. */
		int[] locations = {2, 3, 4};
		game.setLocationCells(locations);

		/* Miss test. */
		String guess1 = game.checkYourself(1);

		if (guess1.equals("miss")) {
			System.out.println(passed);
		} else {
			System.out.println(failed);
		}

		/* Hit test. */
		String guess2 = game.checkYourself(2);

		if (guess2.equals("hit")) {
			System.out.println(passed);
		} else {
			System.out.println(failed);
		}

		/* Kill test. */
		game.checkYourself(3);
		String kill = game.checkYourself(4);
		
		if (kill.equals("kill")) {
			System.out.println(passed);
		} else {
			System.out.println(failed);
		}
	}
}