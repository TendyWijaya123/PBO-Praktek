/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author Lenovo
 */
public class Soal2InputOutputJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String[] word= new String[3];
        int[] angka= new int[3];
        // Read input
        for(int i=0;i<3;i++){
            word[i] = scanner.nextLine();
            angka[i] = scanner.nextInt();
            scanner.nextLine(); 
        }
        
        for(int i=0; i<3;i++){
            String buffer=String.format("%-15s", word[i]);
            System.out.printf( buffer);
            buffer=String.format("%03d", angka[i]);
            System.out.printf(buffer+"\n");
        }
    }    
}
