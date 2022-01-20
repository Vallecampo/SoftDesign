/*
 * Name:  David Vallecampo
 * Assignment:  VallecadAssignment5
 * Program: Computer Programmer

 * This is a class created based on the specifications provided by the UML
 * provides the variable necessary to create and calculate the solutions to a 
 * quadratic function
 */

public class Quadratic{
	
	//default variables
	private double a = 1.0;
	private double b = 1.0;
	private double c = 0.0;
	
	//default cconstructor
	public Quadratic() {}
	
	//second constructor method
	public Quadratic(double a, double b){
		setA(a);
		this.b = b;
	}
	
	//third constructor method
	public Quadratic(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//public setter so the variable can be hidden/still modifiable 
	public void setA(double a) throws IllegalArgumentException {
		if (a == 0){
			throw new IllegalArgumentException("not legal");
		} else {
			this.a = a;
		}
		
	}
	
	//getter accessor so we have the option to pull the up info easily
	public double getA(){
		return a;
	}
	
	//public setter so the variable can be hidden/still modifiable 
	public void setB(double b){
		this.b = b;
	}
	
	//getter accessor so we have the option to pull the up info easily
	public double getB(){
		return b;
	}
	
	//public setter so the variable can be hidden/still modifiable 
	public void setC(double c){
		this.c = c;
	}
	
	//getter accessor so we have the option to pull the up info easily
	public double getC(){
		return c;
	}
	
	
	//method to return the number of 'zeros' or 'solutions' in a quadratic
	public int numSolutions(){
		return numSolutions(discriminant());
	}
	
	/*
	method that determines the number of solutions based on the value of the
	discriminant
	*/
	public int numSolutions(double discriminant){
		if (discriminant > 0) {
			return 2;
		} else if (discriminant < 0){
			return 0;
		}
		return 1;
	}
	
	//method to calculate the discriminant of the quadratic function
	public double discriminant(){
		return b * b - 4 * a * c;
	}
	
	//toString method to display the formula written out 
	public String toString(){
		return String.format("%.1fx^2 + %.1fx + %.1f = 0", a, b, c);
	}
	
}//END OF CLASS