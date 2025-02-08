import java.util.ArrayList;

/**
 * The Deck class holds the cards used in the game and holds methods that relate to the deck.
 * @author Rachel Hussmann
 */
public class Deck extends Card{

    private ArrayList<Card> deckOfCards;

    public ArrayList<Card> generateDeck(int numOfPokemon, int numOfEnergies){
        ArrayList<Card> deck = new ArrayList<>();

        for(int i = 0; i < numOfPokemon; i++){
            deck.add(new Card(new Pokemon()));
        }

        for(int i = 0; i < numOfEnergies; i++){
            deck.add(new Card(new Energy()));
        }

        return deck;
    }

}
