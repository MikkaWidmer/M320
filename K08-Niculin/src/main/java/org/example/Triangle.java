package org.example;

public class Triangle extends Shape implements Polygon {
    private final int kathete1;
    private final int kathete2;
    private final int hypothenuse;
    private final int hight;


    public Triangle(int kathete1, int kathete2, int hypothenuse, int hight, String kind, int x, int y) {
        super(kind, x, y);
        this.kathete1 = kathete1;
        this.kathete2 = kathete2;
        this.hypothenuse = hypothenuse;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return getHypothenuse() * getHight() / 2;
    }

    @Override
    public double getRange() {
        return getKathete1() + getKathete2() + getHypothenuse();
    }

    @Override
    BoundingBox getBoundigBox() {

        int top = getY() + getHight();
        int bottom = getY();
        int right = getX() + getHypothenuse();
        int left = getX();

        return new BoundingBox(top, bottom, left, right);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "\nTyp = " + getKind() + '\'' +
                "\nkathete1 = " + getKathete1() +
                "\nkathete2 = " + getKathete2() +
                "\nhypothenuse = " + getHypothenuse() +
                "\nhight = " + getHight() +
                "\nrange = " + getRange() +
                "\nvolume = " + getArea() +
                "\nKoordinate = " + getX() + "/" + getY() +
                '}';
    }

    public int getKathete1() {
        return kathete1;
    }

    public int getKathete2() {
        return kathete2;
    }

    public int getHypothenuse() {
        return hypothenuse;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public void countCorners() {
    }

}

