package dip.lab2.student.solution1;

// An useful import if you need it.

import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 *  
 * @awinterm
 */
public class Startup {
  
    
    public static void main(String[] args) {       
    
        
        
        
    String varTest = "GOOD" ;
    String varTest2 = "FAIR";
    String varTest3 = "POOR";
   
        
        TipCalculator tip1 = new FoodServiceTipCalculator( TipCalculator.ServiceQuality.valueOf(varTest), 100.00);
        TipCalculator tip2 = new FoodServiceTipCalculator( TipCalculator.ServiceQuality.valueOf(varTest2), 150.00);
        TipCalculator tip3 = new BaggageServiceTipCalculator ( TipCalculator.ServiceQuality.valueOf(varTest3), 3);
        TipCalculator tip4 = new BaggageServiceTipCalculator ( TipCalculator.ServiceQuality.valueOf(varTest), 4);
        
        TipService tS = new TipService();
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        TipCalculator[] tips = {tip1, tip2, tip3, tip4};
        
        for (TipCalculator tip : tips) {
            System.out.println("Your tip should be " + nf.format(tS.calculateTip(tip)));
        }
        
        
      
        
    }

}
