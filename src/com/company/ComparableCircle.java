package com.company;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius()>o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -2;
        else return 1;
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
