/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restaurant;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lenovo
 */
public class Restaurant {
    
    private static final Logger logger= Logger.getLogger(Restaurant.class.getName());
    private static final String MENU_FULL_MESSAGE = "Menu is full. Cannot add more items.";
    private static final String STOCK_INSUFFICIENT_MESSAGE = "Stock is insufficient.";
    private final Menu[] menuMakanan = new Menu[10];
    private byte id = 0;

    public void addMakanan(String namaMakanan, double hargaMakanan, int stok) {
        if (id < menuMakanan.length) {
            Menu newItem = new Menu();
            newItem.setNamaMakanan(namaMakanan);
            newItem.setHargaMakanan(hargaMakanan);
            newItem.setStok(stok);
            menuMakanan[id] = newItem;
            id++;
        } else {
            logger.severe(MENU_FULL_MESSAGE);
        }
    }

    public void tampilMenuMakanan() {
        for (byte i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                logger.log(Level.INFO, "{0} [{1}] ={2}", new Object[]{menuMakanan[i].getNamaMakanan(), menuMakanan[i].getStok(), menuMakanan[i].getHargaMakanan()});
            }
        }
    }

    public boolean isOutOfStock(byte i) {
        return menuMakanan[i].getStok() == 0;
    }
    
    public void addStok(int id,int stock){
        this.menuMakanan[id].addStok(stock);
    }
    
    public void addPemesanan(int id, int stok){
        if(this.menuMakanan[id].getStok()<stok){
            logger.severe(STOCK_INSUFFICIENT_MESSAGE);
        }else{
            this.menuMakanan[id].substractStok(stok);
        }
    }
}

