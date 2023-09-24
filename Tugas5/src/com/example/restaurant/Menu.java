/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.restaurant;

/**
 *
 * @author Lenovo
 */
public class Menu {
    private String namaMakanan;
    private double hargaMakanan;
    private int  stok;
    
    

    /**
     * @return the namaMakanan
     */
    public String getNamaMakanan() {
        return namaMakanan;
    }

    /**
     * @param namaMakanan the namaMakanan to set
     */
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    /**
     * @return the hargaMakanan
     */
    public double getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @param hargaMakanan the hargaMakanan to set
     */
    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void addStok(int stok){
        this.stok+=stok;
    }
    
    public void substractStok(int  stok){
        this.stok-=stok;
    }
}
