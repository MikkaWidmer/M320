package org.example;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Tree tree = new Tree();
        Translator translator = new Translator();

        tree.addApple(apple);
        String description = translator.translate(tree);
        System.out.println(description);
    }
}

