package org.works.batch.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public enum Gender {
	M("MALE"), F("FEMALE");
	private final String gender;

	private static final Map<String, Gender> map = new HashMap<String, Gender>();

	static {
		for (Gender type : Gender.values()) {
			map.put(type.gender, type);
		}
	}

	private Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public static Gender fromString(String name) {
		if (map.containsKey(name)) {
			return map.get(name);
		}
		throw new NoSuchElementException(name + "not found");
	}

}
