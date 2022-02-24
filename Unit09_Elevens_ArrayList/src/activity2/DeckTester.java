package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king", "five", "seven"};
		String[] suits = {"clubs", "spades", "hearts", "hearts", "diamonds"};
		int[] values = {11, 12, 13, 5, 7};
		Deck d = new Deck(ranks, suits, values);
		System.out.println(d.isEmpty());
		System.out.println(d);
		d.shuffle();
		System.out.println(d);
		d.deal();
		System.out.println(d);
	}
}
