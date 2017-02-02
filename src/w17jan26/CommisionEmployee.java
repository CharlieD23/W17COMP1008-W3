package w17jan26;

import java.time.LocalDate;

/**
 *
 * @author Charlie
 */
public class CommisionEmployee extends Employee{
    protected double monthlySales, commissionRate;

    public CommisionEmployee(String first, String last, int sin, LocalDate dob, double comRate) {
        super(first, last, sin, dob);
        
        monthlySales = 0;
        setCommissionRate(comRate);
    }

    /**
     * This method will validate the commission rate input as an argument and set
     * the instance variable if it is valid
     * @return 
     */
    public void setCommissionRate(double comRate)
    {
        if(comRate > 0 && comRate <= 60)
            commissionRate = comRate;
        else
            throw new IllegalArgumentException("Commission rate must be in the range 1-60");
    }
    
    /**
     * This will validate the sales amount and add it to the employee's total sales
     * @return 
     */
    public void recordSales(double newSales)
    {
        if(newSales > 0)
            monthlySales += newSales;
        else
            throw new IllegalArgumentException("Sales must be greater than 0");
    }
    
    
    @Override
    public PayCheck getPayCheck() {
        double payAmount = monthlySales * commissionRate / 100;
        
        PayCheck newPay = new PayCheck(super.toString(), "Commissions", payAmount);
        
        monthlySales = 0; //reset the monthly sales for the next pay period
        
        return newPay;
    }
    
}
