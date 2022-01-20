public class ItemMain{
	
	public static void main(String[] args){
	
		//Construct an instance of myMessage
		Item m = new Item();
		m.itemId = "Coal";
		m.qty = 4;
		m.price = 2.50;
		
		System.out.println(m.calculateTotal());
		m.displayItem();
	}
}