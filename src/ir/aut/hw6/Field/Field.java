package ir.aut.hw6.Field;

import ir.aut.hw6.Cards.Card;
import ir.aut.hw6.Cards.MonsterCard;
import ir.aut.hw6.Cards.SpellCard;

public class Field {
    private MonsterCard[] monsters;
    private SpellCard[] spells;

    public Field() {
        monsters = new MonsterCard[5];
        spells = new SpellCard[5];
    }

    public Field(MonsterCard[] monsters, SpellCard[] spells) {
        this.monsters = monsters;
        this.spells = spells;
    }

    public void cardTurnEffects(Field enemyField) {
        for (SpellCard spell : this.spells) spell.turnEffect(this, enemyField);
        for (MonsterCard monster : this.monsters) monster.setCanAttack(true);
    }

    public boolean addMonsterCard(MonsterCard card) {
        return addCard(this.monsters, card);
    }

    public boolean addSpellCard(SpellCard card) {
        return addCard(this.spells, card);
    }

    private boolean addCard(Object[] objects, Card card) {
        if (objects[0] == null) {
            objects[0] = card;
            return true;
        } else if (objects[1] == null) {
            objects[1] = card;
            return true;
        } else if (objects[2] == null) {
            objects[2] = card;
            return true;
        } else if (objects[3] == null) {
            objects[3] = card;
            return true;
        } else if (objects[4] == null) {
            objects[4] = card;
            return true;
        }
        return false;
    }

    public MonsterCard[] getMonsters() {
        return monsters;
    }

    public SpellCard[] getSpells() {
        return spells;
    }
}