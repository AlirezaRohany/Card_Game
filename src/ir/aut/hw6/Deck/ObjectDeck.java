package ir.aut.hw6.Deck;

public abstract class ObjectDeck {
    private Object[] objects;

    ObjectDeck(Object[] objects) {
        this.objects = objects;
    }

    public ObjectDeck() {
    }

    public Object deal() {
        if (this.isEmpty()) return null;
        Object nextItem = objects[objects.length - 1];
        Object[] newObjects = new Object[objects.length - 1];
        for (int i = 0; i < objects.length - 1; i++) newObjects[i] = this.objects[i];
        this.objects = newObjects;
        return nextItem;
    }

    public boolean isEmpty() {
        return this.objects.length == 0;
    }

    public int size() {
        return objects.length;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }
}