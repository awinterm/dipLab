package dip.lab1.student.solution1;

/**
 * A lower level class implementing Employee. 
 * 
 *
 * @author awinterm
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;

  
    /**
     * 
     *Constructor for Salaried employees
     * 
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     *
     * 
     * 
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }
/**
 * Contractual override of the abstract method in the employee class
 * @return calculated annual Wage
 */
    @Override
    public final double getAnnualWages() {
        return (annualSalary + annualBonus);
    }

    /**
     * getter for annualBonus
     * @return total of bonuses earned in a year.
     */
    
    
        public final double getAnnualBonus() {
        return annualBonus;
    }

        
        /**
         * setter for annual bonus value. Does some validation. 
         * WARNING The sout is BAD design Hard coded. 
         * Should be a variable msg in future versions.
         * @param annualBonus 
         */
    public final void setAnnualBonus(double annualBonus) {

        if (annualBonus < 0 || annualBonus > 1000000000) {
            System.out.println("I don't know about throwing exceptions yet "
                    + "or really what throwing really does. So better not use it "
                    + "untill Jim explains it better.");
        } else {
            this.annualBonus = annualBonus;
        }
    }

  /**
   * getter for annual salary
   *@return annualSalary - annual salary.
   * 
   */
    public final double getAnnualSalary() {
        return annualSalary;
    }
/**
 * setter for annual Salary
 * Validation Hard Coded. 
 * WARNING SHould update this in future versions to make less rigid.
 * @param annualSalary 
 */
    public final void setAnnualSalary(double annualSalary) {
        if (annualSalary < 0) {
            System.out.println("Paying to work is a bad practice");
        } else {
            this.annualSalary = annualSalary;
        }
    }

}
