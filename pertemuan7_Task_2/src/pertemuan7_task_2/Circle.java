/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7_task_2;

/**
 *
 * @author Lenovo
 */
public class Circle extends Shape {

    private double radius;

    public Circle() {//default constructor
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

//    public double getPerimeter(){
//        
//    }
    @Override
    public String toString() {
        return "Circle  with radius : " + getRadius() + " which is a subclass of" + this.getClass().getSuperclass();
    }

}
