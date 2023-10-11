/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg7;

/**
 *
 * @author Lenovo
 */
/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class

    double radius;
    private String color;

    // Constructors (overloaded)
    /**
     * Constructs a Circle instance with default value for radius and color
     */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     */
    public Circle(double r, String color) {
        radius = r;
        this.color =  color;
    }

    /**
     * Returns the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the area of this Circle instance
     * @return 
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + getColor() + "]";
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}

