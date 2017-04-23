package ir.aut.hw6.Field;

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

    /*
    3 methods remains to write
     */
    public MonsterCard[] getMonsters() {
        return monsters;
    }

    public SpellCard[] getSpells() {
        return spells;
    }
}
