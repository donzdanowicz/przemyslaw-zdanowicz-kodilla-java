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
        String figureName = collector.get(n).getShapeName();
        int figureField = collector.get(n).getField();
        String str ="";
        for(Shape figures: collector) {
            //find a way to do it
            n++;
            return figures.getShapeName() + ", circle";// + collector.get(n).getShapeName() + figureField + collector.size();

        }
        //return "Figure #" + n+1 + ": " + figureName + ", field: " + figureField;
        return null;
    }

    public int listSize() {
        return collector.size();
    }
}
