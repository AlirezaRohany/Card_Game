package ir.aut.hw6.Cards;

import ir.aut.hw6.Field.Field;

public class DestroySpell extends TrapCard {
    public DestroySpell() {
        super("Destroy Spell", "Destroys the enemy’s first spell card.");
    }

    public void instantEffect(Field owner, Field enemy) {
        for (int i = 0; i < enemy.getSpells().length; i++) {
            if (enemy.getSpells()[i] != null) {
                enemy.destroySpell(i);
                break;
            }
        }
    }
}