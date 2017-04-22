package ir.aut.hw6.Cards;

import ir.aut.hw6.Field.Field;

public abstract class SpellCard extends Card {
    public SpellCard(String name, String description) {
        super(name, description);
    }

    abstract void turnEffect(Field ownerField, Field enemyField);

    abstract void destroyedEffect(Field ownerField, Field enemyField);

    public boolean equals(SpellCard spellCard) {
        return super.equals(spellCard);
    }
}