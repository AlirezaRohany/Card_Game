package ir.aut.hw6.Player;

import ir.aut.hw6.Cards.Card;
import ir.aut.hw6.Deck.CardDeck;
import ir.aut.hw6.Deck.SpecialDeck;
import ir.aut.hw6.Special.Special;

public class Player {
    private CardDeck mainDeck;
    private SpecialDeck specialDeck;
    private Card[] hand;
    private Special nextSpecial;
    private int lifePoints;

    public Player(CardDeck mainDeck, SpecialDeck specialDeck, int lifePoints) {
        this.mainDeck = mainDeck;
        this.specialDeck = specialDeck;
        this.lifePoints = lifePoints;
    }

    public Player(CardDeck mainDeck, SpecialDeck specialDeck) {
        this(mainDeck, specialDeck, 5000);
    }

    /*
    5 methods remain
     */
    public void changeLifePoints(int change) {
        lifePoints = lifePoints + change;
    }

    public boolean isDefeated() {
        return this.lifePoints <= 0;
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public Special getNextSpecial() {
        return nextSpecial;
    }

    public void setNextSpecial(Special nextSpecial) {
        this.nextSpecial = nextSpecial;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}