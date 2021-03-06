package ir.aut.hw6.Cards;

import ir.aut.hw6.Field.Field;

import java.util.Objects;

public abstract class Card {
    private String name;
    private String description;

    Card(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Card() {
    }

    public boolean equals(Card card) {
        return this.getClass() == card.getClass() && Objects.equals(this.name, card.name) && Objects.equals(this.description, card.description);
    }

    public void turnEffect(Field owner, Field enemy) {
    }

    public String toString() {
        return this.name + ": " + this.description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}