//Dardan Demiri
//February 12th, 2015

package Activity1;
/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {
	private String suit;
	private String rank;
	private int pointValue;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            rank = cardRank;
            suit = cardSuit;
            pointValue = cardPointValue;
            
	}
	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            return suit;
   }
	public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            return rank;
        }
	public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            return pointValue;
        }
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            if (suit==otherCard.suit() && pointValue == otherCard.pointValue() && rank == otherCard.rank())
                return true;
            else
                return false;
        }
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
            return rank + " of " + suit + " - Point value: " + pointValue;
        }
}
