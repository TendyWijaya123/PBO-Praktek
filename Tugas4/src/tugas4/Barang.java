/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Lenovo
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama;
        stok=stk;
    }
    
    public void addStok(int stok){
        if(stok>0){
        this.setStok(this.getStok() + stok);
        }
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
}
