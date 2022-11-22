package org.example;

import java.util.Scanner;

public class TipGame {

    private final Scanner scanner = new Scanner(System.in);
    private final Calculator calculator = new Calculator();

    public void run() {
        do {
            int goalTeam1 = calculator.getRandomNumber();
            int goalTeam2 = calculator.getRandomNumber();
            System.out.println("Tipp Team 1");
            int tip1 = scanner.nextInt();
            System.out.println("Tipp Team 2");
            int tip2 = scanner.nextInt();
            System.out.println("Result: " + goalTeam1 + " : " + goalTeam2);
            System.out.println(calculator.calculateScore(tip1, tip2, goalTeam1, goalTeam2));
            System.out.println("Points:" + calculator.getPoints());
        }
        while (calculator.getPoints() <= 10);
    }
}


