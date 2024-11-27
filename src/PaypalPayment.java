
public class PaypalPayment implements PaymentStrategy {

	private String email;
	
	public PaypalPayment(String email) {
		email = this.email;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + "TL" + email + " hesabý kullanýlarak ödendi");
	}

}
