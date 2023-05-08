package java_objects;

import org.w3c.dom.css.Rect;

import java.util.concurrent.RecursiveAction;

public class Rectangle {
    protected double length;
    protected double width;
    protected int sides = 4;

    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void print() {
        System.out.println("I am aa rectangle");
    }

    public double calculateParameter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
