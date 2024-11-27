import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Order order = new Order();
		
		System.out.println("�deme Tutar�n� giriniz: ");
		int amount = scanner.nextInt();
		scanner.nextLine();
		
		while(true) {
			System.out.println("\n---------------");
			System.out.println("�deme Y�ntemi");
			System.out.println("--------------------");
			System.out.println("1- Kredi Kart� ile �deme");
            System.out.println("2- Banka Havalesi ile �deme");
            System.out.println("3- PayPal ile �deme");
            System.out.println("4- Kripto Para ile �deme");
            System.out.println("5- ��k��");
            System.out.print("L�tfen, �deme y�nteminizi se�iniz: ");

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
            	System.out.print("L�tfen kripto c�zdan adresinizi giriniz: ");
            	String walletAddress = scanner.nextLine();
            	order.SetPaymentStrategy(new CryptoPayment(walletAddress));
            	order.ProcessPayment(amount);
            	break;
            case 5:
            	System.out.println("��k�� yap�l�yor. �yi g�nler!");
            	scanner.close();
            	return;
            default:
            	System.out.println("Ge�ersiz se�im. L�tfen tekrar deneyiniz.");
            }
		}
	}
}
