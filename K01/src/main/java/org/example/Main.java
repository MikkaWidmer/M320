package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int points = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int goalTeam1 = getRandomNumber();
            int goalTeam2 = getRandomNumber();
            System.out.println("Tipp Team 1");
            int tip1 = scanner.nextInt();
            System.out.println("Tipp Team 2");
            int tip2 = scanner.nextInt();
            System.out.println("Result: " + goalTeam1 + " : " + goalTeam2);
            System.out.println(calculateScore(tip1,tip2,goalTeam1,goalTeam2));
            System.out.println("Points:" + points);
        }
        while (points <= 10);
    }

    public static int getRandomNumber(){
        Random random = new Random();
        int min = 0;
        int max = 10;
        return random.nextInt(max - min + 1) + min;
    }

    public static String calculateScore(int tip1, int tip2, int goal1, int goal2){
        if (tip2 == goal2 && tip1 == goal1){
            points = points + 3;
            return "Correct Result!!";
        } else if (tip1 > tip2 && goal1 > goal2||tip1 < tip2 && goal1 < goal2) {
            points = points + 2;
            return "Correct winner!!";
        }else {
            points = points + 1;
            return "Wrong Tip!!";
        }
    }
}