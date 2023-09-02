/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Lenovo
 */
public class DataTypes {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        boolean  isRepeat=true;
        int angka=sc.nextInt();
        
            
            try{
                for(int i=0;i<=angka;i++){
                    long x=sc.nextLong();
                        System.out.println(x+" can be fitted:");
                    if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
                        System.out.println("* Byte");
                    }if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
                        System.out.println("* Short");
                    }if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
                        System.out.println("* int");
                    }if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
                        System.out.println("* long");
                    }else{
                        System.out.println("");
                    }
                }
            }catch (Exception e) {
                System.out.println("can not be fitted in anywhere");
                
            }
            
        
        // TODO code application logic here
    }
    
}
