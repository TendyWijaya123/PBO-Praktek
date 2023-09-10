/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author Lenovo
 */
public class Berhitung {
    public static int Berhitung(String operator, int operand1, int  operand2){
        int hasil=0;
        if(operator.equals("+")){
            hasil=operand1+operand2;
        }else if(operator.equals("-")){
            hasil=operand1-operand2;
        }else if(operator.equals("*")){
            hasil=operand1*operand2;
        }else if(operator.equals("/")){
            hasil=operand1/operand2;
        }else if(operator.equals("%")){
            hasil=operand1%operand2;
        }
        return hasil;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc= new java.util.Scanner(System.in);
        String operasi=sc.nextLine();
        String[] split=operasi.split(" ",3);
        int hasil= Berhitung(split[1], Integer.parseInt(split[0]), Integer.parseInt(split[2])) ;
        

        System.out.println("hasilnya adalah:"+hasil);
    }
    
}
