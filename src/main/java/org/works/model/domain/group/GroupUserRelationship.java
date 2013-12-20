package org.works.model.domain.group;

import java.io.Serializable;
import java.util.Date;

public class GroupUserRelationship implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2272912756030203670L;
	private GroupUserRelationshipId id;
	private Date relBeginDate;
	private Date relexpiredDate;
	private boolean enable;

	public Date getRelBeginDate() {
		return relBeginDate;
	}

	public void setRelBeginDate(Date relBeginDate) {
		this.relBeginDate = relBeginDate;
	}

	public Date getRelexpiredDate() {
		return relexpiredDate;
	}

	public void setRelexpiredDate(Date relexpiredDate) {
		this.relexpiredDate = relexpiredDate;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public GroupUserRelationshipId getId() {
		return id;
	}

	public void setId(GroupUserRelationshipId id) {
		this.id = id;
	}

}
