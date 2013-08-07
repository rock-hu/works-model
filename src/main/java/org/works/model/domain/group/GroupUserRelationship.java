package org.works.model.domain.group;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_group_user_map")
public class GroupUserRelationship /*
									 * extends AbstractAuditable<User,
									 * GroupUserRelationshipId>
									 */implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2272912756030203670L;
	@EmbeddedId
	private GroupUserRelationshipId id;
	@Temporal(TemporalType.DATE)
	@Column(name = "rel_begin_date")
	private Date relBeginDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "rel_expired_date")
	private Date relexpiredDate;
	@Column
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
