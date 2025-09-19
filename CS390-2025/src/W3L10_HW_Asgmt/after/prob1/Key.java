package W3L10_HW_Asgmt.after.prob1;

import java.util.Objects;

public class Key {
	private final String firstName;
	private final String lastName;

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof Key key) {
            return  firstName.equals(key.firstName) &&
                    lastName.equals(key.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("first name: %s, last name: %s", firstName, lastName);
    }

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
