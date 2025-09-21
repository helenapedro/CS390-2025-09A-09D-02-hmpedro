package dshandson.minproject;

import java.util.Objects;

public class Consonant {
    String name;
    int asciiValue;

    public Consonant(String name, int asciiValue) {
        this.name = name;
        this.asciiValue = asciiValue;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", ascii=" + asciiValue + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, asciiValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (! (o instanceof Consonant c)) {
            return false;
        }
        return Objects.equals(name, c.name) && asciiValue == c.asciiValue;
    }
}
