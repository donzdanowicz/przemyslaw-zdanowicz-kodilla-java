package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private Square square;
    private Circle circle;
    private Triangle triangle;
    private Shape shape;
    int n;
    private List<Shape> collector = new ArrayList<>();

    public ShapeCollector() {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
        collector.add(shape);
    }

    public void removeFigure(Shape shape) {
        collector.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < collector.size()) {
            return collector.get(n);
        }
        return null;
    }

    public String showFigures() {
        String str ="";
        for(Shape figures: collector) {

            String figure = figures.getShapeName() + ", " + figures.getField();
            str += figure + ". ";

        }
        return str;
    }

    public int listSize() {
        return collector.size();
    }
}
