/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan9.StudiKasus3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        intList = new String[size];

        System.out.println("\nEnter the numbers");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.next();
        }

        Sorting.selectionSort(intList);
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();
    }

}
