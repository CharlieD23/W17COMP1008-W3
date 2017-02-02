package w17jan26;

import java.time.LocalDate;

/**
 *
 * @author Charlie
 */
public class BasePlusCommissionEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, int sin, LocalDate dob, double comRate, double baseSalary) {
        super(first, last, sin, dob, comRate);
        
        setBaseSalary(baseSalary);
    }
    
    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary > 0)
            this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("Base salary must be larger than 0");
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    
    @Override
    public PayCheck getPayCheck() {
        double payAmount = baseSalary + monthlySales * commissionRate / 100;
        
        PayCheck newPay = new PayCheck(super.toString(), "Base Salary + Commissions", payAmount);
        
        monthlySales = 0; //reset the monthly sales for the next pay period
        
        return newPay;
    }
}
