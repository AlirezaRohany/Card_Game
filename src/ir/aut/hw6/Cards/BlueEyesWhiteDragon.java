package ir.aut.hw6.Cards;

import ir.aut.hw6.Field.Field;
import ir.aut.hw6.Special.Special;

public class BlueEyesWhiteDragon extends MonsterCard implements Special {
    public BlueEyesWhiteDragon() {
        super("Blue Eyes White Dragon", "The best card.", 3000, true);
    }

    public void instantEffect(Field owner, Field enemy) {
        if (owner.addMonsterCard(new BlueEyesWhiteDragon())) owner.addMonsterCard(new BlueEyesWhiteDragon());
    }
}