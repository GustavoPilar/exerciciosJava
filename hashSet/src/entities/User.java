package entities;

import java.time.Instant;
import java.util.Objects;

public class User {
    private final String name;
    private final Instant moment;

    public User(String name, Instant moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public Instant getMoment() {
        return moment;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", moment=" + moment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
