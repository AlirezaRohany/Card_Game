package ir.aut.hw6.Cards;

import java.util.Objects;

public class Card {
    private String name;
    private String description;

    public Card(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean equals( Card card) {
        return Objects.equals(this.name, card.name) && Objects.equals(this.description, card.description);
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
