
public class Order {

	private PaymentStrategy paymentStrategy;
	
	public void SetPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void ProcessPayment(int amount) {
		if(paymentStrategy == null) {
			System.out.println("Herangi bi �deme y�netimi se�ilmedi.");
			return;
		}
		paymentStrategy.pay(amount);
	}
}
