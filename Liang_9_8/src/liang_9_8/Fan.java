package liang_9_8;

import java.util.Date;

public class Fan {

    // First i set the atributes for the fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Then i create some private atributes for the default values
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Then i create a no arg constructor setting the specified defalut values
    public Fan() {
        this(SLOW, false, 5, "blue");
    }

    // Constructor that takes the startiing values of each of the data fields relative to the fans state

    public Fan(final int speed, final boolean on, final double radius, final String color) {

        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }

    // A method named toString that returns a string description for the fan

    @Override
    public String toString() {
        return this.on ? "Speed is " + this.speed + ", Color is " + this.color + ", Radius is " + this.radius + "." : "Color is " + this.color + ", Radius is " + this.radius + ". Fan is off.";
    }

    // Creating a method that returns the above values by the current date

    public String toString(Date date) {
        return date.toString() + ": " + this.toString();
    }

    // Creatiing the four getters(accessors) and setters(mutators) for the data fields.
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isON() {
        return on;
    }

    public void setON(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
