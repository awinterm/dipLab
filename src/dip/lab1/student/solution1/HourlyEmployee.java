package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @Andrew Wintermyer
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;

    /**
     * default constructor. Is this the best way to go? no full reason stated in
     * SalriedEmployee class.
     */
    /**
     * Convenience constructor. Is this the best way to go? In this case yes.
     * Forces the properties to be set at construction. So you never have an
     * employee walking around with null values.
     *
     * @param hourlyRate = the rate of pay per hour.
     * @param totalHrsForYear = Hours worked for the year.
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    /**
     * This actually doesn't factor in overtime. You would need weekly hours.
     * you can't just say if tHFY > (40hrs a week times 52 weeks) because hourly
     * employees are paid there overtime on a weekly basis. I hope this isn't
     * part of the thinking hard about this project that Jim talked about in his
     * comments and rather over thinking this project. Since it is not DIP
     * related I'll only come back to this issue if he asks after lab review.
     *
     * @return = annual Wages.
     */
    @Override
    public final double getAnnualWages() {
        return (hourlyRate * totalHrsForYear);
    }

    ;
    
    
    
     public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 7.25) {
            System.out.println("Unless he is waiter or other tipped employee "
                    + "this rate is illegal!");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if (totalHrsForYear > 2080) {
            System.out.println("Overtime was earned. Get this guy on Salary");
        } else {
            this.totalHrsForYear = totalHrsForYear;
        }
    }
}
