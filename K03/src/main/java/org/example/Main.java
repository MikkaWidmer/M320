package org.example;

public class Main {
    private static final TipGame tipGame = new TipGame();

    public static void main(String[] args) {
        try {
            tipGame.run();
        } catch (IncorrectInputException e){
            System.out.println(e);
        }

    }
}