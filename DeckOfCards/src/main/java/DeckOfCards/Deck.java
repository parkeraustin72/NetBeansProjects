package DeckOfCards;


import DeckOfCards.Card;
import java.util.ArrayList;


public class Deck extends Card {
    
    private ArrayList deck;
    
    public Deck() { // Constructor
        this.deck = new ArrayList();
        for (CardValue card: CardValue.values())
            for (Suit suit:Suit.values())
                deck.add(new Card(card,suit));  
        // PP4.3/4.4 PG186
}
    
}
