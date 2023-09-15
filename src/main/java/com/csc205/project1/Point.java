package com.csc205.project1;

/*
Created by Zach Crandall and ChatGPT. Here is the prompt given to ChatGPT to
generate the code:

"Create a Java class titled "Point" using the following UML:

Point
---------------
x - double
y - double
---------------
Point()
Point(double, double)
---------------
distance(Point) - double
getX() - double
setX(double) - void
getY() - double
setY(double) - void
setPoint(double, double) - void
shiftX(double) - void
shiftY(double) - void
rotate(double) - void
toString() - String"

 Had to edit the toString() method so that it returns the correct output.
 */


public class Point {
    // Private member variables
    private double x;
    private double y;

    // Constructors
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate distance between two points
    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.getX();
        double dy = this.y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    // Set both x and y
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift the x coordinate by a certain amount
    public void shiftX(double amount) {
        this.x += amount;
    }

    // Shift the y coordinate by a certain amount
    public void shiftY(double amount) {
        this.y += amount;
    }

    // Rotate the point by a certain angle (in radians) counterclockwise
    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }

    // Override toString() method to provide a string representation of the point
    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }
}