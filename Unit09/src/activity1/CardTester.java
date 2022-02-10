package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card object1 = new Card("Queen", "Hearts", 12);
		Card object2 = new Card("King", "Diamonds", 13);
		Card object3 = new Card("Five", "Spades", 5);
		
		object1.matches(object2);
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
		
	}
}
