package com.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class I18nWithNumbers {
	
	
	static void displayNumber(Locale locale) {          // locale means country or region
		
		double dbl = 10000.909;
		
//		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
//		String number = numberFormat.format(dbl);
		
		String number = NumberFormat.getNumberInstance(locale).format(dbl);
		System.out.println(number + " for the locale " + locale);
	}

	public static void main(String[] args) {
		
		displayNumber(Locale.UK);
		displayNumber(Locale.CANADA);
		displayNumber(Locale.US);
		displayNumber(Locale.CHINA);

	}

}
