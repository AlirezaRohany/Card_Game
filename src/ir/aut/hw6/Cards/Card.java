package ir.aut.hw6.Cards;

import java.util.Objects;

public class Card {
    private String name;
    private String description;

    public Card(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean equals(Card card1, Card card2) {
        return Objects.equals(card1.name, card2.name) && Objects.equals(card1.description, card2.description);
    }

    public String toString(Card card) {
        return card.name + ": " + card.description;
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
