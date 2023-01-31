package org.example;

/**
 * @author nicustei
 */
public class ShapesMain {
    /**
     * java main method
     * @param args
     */
    public static void main(String[] args) {
       CalculateLoop calculateLoop = new CalculateLoop();
        try {
            calculateLoop.run();
        } catch (InvalidTypeException e) {
            System.out.println(e);
        }
    }
}
