public class NestedLoopsDemo {
	
	public static void main(String[] args){
		
		for (int row = 1; row <= 5; row++){
			for (int col = 1; col <=5; col++){
				System.out.printf("%3d ", row * col);
			}
			System.out.println();
		}
	}
}