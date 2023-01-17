package com.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18nAllMethods {

	public static void displayTime(Locale locale) {
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		Date date = new Date(); // for current date and time value
		String strTime = dateFormat.format(date);
		System.out.println("Time value in " + locale + " locale = " + strTime);
	}

	public static void main(String[] args) {

		displayTime(Locale.US);
		displayTime(Locale.CHINA);
		displayTime(Locale.FRANCE);

		// Useful constant for country.

		Locale usLocale = Locale.US;
		System.out.println(usLocale);

		Locale frenchLocale = Locale.FRENCH;
		System.out.println(frenchLocale);

		Locale chineseLocale = Locale.CHINESE;
		System.out.println(chineseLocale);

		// constructor of Locale class , Locale(String language) constructor

		Locale enLocale = new Locale("en");
		System.out.println(enLocale);

		Locale frLocale = new Locale("fr");
		System.out.println(frLocale);

		// constructor of Locale class , Locale(String language, String country) constructor

		Locale enLocale1 = new Locale("en", "US");
		System.out.println(enLocale1);

		Locale frLocale1 = new Locale("fr", "FR");
		System.out.println(frLocale1);
		
		// How to use getAvailableLocales() method of Locale class
		// it will returns an array of installed locales.
		
//		Locale[] localeArray = Locale.getAvailableLocales();
//		
//		for(Locale locale : localeArray) {
//			System.out.println(locale);
//		}
		
		// How to use getISOCountries() method of Locale class
		// it wil returns an array of ISO 3166 two-letter country codes.
		
//		String[] countryCodeArray = Locale.getISOCountries();
//		
//		for(String country : countryCodeArray) {
//			System.out.println(country);
//		}

		
		// How to use getISOLanguages() method of Locale class  --> same as the above two
		
		// How to use getDisplayCountry(Locale inLocale) method of Locale class
		
		Locale locale = new Locale("en", "US");
		String displayCountryName = locale.getDisplayCountry(locale);
		System.out.println("displayCountryName = "+ displayCountryName);
		
		Locale frlocale = new Locale("fr", "FR");
	    displayCountryName = locale.getDisplayCountry(frlocale);
		System.out.println("displayCountryName = "+ displayCountryName);
		
		// How to use getDisplayLanguage(Locale inLocale) method of Locale class
		
		Locale locale2 = new Locale("en", "US");
		String displayLanguage = locale.getDisplayLanguage(locale2);
		System.out.println("displayLanguage = "+ displayLanguage);
		
		Locale locale3 = new Locale("fr", "FR");
	    displayLanguage = locale.getDisplayLanguage(locale3);
		System.out.println("displayLanguage = "+ displayLanguage);
		
	}

}
