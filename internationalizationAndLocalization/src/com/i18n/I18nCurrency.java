package com.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class I18nCurrency {
	
	static void displayCurrency(Locale locale) {
		double dbl = 2000.909;
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		String currency = numberFormat.format(dbl);
		System.out.println(currency + " of the Country " + locale);
	}
	
	public static void main(String[] args) {
		
		displayCurrency(Locale.US);
		displayCurrency(Locale.CHINA);
		displayCurrency(Locale.FRANCE);
		displayCurrency(Locale.UK);
		displayCurrency(Locale.GERMANY);
	}

}
