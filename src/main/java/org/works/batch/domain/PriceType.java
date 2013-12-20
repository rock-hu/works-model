package org.works.batch.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public enum PriceType {
	DAILY("D"), WEEKLY("W"), MONTHLY("M"), YEARLY("Y");

	private final String value;

	private static final Map<String, PriceType> map = new HashMap<String, PriceType>();

	static {
		for (PriceType type : PriceType.values()) {
			map.put(type.value, type);
		}
	}

	PriceType(String priceType) {
		this.value = priceType;
	}

	public String getValue() {
		return value;
	}

	public static PriceType fromString(String name) {
		if (map.containsKey(name)) {
			return map.get(name);
		}
		throw new NoSuchElementException(name + "not found");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
