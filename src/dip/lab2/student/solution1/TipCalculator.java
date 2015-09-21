/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/** 
 *
 * @author andre_000
 */
public abstract interface TipCalculator {
    
  // I want the method that sets the enum here.
    
    public enum ServiceQuality {
     GOOD, FAIR, POOR
}
     public abstract void setServiceRating(ServiceQuality q);
     public abstract double getTip();
     public abstract void setBill(double billAmt);
    
}
