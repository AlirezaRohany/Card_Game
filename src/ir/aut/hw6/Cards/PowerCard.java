package ir.aut.hw6.Cards;

import ir.aut.hw6.Field.Field;

public class PowerCard extends SpellCard {
    public PowerCard() {
        super("Power Card", "Increases power of monsters by 100 each turn.");
    }

    public void turnEffect(Field ownerField, Field enemyField) {
        for (int i = 0; i < ownerField.getMonsters().length; i++)
            if (ownerField.getMonsters()[i] != null)
                ownerField.setPowerOfMonster(i, ownerField.getMonsters()[i].getPower() + 100);
    }

    public void destroyedEffect(Field ownerField, Field enemyField) {
        for (int i = 0; i < ownerField.getMonsters().length; i++)
            ownerField.setPowerOfMonster(i, ownerField.getMonsters()[i].getPower() - 300);
    }
}