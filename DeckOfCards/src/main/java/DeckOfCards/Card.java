package DeckOfCards;

public class Card  {
    public enum Suit {HEARTS, SPADES, DIAMONDS, CLUBS} // End of enum suit
    
    public enum CardValue{
        Two(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), 
        NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
        
        private int cardValue;
        
        private CardValue (int value) // Constructor
        {
            this.cardValue = value;
        }
        
        public int getCardValue() // cardValue getter
        {
            return cardValue;
        }
    } // end of enum cardValue
    
    private Suit suit;
    private CardValue cardValue;

    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }
    
    
}
