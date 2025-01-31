package Currencyprogram;
import java.util.Scanner;
public class CurrencyConverterMainApp {
	
	
	public static void main(String[] args) {
		CurrencyConverter converter = new CurrencyConverter();
		Scanner scanner = new Scanner(System.in);
		
		while (true)  {
			;
			
			System.out.println("/nCurrency Converter");
			System.out.println("Enter source currency (e.g, USD): ");
			String fromCurrency = scanner.next().toUpperCase();
			
			
			System.out.println("Enter target currency (e.g, INR):");
			String toCurrency = scanner.next().toUpperCase();
			
			System.out.println("Enter targat currency (e.g INR):");
			double amount = scanner.nextDouble();
			
			try {
				double convertdAmount = converter.convert(fromCurrency,toCurrency, amount);
				System.out.printf("Converted amount: %.2f %s\n",convertdAmount, toCurrency);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Do you want to perform another convertion? (yes/no)");
			
		String choice = scanner.next();
		
		
		if(choice.equalsIgnoreCase("yes")) {
			System.out.println("Exiting.....");
			break;
		}
		}
	}
}