package org.works.model.domain.address;

public enum AddressType {
	HOME("H"), COMPANY("C");

	private String addressType;

	private AddressType(String addressType) {
		this.addressType = addressType;
	}
}
