/**
 * Output:
 * a-b c-d
 */
public class Shuffle0 { // snippet 3
	public static void main(String[] args) {

		int x = 3; // snippet 5

		while (x > 0) { // snippet 7

			if (x > 2) { // snippet 4
				System.out.print("a");
			}
			
			x = x - 1; // snippet 6
			System.out.print("-");

			if (x == 2) { // snippet 2
				System.out.print("b c");
			}

			if (x == 1) { // snippet 1
				System.out.println("d");
				x = 0;
			}
		}
	}
}