package org.example;

public record User(int age, String name) implements Comparable<User> {

    @Override
    public int compareTo(User u) {
        if (name() == null || u.name() == null) {
            return 0;
        }
        return name().compareTo(u.name());
    }

    @Override
    public String toString() {
        return "User{" +
               "age=" + age +
               ", name='" + name + '\'' +
               '}';
    }
}
