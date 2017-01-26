package w17jan26;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Charlie
 */
public class Employee {
    private String firstName, lastName;
    private int socialInsuranceNumber;
    private LocalDate dateOfBirth;
    
    public Employee(String first, String last, int sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialInsuranceNumber = sin;
        setBirthday(dob);
    }
    
    /**
     * This method will return the employee's first and last name
     * @return 
     */
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
    /**
     * This method will validate that the Employee is 15-90 years old
     * @param dob 
     */
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();
        
        if(age >= 15 && age <= 90)
            dateOfBirth = dob;
        else
            throw new IllegalArgumentException("Employees must be 15-90 years old");
    }
    
    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public int getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
}   //end of class
