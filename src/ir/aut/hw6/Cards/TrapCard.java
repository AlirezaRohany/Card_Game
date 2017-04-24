package ir.aut.hw6.Cards;

import ir.aut.hw6.Special.Special;

public abstract class TrapCard extends Card implements Special {
    public TrapCard(String name, String description) {
        super(name, description);
    }
 TrapCard(){}
    public boolean equals(TrapCard trapCard) {
        return super.equals(trapCard);
    }
}