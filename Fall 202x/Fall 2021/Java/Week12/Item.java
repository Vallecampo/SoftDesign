public class Item {
	
	public String itemId;
	public int qty;
	public double price;
	
	public double calculateTotal(){
		//double total = qty * price; DON'T NEED VARIABLE
		return qty * price;
	}
	
	public void displayItem(){
		System.out.printf("%s: %d @ $%.2f", itemId, qty, price);
		
	}

}