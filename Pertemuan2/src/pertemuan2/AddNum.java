/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;
import java.io.*;
/**
 *
 *  *<h1>Add Two Numbers</h1> 
 * <p>
 * The AddNumProgram implements an application that
 * simply adds two given integer numbers and Prints
 * the output on  the screen.
 * <b>Note;</b> Giving proper comments in your program userfriendlly and it is assume as a hight  quality code.
 * </p>
 *
 * @author :Tendy Wijaya
 * @version 1.0
 * @since 2023/08/31
 */


/**
 *<h1>Add Two Numbers</h1>
 *The AddNumProgram implements an application
 * 
 * 
 * 
 * 
 */
public class AddNum {

    /**
     * @param args the command line arguments
     * @param numA
     * @param numB
     */
    public int addNum( int numA, int numB){
        return numA+numB;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AddNum obj=new AddNum();
        int sum=obj.addNum(10,20);
        System.out.println("Sum of 10 and 20 is "+ sum);
    }
    
}
