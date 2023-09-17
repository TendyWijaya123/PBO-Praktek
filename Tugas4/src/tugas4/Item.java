/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Lenovo
 */
public class Item {
    private String name="ipin";
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        this();//call item()
        System.out.println(this.name);
    }
    
    
}
