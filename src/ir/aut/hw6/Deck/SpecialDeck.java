package ir.aut.hw6.Deck;

import ir.aut.hw6.Special.Special;

public class SpecialDeck extends ObjectDeck {
    public SpecialDeck(Special... specials) {
        super(specials);
    }

    public Special deal() {
        return (Special) super.deal();
    }
}