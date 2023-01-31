package org.example;

public abstract class Shape implements Polygon {

    private final String kind;
    private final int y;
    private final int x;

    public Shape(String kind, int x, int y) {
        this.kind = kind;
        this.x = x;
        this.y = y;
    }

    abstract double getArea();

    abstract double getRange();

    abstract BoundingBox getBoundigBox();

    public String getKind() {
        return kind;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

}
