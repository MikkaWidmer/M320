package org.example;

public class User implements Comparable<User>{
    private final int age;
    private final String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User u) {
        if (getName() == null || u.getName() == null) {
            return 0;
        }
        return getName().compareTo(u.getName());
    }

}
