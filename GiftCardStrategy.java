package StrategyShoppingCart;

public class GiftCardStrategy implements PaymentStrategy {

	private String name;
	private String code;
	private int amount;
	private String dateOfExpiry;
	
	public GiftCardStrategy(String nm, String code, int amount, String expiryDate){
		this.name=nm;
		this.code=code;
		this.amount=amount;
		this.dateOfExpiry=expiryDate;
	}
	
	@Override
	public void pay(int amount) {
        if (amount<= this.amount){
		    System.out.println(amount +" paid with Gift card");
            this.amount-=amount;
        }
        else
            System.out.println("Not enought money in card");
	}

}