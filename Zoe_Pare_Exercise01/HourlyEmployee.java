package Zoe_Pare_Exercise01;

public class HourlyEmployee extends Employee {
	
	private double hours;
	private double wage;

// Constructor
	   public HourlyEmployee(String firstName, String lastName, 
	      String socialSecurityNumber, double hourlyWage, double hoursWorked) {
	      super(firstName, lastName, socialSecurityNumber); 
	      setWage(hourlyWage);
	      setHours(hoursWorked);}
//Setting Wage
	   public void setWage(double hourlyWage) {
		   if (hourlyWage < 0.0) {
		         throw new IllegalArgumentException(
		            "Weekly salary must be >= 0.0");
	   }
		      this.wage = hourlyWage;
	      }
//Getting Hours
	   public double getWage() {return wage;}
	   
// Setting hours
	   public void setHours(double hoursWorked) {
	      if (hoursWorked < 0.0) {
	         throw new IllegalArgumentException(
	            "Hourly salary must be >= 0.0");
	      }

	      this.hours = hoursWorked;
	      }
	    
// return hours
	   public double getHours() {return hours;}
	   
// calculate earnings; 
	   @Override                                                           
	   public double earnings() {if ( getHours() <= 40 ) //No more than 40 hours
	         return getWage() * getHours();
	      else
	         return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;}                

	   // return String representation of HourlyEmployee object  
	   @Override                                                   
	   public String toString() {                                  
	      return String.format("Hourly employee: %s%n%s: %,.2f",
	         super.toString(), "Hours Worked: ", getHours());
	   }                                                           

}
