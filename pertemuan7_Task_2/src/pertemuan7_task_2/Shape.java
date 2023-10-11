/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7_task_2;

/**
 *
 * @author Lenovo
 */
public class Shape {
    private String color;
    private boolean filled;
    
    //First Constructor
    public Shape(){
        color="green";
        filled=true;
    }
    
    //Second Constructor with given color and filled values
    public Shape(String c, boolean f){
        color=c;
        filled=f;
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

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
    
    @Override
    public String toString(){
       var message=isFilled() ? "filled" :"not filled";
       return "A Shape  with color of "+color+ " and " +message;
    }
    
    
    
    
}