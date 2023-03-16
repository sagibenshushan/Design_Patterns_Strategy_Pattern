package StrategyShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		
		ShoppingCart cart2 = new ShoppingCart();
		Item item3 = new Item("4321",11);
		Item item4 = new Item("8766",44);
		
		cart2.addItem(item3);
		cart2.addItem(item4);
		
		//pay by credit card
		cart2.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/25"));

		////------ADD-------
		ShoppingCart cart3 = new ShoppingCart();
		
		Item item5 = new Item("12345",20);
		Item item6 = new Item("56785",41);
		
		cart3.addItem(item5);
		cart3.addItem(item6);
		
		//pay by GiftCard
		cart3.pay(new GiftCardStrategy("dorco", "1234567890123456", 786, "12/25"));
	}

}
