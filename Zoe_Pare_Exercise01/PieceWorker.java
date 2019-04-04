package Zoe_Pare_Exercise01;

public class PieceWorker extends Employee{

	 private double wage;
	 private double pieces; 
	 
//constructor
	 public PieceWorker( String first, String last, String socialSecurityNumber,double Wage, double Pieces )
	    {
	    super( first, last, socialSecurityNumber);
	    setWage( Wage ); 
	    setPieces( Pieces ); 
	    } 
// set wage
	    public final void setWage( double Wage )
	    {
	    	if(Wage <= 0.0) {
		         throw new IllegalArgumentException("Wage must be >= 0.0");
	    	}
	    	this.wage=Wage;
	    } 
// return wage
	    public double getWage()
	    {
	      return wage;
	    } 
	 
	    // set Pieces
	    public final void setPieces( double Pieces )
	    {
	    	if ( ( Pieces >= 0.0 ) && ( Pieces <= 150.0 ) ) {
	    		throw new IllegalArgumentException("Pieces must be greater than zero but less than 150");
	    	}
	    	this.pieces = Pieces;
	    } 
// return pieces
	    public double getPieces()
	    {
	      return pieces;
	    } 
// calculate earnings; override abstract method earnings in Employee
	    public double earnings()
	    {
	      return getWage() * getPieces();
	    } 
// return String representation of PieceWorker object
	    @Override
	    public String toString()
	    {
	      return String.format( "Piece Worker: %s\n%s: $%,.2f; %s: %,.2f",
	         super.toString(), "Wage per piece", getWage(),
	         "Number of pieces of merchandice produced", getPieces() );
	    }
}
