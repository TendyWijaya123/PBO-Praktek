/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Lenovo
 */
public class Soal1InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        // Define the regular expression pattern for English alphabetic letters
       
        
        String[] word= s.split("[ ',/?@]");
        int tokenCount = word.length;
        System.out.println(tokenCount);
        for(int i=0;i<word.length;i++){
            System.out.println(word[i]);
        }
        

        // Print the total number of tokens
        
        
    }
    
}
