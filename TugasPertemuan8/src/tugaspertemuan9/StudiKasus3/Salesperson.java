/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.StudiKasus3;

/**
 *
 * @author Lenovo
 */
public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;
    
    //Constructor: set up the sales person object  with  given data
    public Salesperson(String first, String last, int  sales){
        firstName=first;
        lastName=last;
        totalSales=sales;
    }
    
    @Override
    public String toString(){
        return getLastName()+", "+getFirstName()+": \t"+getTotalSales();
    }
          
    public boolean  equals (Object other){
        return (getLastName().equals(((Salesperson)other).getLastName())&& getFirstName().equals(((Salesperson)other).getFirstName()));
    }
    
    public int compareTo(Object other){
    if (other instanceof Salesperson) {
        Salesperson otherSalesperson = (Salesperson) other;

        // Compare based on total sales
        return otherSalesperson.totalSales - this.totalSales;
    } else {
        // Handle the case where 'other' is not a Salesperson
        throw new IllegalArgumentException("Cannot compare Salesperson with a non-Salesperson object.");
    }
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the totalSales
     */
    public int getTotalSales() {
        return totalSales;
    }
}
