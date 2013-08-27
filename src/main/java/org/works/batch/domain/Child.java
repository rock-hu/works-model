package org.works.batch.domain;

public class Child extends Person {

	private int bornOrder;

	private boolean attendSchool;

	private String schoolLevel;

	public int getBornOrder() {
		return bornOrder;
	}

	public void setBornOrder(int bornOrder) {
		this.bornOrder = bornOrder;
	}

	public boolean isAttendSchool() {
		return attendSchool;
	}

	public void setAttendSchool(boolean attendSchool) {
		this.attendSchool = attendSchool;
	}

	public String getSchoolLevel() {
		return schoolLevel;
	}

	public void setSchoolLevel(String schoolLevel) {
		this.schoolLevel = schoolLevel;
	}

}
