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
@Table(name = "t_group_authority_map")
public class GroupAuthorityRelationship /*extends
		AbstractAuditable<User, GroupAuthorityRelationshipId>*/ implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 432625008237194492L;

	@EmbeddedId
	private GroupAuthorityRelationshipId id;
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

	public GroupAuthorityRelationshipId getId() {
		return id;
	}

	public void setId(GroupAuthorityRelationshipId id) {
		this.id = id;
	}

}
