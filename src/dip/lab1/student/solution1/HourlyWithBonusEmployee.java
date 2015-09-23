
package dip.lab1.student.solution1;

/**
 * lower class for employees paid hourly but that get bonuses.
 * @author awinterm
 */
public class HourlyWithBonusEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;
    private double annualBonus;

    
    /**
     * Constructor for HourlyWithBonusEmplyee
     * 
     * @param hourlyRate - the hourly wage 
     * @param totalHrsForYear - total hours worked for the year
     * @param totalAnnualBonus - annual amount of bonuses earned.
     */
    public HourlyWithBonusEmployee(double hourlyRate, double totalHrsForYear, double totalAnnualBonus) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
        this.annualBonus = totalAnnualBonus;
    }
/**
 * getter for annualBonus value
 * @return - total of bonuses earned this year.
 */
    public double getTotalAnnualBonus() {
        return annualBonus;
    }
/**
 * setter for annualBonus
 * @param annualBonus - total of bonuses earned this year.
 */
    public void setTotalAnnualBonus(double annualBonus) {
        if (annualBonus < 0 || annualBonus > 1000000000) {
            System.out.println("I don't know about throwing exceptions yet ");
        } else {
            this.annualBonus = annualBonus;
        }
    }
/**
 * Contractual method of the Employee interface
 * @see Employee
 * @return calculated annual wage total
 */
    @Override
    public double getAnnualWages() {
        return ((hourlyRate * totalHrsForYear) + annualBonus);
    }
    /*
    * getter for hourlyRate
    */
    public final double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Setter for hourlyRate
     * WARNING MIN WAGE IS HARD CODED!!!!
     * This should change if it should go up. 
     * Should be a variable in future versions.
     * @param hourlyRate the rate earned per hour. 
     */
    
    public final void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 7.25) {
            System.out.println("Unless he is waiter or other tipped employee "
                    + "this rate is illegal!");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
/**
 * getter for totalHoursForYear
 * @return total hours worked this year.
 */
    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }
/**
 * setter for totalHrsForYear
 * @param totalHrsForYear - total hours worked this year. 
 */
    public final void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear > 2080) {
            System.out.println("Overtime was earned. Get this guy on Salary");
        } else {
            this.totalHrsForYear = totalHrsForYear;
        }
    }

}
