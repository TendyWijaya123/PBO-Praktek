/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.StudiKasus2;

/**
 *
 * @author Lenovo
 */
public class Paint {

    private double coverage; //number of square feet per gallon

    //Constructor 
    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape a) {
        System.out.println("Computing  amount for " + a);
        return a.area()/coverage;
    }
}
