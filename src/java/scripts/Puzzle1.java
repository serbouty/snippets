/**
 * Output:
 * result 543345
 */
public class Puzzle1 {
	public static void main(String [] args) {
		
		Puzzle1Value[] values = new Puzzle1Value[6];

		int number = 1;
		int i = 0;	
		
		while (i < 6) {
			
			values[i] = new Puzzle1Value();
			
			values[i].intValue = number;
			
			number = number * 10;
			
			i = i + 1;
		}
		
		int result = 0;
		i = 6;
		
		while (i > 0) {
			
			i = i - 1;
			
			result = result + values[i].doStuff(i);
		}
		
		System.out.println("result " + result);
	}
}
		
