
public class CryptoPayment implements PaymentStrategy {

	private String walletAddress;

	public CryptoPayment(String walletAddress) {
	    this.walletAddress = walletAddress; // Doðru atama
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(walletAddress + " adresine " + amount +
				" TL deðerinde kripto para ile ödeme yapýldý.");
	}
}
