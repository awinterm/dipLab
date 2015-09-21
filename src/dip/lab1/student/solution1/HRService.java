package dip.lab1.student.solution1;


import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @Andrew Wintermyer
 */
public class HRService {
    /** 
     * Constants can be used for retrieving annual wages of
     * various employee types. Is this the best way to go? Do we have
     * type safety?
     * 
     * No Way! This is J.V. 
     * 
     * Using an interface and the DIP principles polymorphism should take care of this
     * for us. All this code seems like too much work to do something that would be better handled in 
     * the design structure. Have HR use the employee class as an abstract like it should.
     * 
     * Since Java one was like intro to programming again but now in Java. I really feel some structure could
     * have been introduced earlier. Maybe it was, maybe I didn't get it.
     */
    public static final String SALARIED_TYPE = "Salaried";
    public static final String HOURLY_TYPE = "Hourly";

    /**
     * Alternatively to the above, we could use an enum. Does this improve
     * type safety?  
     * 
     * Um... maybe the safety.. I have used enums like maybe 3 times. It always seemed like a 
     * hardcoded array. I would like to know when to use them. But this seems to be just as bad 
     * in the scope of DIP as the above. 
     * 
     * I think you would do this if maybe there was something you needed to do inside a specific instance of
     * a particular subclass that you couldn't access through the interface. 
     * 
     */
    public enum WageType {
        SALARIED,
        HOURLY
    }

    private static final String ERROR_MSG =
            "Cannot get annual wages because no valid employee type provided";
    private static final String ERROR_TITLE = "Employee Type Unknown";

    /**
     * This is a truly horrible way to make decisions. Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * employeeType - a String identifying the employee type. A constant
     * (see above) should be used for this, but can you guarantee it will be?
     * Are there other options? Hint: enum
     * @return the annual compensation for supported employee types
     */
    
   /** public double getAnnualCompensationForEmployee(Employee e,
            String employeeType)
    {
        double annualCompensation = 0;

        // One example of using fragile if logic to determine employee type.
        // If only we could use polymorphism instead!
        if(employeeType.equals(HOURLY_TYPE)) {
            annualCompensation = e.getAnnualWages();

        } else if(employeeType.equals(SALARIED_TYPE)) {
            annualCompensation = e.getAnnualSalary();

        } else {
            JOptionPane.showMessageDialog(
                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        }

        return annualCompensation;
    }
    */

    /**
     * 
     * This will take an emp object and call the version of getAnnualWages(); 
     * It will call the correct method for the object based on its own implementation 
     * of this method. The point of an interface. Too Easy Jim. 
     * Also one line of code replacing like 12.
     * 
     * So was that enum talk at the top of this class a false flag? hmm. This is where I
     * Start to second guess myself. Every time I think I totally get this stuff I worry that
     * I don't get it at all.
     * 
     * 
     * @param e an employee object.
     * @return = will return the amount earned by employee in a year.
     * 
     */
    public double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}
