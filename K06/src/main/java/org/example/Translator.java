package org.example;

public class Translator {
    public String translate(Tree tree) {
        int appleCount = 0;
        for (Apple apple : tree.getApples()) {
            appleCount += tree.getCount();
        }
        return "tree: " + appleCount + " apples";
    }
}
