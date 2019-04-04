package Zoe_Pare_Exercise03;

public class PayableInterfaceTest {
   public static void main(String[] args) {
	      Payable[] payableObjects = new Payable[] {
	    	         new Invoice("01234", "seat", 2, 375.00),
	    	         new Invoice("56789", "tire", 4, 79.95),
	    	         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
	    	         new HourlyEmployee("Missy", "Johnson", "222-22-2222", 22.30, 14.00),
	    	         new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06),
	    	         new BasePlusCommissionEmployee("Bob", "Hobbs", "222-22-2222", 5000, .04, 300)    
	    	      };

	      System.out.println(
	         "Invoices and Employees processed:\n"); 
// generically process each element in array payableObjects
	      for (Payable currentPayable : payableObjects) {   	  
	          System.out.printf("%n%s %nPayment Due: $%,.2f%n", 
	                  currentPayable.toString(), // could invoke implicitly
	                  currentPayable.getPaymentAmount());
	          
// determine whether element is a BasePlusCommissionEmployee
		      if (currentPayable instanceof BasePlusCommissionEmployee) 
		      {
		 
//downcast Employee reference to 
//BasePlusCommissionEmployee reference
		          BasePlusCommissionEmployee employee = 
		         (BasePlusCommissionEmployee) currentPayable;

		      employee.setBaseSalary(1.10 * employee.getBaseSalary());

		        System.out.printf(
		       "New Salary with 10%% Increase is: " +
		       employee.getBaseSalary());
		      } 
		         
		    if (currentPayable instanceof HourlyEmployee) 
		         {
//downcast Employee reference to 
//HourlyEmployee reference
			HourlyEmployee employee = 
			(HourlyEmployee) currentPayable;

			employee.setWage(2.00 + employee.getWage());

			System.out.printf(
			"New Salary with $2 Increase is: $%,.2f%n",
	        employee.getWage());
		 } 
		         
		    System.out.printf(
		 	"Payment Due $%,.2f%n%n", currentPayable.getPaymentAmount());
} 
   } 
} 

