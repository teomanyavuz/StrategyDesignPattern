import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Order order = new Order();
		
		System.out.println("Ödeme Tutarýný giriniz: ");
		int amount = scanner.nextInt();
		scanner.nextLine();
		
		while(true) {
			System.out.println("\n---------------");
			System.out.println("Ödeme Yöntemi");
			System.out.println("--------------------");
			System.out.println("1- Kredi Kartý ile Ödeme");
            System.out.println("2- Banka Havalesi ile Ödeme");
            System.out.println("3- PayPal ile Ödeme");
            System.out.println("4- Kripto Para ile Ödeme");
            System.out.println("5- Çýkýþ");
            System.out.print("Lütfen, ödeme yönteminizi seçiniz: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
            case 1:
            	order.SetPaymentStrategy(new CreditCardPayment("343442344234", "Teoman Yavuz"));
            	order.ProcessPayment(amount);
            	break;
            case 2:
            	order.SetPaymentStrategy(new BankTransferPayment("TR6462542642"));
            	order.ProcessPayment(amount);
            	break;
            case 3:
            	order.SetPaymentStrategy(new PaypalPayment("teoman.yavuz@gmail.com"));
            	order.ProcessPayment(amount);
            	break;
            case 4:
            	System.out.print("Lütfen kripto cüzdan adresinizi giriniz: ");
            	String walletAddress = scanner.nextLine();
            	order.SetPaymentStrategy(new CryptoPayment(walletAddress));
            	order.ProcessPayment(amount);
            	break;
            case 5:
            	System.out.println("Çýkýþ yapýlýyor. Ýyi günler!");
            	scanner.close();
            	return;
            default:
            	System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
            }
		}
	}
}
