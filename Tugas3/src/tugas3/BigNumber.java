/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

import java.math.BigInteger;

/**
 *
 * @author Lenovo
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String letter=sc.nextLine();
        BigInteger angka1= new BigInteger(letter);
        letter=sc.nextLine();
        BigInteger angka2= new BigInteger(letter);
        
        BigInteger sum= angka1.add(angka2);
        BigInteger multiplication= angka1.multiply(angka2);
        System.out.println(sum);
        System.out.println(multiplication);

        
    }
    
}
