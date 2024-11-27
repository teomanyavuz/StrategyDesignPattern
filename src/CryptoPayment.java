
public class CryptoPayment implements PaymentStrategy {

	private String walletAddress;

	public CryptoPayment(String walletAddress) {
	    this.walletAddress = walletAddress; // Do�ru atama
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(walletAddress + " adresine " + amount +
				" TL de�erinde kripto para ile �deme yap�ld�.");
	}
}
