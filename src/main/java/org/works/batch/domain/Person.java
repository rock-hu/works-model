package org.works.batch.domain;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

	private String name;
	private int age;
	private boolean sex;
	private Date birthday;
	private boolean hasJob;
	private String educationLevel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean isHasJob() {
		return hasJob;
	}

	public void setHasJob(boolean hasJob) {
		this.hasJob = hasJob;
	}

}
