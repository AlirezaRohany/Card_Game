package ir.aut.hw6.Cards;

public abstract class TrapCard extends Card implements Special {
    public TrapCard(String name, String description) {
        super(name, description);
    }

    public boolean equals(TrapCard trapCard) {
        return super.equals(trapCard);
    }
}
