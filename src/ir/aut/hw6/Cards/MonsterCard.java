package ir.aut.hw6.Cards;

public class MonsterCard extends Card {
    int power;
    int basePower;
    boolean canAttack;

    public MonsterCard(String name, String description, int power, boolean canAttack) {
        this.setName(name);
        this.setDescription(description);
        this.power = power;
        this.basePower = power;
        this.canAttack = canAttack;
    }

    public MonsterCard(String name, String description, int power) {
        this(name, description, power, false);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean getCanAttack() {
        return canAttack;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }

    public int getBasePower() {
        return basePower;
    }

    public boolean equals(MonsterCard monsterCard) {
        return super.equals(monsterCard) && this.power == monsterCard.power && this.basePower == monsterCard.basePower;
    }

    public String toString() {
        return super.toString() + " | power: " + power + " | Can attack: " + canAttack;
    }
}