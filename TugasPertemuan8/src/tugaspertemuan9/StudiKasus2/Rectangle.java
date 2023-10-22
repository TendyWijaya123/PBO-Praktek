/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.StudiKasus2;

/**
 *
 * @author Lenovo
 */
public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        super("Rectangle");
        this.width=width;
        this.length=length;
    }
    
    @Override
    public double area(){
        return length*width;
    }
    
    @Override
    public String toString(){
        return super.toString()+" of length and width"+length+" and "+width;
    }
}
