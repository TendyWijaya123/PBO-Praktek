/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Lenovo
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static int compareString(String word1, String word2){
        
        return word1.compareTo(word2);
    }
    
     public static String toPascalCase(String input) {
       StringBuilder pascalCase= new StringBuilder() ;
       boolean isCapitalize=true;
       for(char c : input.toCharArray()){
           if(c==' '){
               pascalCase.append(c);
               isCapitalize=true;
           }else if(isCapitalize){
               pascalCase.append(Character.toUpperCase(c));
               isCapitalize=false;
           }else if(!isCapitalize){
               pascalCase.append(Character.toLowerCase(c));
           } else {
               
           }
       }
       return pascalCase.toString();
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("input:");
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        System.out.println("\n output: ");
        String phrase= word1+" "+word2;
        String pascalCase=toPascalCase(phrase);
        int lexico=compareString(word1, word2);
        System.out.println((word1.length()+word2.length()));
        
        if (lexico<0){
            System.out.println("no");
        }else if(lexico>0){
            System.out.println("yes");
        }else{
            System.out.println("have the same lexicographic");
        }
        System.out.println(pascalCase);
        
        
    }
    
}
