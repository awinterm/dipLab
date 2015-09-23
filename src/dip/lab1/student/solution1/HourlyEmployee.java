package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. 
 *
 * @author awinterm
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;
    private double minWage;
   
    /**
     * Constructor for HourlyEmployee class
     *
     * @param hourlyRate = the rate of pay per hour.
     * @param totalHrsForYear = Hours worked for the year.
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    /**
     * 
     * Contractual method of the Employee interface.
     *
     * @return = Calculated annual Wages.
     */
    @Override
    public final double getAnnualWages() {
        return (hourlyRate * totalHrsForYear);
    }

    ;
    
    
    /*
    * Getter for hourlyRate value
    *
    */
     public final double getHourlyRate() {
        return hourlyRate;
    }

     
     /**
      * setter for hourlyRate value.
      * preforms min wage validation. 
      * Just added a minWage variable, WARNING This value must be set. 
      * Probably should add to the constructor or else this value might not be set. 
      * for now hard coded in the method. BAD. Ridged and this value will change.
      * Bernie 2016! 
      * @param hourlyRate is the rate an hourly employee makes.
      */
     
    public final void setHourlyRate(double hourlyRate) {
        minWage = 7.25;
        
        if (hourlyRate < minWage) {
            System.out.println("Unless he is waiter or other tipped employee "
                    + "this rate is illegal!");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
    /**
     * getter for totalHrsForYear value
     * @return total hours employee worked this year.
     */
    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }
    
    /*
    *Setter for totalHrsForYear value
    *
    */
    public final void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear > 2080) {
            System.out.println("Overtime was earned. Get this guy on Salary");
        } else {
            this.totalHrsForYear = totalHrsForYear;
        }
    }
}
