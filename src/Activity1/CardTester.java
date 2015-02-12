package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	public static void main(String[] args) {
		Card c1, c2, c3;
                c1 = new Card("Queen", "Spades", 10);
                c2 = new Card("Ace", "Hearts", 1);
                c3 = new Card("6", "Clubs", 6);
                System.out.println(c1);
                System.out.println(c2);
                System.out.println(c3);
                
                if (c1.matches(c3))
                    System.out.println("Card 1 and Card 3 match");
                else 
                    System.out.println("Card 1 and Card 3 do not match");
                if (c1.matches(c2))
                    System.out.println("Card 1 and Card 2 match");
                else
                    System.out.println("Card 1 and Card 2 do not match");
            System.out.println("Card 1 is the suit "+ suit);
        }
}
