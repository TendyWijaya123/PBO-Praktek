/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author Lenovo
 */
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int gaji=500000;
        System.out.print("Berapa item yang terjual: ");
        int hargaItem=50000;
        int item=sc.nextInt();
        double gajiAkhir;
        if(item>=40 && item<80){
            gajiAkhir=gaji+(hargaItem*item*0.25);
        }else if(item >=80){
            gajiAkhir=gaji+(hargaItem*item*0.35);
        }else if(item<15){
            gajiAkhir=gaji-(hargaItem*(15-item)*0.15);
        }else{
            gajiAkhir=gaji+(hargaItem*item*0.10);
        }
        System.out.println(item);
        System.out.println("hasil akhir adalah "+(int)gajiAkhir);
    }
    
}
