package org.example;

import java.util.LinkedList;
import java.util.List;

public class ShapeCollection {
    private final List<Shape> collection = new LinkedList<>();

    public void addShape(Shape shape) {
        getCollection().add(shape);
    }

    public void printCollection() {
        for (Shape shape : getCollection()) {
            System.out.println(shape);
        }

    }

/*    public void getSumOfAlRanges() {
        double sum = 0;
        for (Shape shape : getCollection()) {
            sum += shape.getRange();
        }
        System.out.println(sum);
    }*/

/*
    public void getSumOfAlAreas() {
        double sum = 0;
        for (Shape shape : getCollection()) {
            sum += shape.getArea();
        }
        System.out.println(sum);
    }
*/

    public BoundingBox getSuperBoundigngBox() {
        int top = Integer.MIN_VALUE;
        int bottom = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int left = Integer.MAX_VALUE;
        for (Shape shape : collection) {
            top = calculateTop(top, shape);
            bottom = calculateBottom(bottom, shape);
            right = calculateRight(right, shape);
            left = calculateLeft(left, shape);
        }
        return new BoundingBox(top, bottom, right, left);
    }

    public int calculateTop(int currentTop, Shape shape) {

        return Math.max(shape.getBoundigBox().getTop(), currentTop);


    }

    public int calculateBottom(int currentBottom, Shape shape) {

        return Math.min(shape.getBoundigBox().getBottom(), currentBottom);


    }

    public int calculateRight(int currentRight, Shape shape) {

        return Math.max(shape.getBoundigBox().getRight(), currentRight);
    }

    public int calculateLeft(int currentLeft, Shape shape) {


        return Math.min(shape.getBoundigBox().getLeft(), currentLeft);
    }

    public List<Shape> getCollection() {
        return collection;
    }
}
