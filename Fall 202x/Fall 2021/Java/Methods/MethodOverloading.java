public class MethodOverloading {
	
	public static void main(String[] args){
		
		System.out.println(isValidNumber(-2));
		System.out.println(isValidNumber(-2.5));
		System.out.println(isValidNumber(2));
		System.out.println(isValidNumber(2.5));
		

	} //END MAIN
	
	public static boolean isValidNumber(int number){
		System.out.println("int version");
		return number >= 0;
	}
	
	public static boolean isValidNumber(double number){
		System.out.println("double version");
		return number >= 0.0;
	}
	
}//END CLASS