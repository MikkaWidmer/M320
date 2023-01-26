package org.example;

public class BoundingBox {
    private final int top;
    private final int bottom;
    private final int left;
    private final int right;

    public BoundingBox(int top, int bottom, int right, int left) {
        this.top = top;
        this.bottom = bottom;
        this.right = right;
        this.left = left;
    }

    @Override
    public String toString() {
        return "BoundingBox{" +
                "top=" + getTop() +
                ", bottom=" + getBottom() +
                ", left=" + getLeft() +
                ", right=" + getRight() +
                '}';
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
