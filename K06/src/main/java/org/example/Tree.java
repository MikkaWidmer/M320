package org.example;

import java.util.ArrayList;

public class Tree {
    private final ArrayList<Apple> apples;
    private int count;


    public Tree() {
        apples = new ArrayList<Apple>();
    }

    public void addApple(Apple apple) {
        apples.add(apple);
        increaseCount();
    }

    public int getCount() {
        return count;
    }

    public void increaseCount() {
        count++;
    }


    public ArrayList<Apple> getApples() {
        return apples;
    }
}
