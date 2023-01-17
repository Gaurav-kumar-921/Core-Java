package com.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18nWithDate {

	static void displayDate(Locale locale) {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		Date currentDate = new Date();
		String date = dateFormat.format(currentDate);
		System.out.println("Date value in " + locale + " country = " + date);
	}

	static void displayDateTime(Locale locale) {
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
		Date currentDateTime = new Date();
		String dateTime = dateFormat.format(currentDateTime);
		System.out.println("Date and time value in " + locale + " country = " + dateTime);
	}

	public static void main(String[] args) {
		
		displayDate(Locale.US);
		displayDate(Locale.FRANCE);
		displayDate(Locale.CHINA);

		displayDateTime(Locale.US);
		displayDateTime(Locale.FRANCE);
		displayDateTime(Locale.CHINA);

	}

}
