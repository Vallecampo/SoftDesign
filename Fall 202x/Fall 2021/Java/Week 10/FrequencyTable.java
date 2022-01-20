public class FrequencyTable{
	
	public static void main(String[] args){
		
		int[] FrequencyTable = new int [10];
		
		for (int i = 1; i <= 100; i++) {
			int n = (int)(Math.random()* 10 + 1);
			FrequencyTable[n-1]++; //whadafuk
		}
		for (int i = 0; i < FrequencyTable.length; i++){
			System.out.printf("%d: %d\n", i + 1, FrequencyTable[i]);
		}
	}
}