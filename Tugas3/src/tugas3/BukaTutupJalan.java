/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author Lenovo
 */
public class BukaTutupJalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc= new java.util.Scanner(System.in);
        String platNomor=sc.nextLine();
        String[] pisahPlat=platNomor.split(" ");
        String Concatenate=new String();
        for (String pisahPlat1 : pisahPlat) {
            Concatenate += pisahPlat1;
        }
        long gabungPlat=Long.parseLong(Concatenate);
        long berhentiJalan=(gabungPlat-999999)%5;
        if(berhentiJalan==0){
            System.out.println("Jalan");
        }else{
            System.out.println("Berhenti");
        }
    }
    
}
