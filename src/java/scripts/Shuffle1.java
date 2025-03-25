/**
 * Output:
 * island = Fiji
 * island = Cozumel
 * island = Bermuda
 * island = Azores
 */
public class Shuffle1 { // snippet 11
	public static void main(String[] args) {
		
		String[] islands = new String[4]; // snippet 7
		
		islands[0] = "Bermuda"; // snippet 3
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		
		int[] index = new int[4]; // snippet 9
		
		index[0] = 1; // snippet 6
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		int y = 0; // snippet 1
		
		int ref; // snippet 4
		
		while (y < 4) {
		
			ref = index[y]; // snippet 2
		
			System.out.print("island = "); // snippet 8
			
			System.out.println(islands[ref]); // snippet 5
		
			y = y + 1; // snippet 10
		}
	}
}