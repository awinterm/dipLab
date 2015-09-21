package dip.lab1.student.solution1;

 
import java.text.NumberFormat;

/**
 * Just a start and test class for this program. You may modify this class
 * in any way you see fit.
 *
 * @author awinterm
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        Employee emp1 = new HourlyEmployee(7.25, 2080);
        Employee emp2 = new SalariedEmployee(30000, 3000);
        Employee emp3 = new HourlyWithBonusEmployee(10.00, 20, 1);
        // High-level module
        
        // I peeked for this as I didn't know exactly what to do with this start up as far as tests.
        Employee[] employees = {emp1, emp2, emp3};
        
        
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // I get why this is better than that. Normally when I find myself souting alot I 
        // realize I should loop.  the array of objects is a thing I used for a blackjack game last semester
        // I thought I was awesome when I figured out that you could store other objects in arrays.
        // I also get why this is better, it is more open to change. 
        
      for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" +
            nf.format(hr.getAnnualCompensationForEmployee(employees[i])));
        }
        
        
    }

}
