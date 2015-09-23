package dip.lab1.student.solution1;


/**
 * A high-level class that delegates to employee objects to do the work.
 * The work that can be done is defined in the interface 
 * @see Empolyee 
 * 
 *
 * @author awinterm
 */
public class HRService {
    /**
     * This method returns and employee objects AnnualWages
     * @param e - and employee object
     * @return - returns the employee annualWage Value or calculated value.
     */
    
    
    public final double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}
