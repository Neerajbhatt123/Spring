package com.Spring.core.properties;

import java.util.Properties;

public class CountriesAndLanguage {
	
	private Properties countryAndLang;

	public Properties getCountryAndLang() {
		return countryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		this.countryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguage [countryAndLang=" + countryAndLang + "]";
	}
	

}
