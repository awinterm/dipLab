package dip.lab1.student.solution1;



/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;
    
    
    
    /** default constructor. Is this the best way to go? 
     This is the fragility thing we were talking about. Using this would let you 
     * create an instance of this class with null values. You would have to know to set them
     * before doing anything else. Forcing them to be declared in the constructor means the other methods should work.
     * 
     
     */
  

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     * 
     * This one forces the user to set values to these properties. So you can't get 
     * null values later.
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    
        @Override
    public final double getAnnualWages(){
        return (annualSalary + annualBonus);
    };
    
    
        public final double getAnnualBonus() {
        return annualBonus;
    }
        
         public final void setAnnualBonus(double annualBonus) {
        
             if(annualBonus < 0 || annualBonus > 1000000000){
                 System.out.println("I don't know about throwing exceptions yet "
                         + "or really what throwing really does. So better not use it "
                         + "untill Jim explains it better. If your bonus is more then 10 million dollars "
                         + "You probably don't need it.");
             }
             else{
             this.annualBonus = annualBonus;
             }
         }
         
        /*
         * Not sure if this should even exist anymore for the sake of this program.
         * It's an unused method at this point. I'm leaving it in here, its a getter of the 
         * Salary property, could be used in testing I suppose. getAnualWage is the correct method for
         * total made in a year.
         */ 
         
        public final double getAnnualSalary() {
        return annualSalary;
    }
       public final void setAnnualSalary(double annualSalary) {
             if(annualSalary < 0 ){
                 System.out.println("Paying to work is a bad practice");
             }
             else{
        this.annualSalary = annualSalary;
        }
        }
    
    
    
    
    
    
}
