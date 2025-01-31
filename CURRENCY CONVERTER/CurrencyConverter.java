package Currencyprogram;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	
	
	private Map <String,Double> exchangeRates;
	
	public CurrencyConverter() {
		exchangeRates = new HashMap<>();
		exchangeRates.put("USD",1.0);   // US Dollar
		exchangeRates.put("EUR",0.90);  // Euro
		exchangeRates.put("GBP",0.76);  // British Pound
		exchangeRates.put("INR",83.95);  // India Rupee
		exchangeRates.put("JPY",143.06); // Japanese Yen
		exchangeRates.put("AUD",1.49);  // Australian Doller
	}
	
	public double convert(String fromCurrency, String toCurrency, double amount) {
		if (exchangeRates.containsKey(fromCurrency) || exchangeRates.containsKey(toCurrency)) {
			throw new IllegalArgumentException("Invalid currency code:");
		}
		
		double fromRate = exchangeRates.get(fromCurrency);
		double toRate = exchangeRates.get(toCurrency);
		
		//convert amount to USD first,then to the target currency
		
		double amountInUSD = amount / fromRate;
		return amountInUSD * toRate;
	}

	
}
