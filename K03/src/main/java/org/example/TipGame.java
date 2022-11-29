package org.example;

import java.util.Scanner;

public class TipGame {


    private final Calculator calculator = new Calculator();

    public void run() throws IncorrectInputException {
        do {
            int goalTeam1 = calculator.getRandomNumber();
            int goalTeam2 = calculator.getRandomNumber();
            int tip1 = getTip1();
            int tip2 = getTip2();

            System.out.println("Result: " + goalTeam1 + " : " + goalTeam2);
            System.out.println(calculator.calculateScore(tip1, tip2, goalTeam1, goalTeam2));
            System.out.println("Points:" + calculator.getPoints());
        }
        while (calculator.getPoints() <= 10);
    }

    private int getTip1() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Tipp Team 1");
                return scanner.nextInt();
            } catch (Exception ignored) {
            }
        } while (true);
    }

    private int getTip2() {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Tipp Team 2");
                return scanner.nextInt();
            } catch (Exception ignored) {
            }
        } while (true);
    }
}


