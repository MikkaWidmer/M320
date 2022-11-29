package org.example;

import java.util.Random;

public class Calculator {

    private int points;

    public Calculator(){
        points = 0;
    }

    public int getRandomNumber(){
        Random random = new Random();
        int min = 0;
        int max = 10;
        return random.nextInt(max - min + 1) + min;
    }

    public String calculateScore(int tip1, int tip2, int goal1, int goal2){
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
