package org.works.batch.domain;

public class Parent extends Person {

	private int planRetirementAge;

	private boolean retirement;

	public int getPlanRetirementAge() {
		return planRetirementAge;
	}

	public void setPlanRetirementAge(int planRetirementAge) {
		this.planRetirementAge = planRetirementAge;
	}

	public boolean isRetirement() {
		return retirement;
	}

	public void setRetirement(boolean retirement) {
		this.retirement = retirement;
	}

}
