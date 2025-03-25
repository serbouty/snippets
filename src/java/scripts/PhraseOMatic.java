/**
 * Dislay a random sentence on a terminal.
 */
public class PhraseOMatic {
	public static void main(String[] args) {

		String[] who = {"The manager", "The accountant", "The director"};
		String[] when = {"tomorrow", "two years from now", "three months from now"};
		String[] where = {"in the laboratory", "in the office"};

		int whoLength = who.length;
		int whenLength = when.length;
		int whereLength = where.length;

		java.util.Random randomGenerator = new java.util.Random();

		int whoIndex = randomGenerator.nextInt(whoLength);
		int whenIndex = randomGenerator.nextInt(whenLength);
		int whereIndex = randomGenerator.nextInt(whereLength);
		
		String sentence = who[whoIndex] + " is expected " + when[whenIndex] + " " + where[whereIndex] + ".";

		System.out.println(sentence);
	}
}