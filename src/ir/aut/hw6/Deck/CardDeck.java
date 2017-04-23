package ir.aut.hw6.Deck;

import ir.aut.hw6.Cards.Card;

public class CardDeck extends ObjectDeck {
    public CardDeck(Card[] cards) {
        super(cards);
    }

    public Card deal() {
        return (Card) super.deal();
    }
}