/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.restaurant;

/**
 *
 * @author Lenovo
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurant menu= new Restaurant();
        menu.addMakanan("Tahu", 7_000, 10);
        menu.addMakanan("Tahu", 7_000, 10);
        menu.addMakanan("Tahu", 7_000, 10);
        menu.addMakanan("Tahu", 7_000, 10);
        menu.tampilMenuMakanan();
        menu.addStok(1, 20);
        menu.addPemesanan(1, 5);
        menu.tampilMenuMakanan();
    }
    
}
