/**
 * Displays beer song lyrics on a terminal.
 */
public class BeerSong {
	public static void main(String[] args) {
		
		int bottleQuantity = 99;
		String word = "bottles";

		while (bottleQuantity > 0) {
			
			System.out.println(bottleQuantity + " " + word + " of beer on the wall, " + 
								bottleQuantity + " " + word + " of beer.");
								
			System.out.print("Take one down and pass it around, ");
			
			bottleQuantity = bottleQuantity - 1;

			if (bottleQuantity == 1) {
				word = "bottle";
			}
			
			if (bottleQuantity > 0) {
				System.out.println(bottleQuantity + " " + word + " of beer on the wall.");
			} else {
				word = "bottles";
				System.out.println("no more " + word + " of beer on the wall.");
			}
		}

        bottleQuantity = 99;
        System.out.println("No more " + word + " of beer on the wall, no more " +
                            word + " of beer on the wall.");
        System.out.println("Go to the store and buy some more, " +
                            bottleQuantity + " " + word + " of beer on the wall.");
    }
}