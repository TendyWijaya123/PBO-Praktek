/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7_task_2;

/**
 *
 * @author Lenovo
 */
public class Square extends Rectangle {
    
    public Square(double side){
        super(side,side);
    }
    
    @Override
    public String toString(){
        return super.getLength()+"A Rectangle with width side: "+super.getWidth()+", which is a subclass of "+this.getClass().getSuperclass();
    }
    
}
