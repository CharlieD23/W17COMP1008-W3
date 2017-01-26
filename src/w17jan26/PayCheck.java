package w17jan26;

import java.time.LocalDate;

/**
 *
 * @author Charlie
 */
public class PayCheck {
    private String employeeName, notes;
    private double amount;
    private LocalDate dateIssued;
    private int checkNumber;
    
    private static int nextCheckNumber = 1000;

    public PayCheck(String employeeName, String notes, double payAmount) {
        this.employeeName = employeeName;
        this.notes = notes;
        setPayAmount(payAmount);
        
        checkNumber = nextCheckNumber;
        nextCheckNumber++;
    }
    
    /**
     * This method will validate that the pay amount is > 0
     */
    private void setPayAmount(double payAmount)
    {
        if(payAmount >0)
            amount = payAmount;
        else
            throw new IllegalArgumentException("Pay amounts must be greater than 0");
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getNotes() {
        return notes;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public int getCheckNumber() {
        return checkNumber;
    }
    
    public String toString()
    {
        return String.format("Check #: %d made out to %s for the amount of $%.2f", 
                                checkNumber, employeeName, amount);
    }
    
}
