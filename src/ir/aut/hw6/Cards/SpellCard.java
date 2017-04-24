package ir.aut.hw6.Cards;

import ir.aut.hw6.Field.Field;

public abstract class SpellCard extends Card {
    SpellCard(String name, String description) {
        super(name, description);
    }

    public abstract void turnEffect(Field ownerField, Field enemyField);

    public abstract void destroyedEffect(Field ownerField, Field enemyField);

    public boolean equals(SpellCard spellCard) {
        return super.equals(spellCard);
    }
}