package ir.aut.hw6.Player;

import ir.aut.hw6.Cards.BlueEyesWhiteDragon;
import ir.aut.hw6.Cards.Card;
import ir.aut.hw6.Cards.MonsterCard;
import ir.aut.hw6.Cards.SpellCard;
import ir.aut.hw6.Deck.CardDeck;
import ir.aut.hw6.Deck.SpecialDeck;
import ir.aut.hw6.Field.Field;
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
        this.hand = new Card[5];
    }

    public Player(CardDeck mainDeck, SpecialDeck specialDeck) {
        this(mainDeck, specialDeck, 5000);
    }

    /*
    doubt about draw, drawSpecial, nextTurnPrep, playCardFromHand, playSpecial methods
     */
    public boolean draw(int count) {
        int k = 0;
        for (int i = 0; i < count; i++) {
            if (k == hand.length) return true;
            if (mainDeck.isEmpty()) return false;
            if (hand[k] == null) {
                hand[k] = mainDeck.deal();
                k++;
            } else {
                i--;
                k++;
            }
        }
        return true;
    }

    public void drawSpecialCard() {
        if (nextSpecial == null) nextSpecial = specialDeck.deal();
    }

    public void nextTurnPrep() {
        this.drawSpecialCard();
        if (this.draw(1)) {
        } else {
            this.changeLifePoints(-500);
        }
    }

    public boolean playCardFromHand(int whichCard, Field myField) {
        if (hand[whichCard] == null) return false;
        if (whichCard >= hand.length) return false;
        if (hand[whichCard] instanceof MonsterCard) {
            if (myField.addMonsterCard((MonsterCard) hand[whichCard])) {
                hand[whichCard] = null;
                return true;
            } else return false;
        } else if (hand[whichCard] instanceof SpellCard) {
            if (myField.addSpellCard((SpellCard) hand[whichCard])) {
                hand[whichCard] = null;
                return true;
            } else return false;
        } else return false;
    }

    public boolean playSpecial(Field myField) {
        if (nextSpecial == null) return false;
        if (nextSpecial instanceof BlueEyesWhiteDragon) {
            if (myField.addMonsterCard((MonsterCard) nextSpecial)) {
                nextSpecial = null;
                return true;
            }
        } else if (myField.addSpellCard((SpellCard) nextSpecial)) {
            nextSpecial = null;
            return true;
        }
        return false;
    }

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