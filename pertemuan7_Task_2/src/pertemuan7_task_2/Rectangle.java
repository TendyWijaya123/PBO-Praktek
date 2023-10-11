/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7_task_2;

/**
 *
 * @author Lenovo
 */
public class Rectangle  extends Shape{
    private double length;
    private double width;
    
    public Rectangle(){
        length=1.0;
        width=1.0;
    }
    
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
        
    }
    
    public Rectangle(double length, double width, String color, boolean filled){
        this.length=length;
        this.width=width;
        super.setColor(color);
        super.setFilled(filled);
        
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public String toString(){
        return "A Rectangle with width: "+width+" and length: "+length+", which is a subclass of "+this.getClass().getSuperclass();
    }
}
