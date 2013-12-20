package org.works.model.domain.group;

import java.io.Serializable;
import java.util.Date;

public class GroupAuthorityRelationship implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 432625008237194492L;

	private GroupAuthorityRelationshipId id;
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

	public GroupAuthorityRelationshipId getId() {
		return id;
	}

	public void setId(GroupAuthorityRelationshipId id) {
		this.id = id;
	}

}
