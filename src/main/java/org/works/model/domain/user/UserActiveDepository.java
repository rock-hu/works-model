package org.works.model.domain.user;

import java.io.Serializable;
import java.util.Date;

public class UserActiveDepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8327779811126734389L;

	private Long itemId;
	private User user;
	private String randomCode;
	private Date beginTime;
	private Date expiredTime;
	private boolean activeStatus;

	public UserActiveDepository() {
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRandomCode() {
		return randomCode;
	}

	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

}
