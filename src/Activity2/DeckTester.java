package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    
   
    public static void main(String[] args) {
        String ranks[] = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String suits[] = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int values[] = {11,10,10,10,10,9,8,7,6,5,4,3,2};
        Deck d = new Deck(ranks, suits, values);
        System.out.println("Dealt a " + d.deal());
        System.out.println("Dealt a " + d.deal());
        System.out.println("Dealt a " + d.deal());
        System.out.println(d);
        
        
    }
}
