
public class BankTransferPayment implements PaymentStrategy{

	private String bankAccount;
	
	public BankTransferPayment(String bankAccount){
	    this.bankAccount = bankAccount;
	}

	
	@Override
	public void pay(int amount) {		
		System.out.println(bankAccount  + " IBAN numaras�na " + amount +
				" tl, �deme banka havelesi ile ger�ekle�tirildi.");
	}
}
