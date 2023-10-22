/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.StudiKasus2;

/**
 *
 * @author Lenovo
 */
public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    
    
    //return  surface area of cylinder
    @Override
    public double  area(){
        return (Math.PI*radius*radius*2)+(2*Math.PI*radius*height);
    }
    
    @Override
    public String toString(){
        return super.toString()+" of radius  and height "+ radius+" and "+height;
    }
}
