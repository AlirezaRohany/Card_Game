package ir.aut.hw6.Field;

import ir.aut.hw6.Cards.MonsterCard;
import ir.aut.hw6.Cards.Card;
import ir.aut.hw6.Cards.SpellCard;
import ir.aut.hw6.Cards.PowerCard;
import ir.aut.hw6.Cards.DestroySpell;

public class Field {
    private MonsterCard[] monsters;
    private Card[] spells;

    public Field() {
        monsters = new MonsterCard[5];
        spells = new Card[5];
    }

    public Field(MonsterCard[] monsters, Card[] spells) {
        this.monsters = monsters;
        this.spells = spells;
    }

    public void cardTurnEffects(Field enemyField) {
        for (Card spell : this.spells)
            if (spell != null) {
                if (spell instanceof PowerCard || spell instanceof SpellCard) spell.turnEffect(this, enemyField);
                else if (spell instanceof DestroySpell) ((DestroySpell) spell).instantEffect(this, enemyField);
            }
        for (MonsterCard monster : this.monsters) if (monster != null) monster.setCanAttack(true);
    }

    public boolean addMonsterCard(MonsterCard card) {
        return addCard(this.monsters, card);
    }

    public boolean addSpellCard(Card card) {
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

    public void destroySpell(int index) {
        this.spells[index] = null;
    }

    public void setPowerOfMonster(int index, int power) {
        this.monsters[index].setPower(power);
    }

    public MonsterCard[] getMonsters() {
        return monsters;
    }

    public Card[] getSpells() {
        return spells;
    }
}