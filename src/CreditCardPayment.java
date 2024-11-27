
public class CreditCardPayment implements PaymentStrategy{

	private String cardNumber;
	private String cardHolderName;
	
	public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " tl kredi kart� ile �deme yap�lm��t�r." + cardNumber);
	}
}
