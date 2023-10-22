/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.StudiKasus2;

/**
 *
 * @author Lenovo
 */
abstract public class Shape {
    private String shapeName;
    
    
    public Shape(String shapeName){
        this.shapeName=shapeName;
    }
    public abstract double area();
    
    @Override
    public String toString(){
        return shapeName;
    }
}
