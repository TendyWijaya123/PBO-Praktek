/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.StudiKasus1;

/**
 *
 * @author Lenovo
 */
public class Commission extends Hourly {

    private double totalSales;
    private double commissionRates;

    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commissionRates) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRates = commissionRates;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double payment = super.pay() + commissionRates * totalSales;
        totalSales = 0;
        return payment;
    }

    /**
     * @return the totalSales
     */
    public double getTotalSales() {
        return totalSales;
    }

    /**
     * @param totalSales the totalSales to set
     */
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    /**
     * @return the commissionRates
     */
    public double getCommissionRates() {
        return commissionRates;
    }

    /**
     * @param commissionRates the commissionRates to set
     */
    public void setCommissionRates(double commissionRates) {
        this.commissionRates = commissionRates;
    }

    public String toString() {
        String result = super.toString();

        result += super.toString()+" and total sales: "+totalSales;

        return result;
    }
}
