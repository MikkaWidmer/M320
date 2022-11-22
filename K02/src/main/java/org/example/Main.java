package org.example;

public class Main {
    private static final TipGame tipGame = new TipGame();

    public static void main(String[] args) throws Exception {
        try {
            tipGame.run();
        } catch (Exception e) {
            throw new MyException().wrongInputException();
        }
    }
}