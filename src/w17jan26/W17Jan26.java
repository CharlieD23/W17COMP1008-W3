/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan26;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Charlie
 */
public class W17Jan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee("bob","joe",123,LocalDate.of(1993, Month.JUNE, 1));
        System.out.println("The first employee is "+emp1.toString());
    }
    
}
