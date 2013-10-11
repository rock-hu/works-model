package org.works.batch.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class CountryLanguage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1321205709418852778L;
	private String langCode;
	private String countryCode;
	private String country;
	private String language;

	private Timestamp recCreateTime;

	private Timestamp recUpdateTime;

	public CountryLanguage() {
		Timestamp current = new Timestamp(System.currentTimeMillis());
		recCreateTime = current;
		recUpdateTime = current;
	}

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Timestamp getRecCreateTime() {
		return recCreateTime;
	}

	public void setRecCreateTime(Timestamp recCreateTime) {
		this.recCreateTime = recCreateTime;
	}

	public Timestamp getRecUpdateTime() {
		return recUpdateTime;
	}

	public void setRecUpdateTime(Timestamp recUpdateTime) {
		this.recUpdateTime = recUpdateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((langCode == null) ? 0 : langCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryLanguage other = (CountryLanguage) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (langCode == null) {
			if (other.langCode != null)
				return false;
		} else if (!langCode.equals(other.langCode))
			return false;
		return true;
	}

}
