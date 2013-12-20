package org.works.model.domain.common;

import java.io.Serializable;

public class PhraseKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String country;
	private String language;
	private String appModule;
	private String code;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAppModule() {
		return appModule;
	}

	public void setAppModule(String appModule) {
		this.appModule = appModule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appModule == null) ? 0 : appModule.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
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
		PhraseKey other = (PhraseKey) obj;
		if (appModule == null) {
			if (other.appModule != null)
				return false;
		} else if (!appModule.equals(other.appModule))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}

	public PhraseKey() {

	}

	public PhraseKey(String country, String language, String appModule, String code) {
		super();
		this.country = country;
		this.language = language;
		this.appModule = appModule;
		this.code = code;
	}

}
