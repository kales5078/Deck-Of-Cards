package cards;
import java.util.HashSet;
import java.util.Set;

public class Deckofcard {

	public static void main(String[] args) {

        String[] suits = {"Diamond", "Heart", "Spades", "Club"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
       
        String[][] cardCombo = new String[4][13];
        Set<String> cards = new HashSet<String>();

	//Initialsation of cards
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardCombo[i][j] = suits[i] + rank[j];
            }
        }
	}
}
