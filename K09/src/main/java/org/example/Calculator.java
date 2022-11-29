package org.example;

import java.util.Random;

/**
 * contains all logic methods
 * @author nicustei
 */
public class Calculator {

    //class fields
    private int points;

    /**
     * constructor set score to null
     */
    public Calculator(){
        points = 0;
    }

    /**
     * get Random number between 0 and 10
     * @return int
     *
     */
    public int getRandomNumber(){
        Random random = new Random();
        int min = 0;
        int max = 10;
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * calculate the score, with the tips from the user, throws if params are negative
     * @param tip1 int
     * @param tip2 int
     * @param goal1 int
     * @param goal2 int
     * @return String
     * @throws IncorrectInputException when input is negative
     */
    public String calculateScore(int tip1, int tip2, int goal1, int goal2) throws IncorrectInputException{
        if (tip1 < 0 || tip2 < 0|| goal1 < 0 || goal2 < 0){
            throw new IncorrectInputException("Number is negative");
        }
        else if (tip2 == goal2 && tip1 == goal1){ //if tip is equal game score
            points = points + 3;
            return "Correct Result!!";
        } else if (tip1 > tip2 && goal1 > goal2||tip1 < tip2 && goal1 < goal2) { // if goal difference is correct
            points = points + 2;
            return "Correct winner!!";
        }else { // wrong tip
            points = points + 1;
            return "Wrong Tip!!";
        }
    }

    //getter and setter for private fields

    /**
     *
     * @return int points of user
     */
    public int getPoints() {
        return points;
    }

    /**
     * setter for points of user
     * @param points int
     */
    public void setPoints(int points) {
        this.points = points;
    }

}
