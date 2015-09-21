/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author andre_000
 */
public class HourlywithBonusesEmployee implements Employee {

      private double hourlyRate;
      private double totalHrsForYear;
      private double totalAnnualBonus;

    public HourlywithBonusesEmployee(double hourlyRate, double totalHrsForYear, double totalAnnualBonus) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
        this.totalAnnualBonus = totalAnnualBonus;
    }
    
    
    
    @Override
    public double getAnnualWages() {
         return ((hourlyRate * totalHrsForYear) + totalAnnualBonus);
    }
    
     public final double getHourlyRate() {
        return hourlyRate;
    }
     
        public final void setHourlyRate(double hourlyRate) {
            if(hourlyRate < 7.25 ){
                 System.out.println("Unless he is waiter or other tipped employee "
                         + "this rate is illegal!");
             }
             else{
        this.hourlyRate = hourlyRate;
    }
        }
            public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }
            
                public final void setTotalHrsForYear(double totalHrsForYear) {
                    if(totalHrsForYear > 2080 ){
                 System.out.println("Overtime was earned. Get this guy on Salary");
             }
             else{
        this.totalHrsForYear = totalHrsForYear;
    }
}
    
}
