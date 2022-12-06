package org.example;

import java.util.Scanner;

/**
 * @since 2022
 * contains the game loop
 */
public class TipGame {


    private final Calculator calculator = new Calculator();

    /**
     * Starts the program
     *
     * @throws IncorrectInputException if tips are negative
     */
    public void run() throws IncorrectInputException {
        do {
            //simulates a game
            int goalTeam1 = calculator.getRandomNumber();
            int goalTeam2 = calculator.getRandomNumber();
            //tips from user
            int tip1 = getTip1();
            int tip2 = getTip2();

            //prints the result
            System.out.println("Result: " + goalTeam1 + " : " + goalTeam2);
            // print the earned points and a short message
            System.out.println(calculator.calculateScore(tip1, tip2, goalTeam1, goalTeam2));
            // prints the total points
            System.out.println("Points:" + calculator.getPoints());
        }
        while (calculator.getPoints() <= 10);
    }

    /**
     * Gets the tip1 from the User via scanner
     *
     * @return int tip1 from scanner
     */
    private int getTip1() {
        //repeat while input is an int
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Tipp Team 1");
                return scanner.nextInt();
            } catch (Exception ignored) {
            }
        } while (true);
    }

    /**
     * Gets the tip2 from the User via scanner
     *
     * @return int tip2 from scanner
     */
    private int getTip2() {
        //repeat while input is an int
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


