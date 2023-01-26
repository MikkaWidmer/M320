package org.example;

public class Circle extends Shape implements Polygon {
    private final int durchmesser;
    private final int radius;

    public Circle(String kind, int durchmesser, int x, int y) {
        super(kind, x, y);
        this.durchmesser = durchmesser;
        this.radius = durchmesser / 2;
    }

    @Override
    public double getArea() {
        return getRadius() * getRadius() * getPi();
    }

    @Override
    public double getRange() {
        return getDurchmesser() * getPi();
    }

    @Override
    BoundingBox getBoundigBox() {
        int top = getY() + getRadius();
        int bottom = getY() - getRadius();
        int right = getX() + getRadius();
        int left = getX() - getRadius();
        return new BoundingBox(top, bottom, right, left);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "\ndurchmesser = " + getDurchmesser() +
                "\nradius = " + getRadius() +
                "\npi = " + getPi() +
                "\nTyp = " + getKind() + "\nFläche = " + getArea() + "\nUmfang = " + getRange() +
                "\nKoordinate = " + getX() + "/" + getY() +
                '}';
    }

    @Override
    public void countCorners() {
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public int getRadius() {
        return radius;
    }

    public double getPi() {
        return 3.14;
    }
}
