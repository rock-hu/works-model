package org.works.model.domain.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_user_active_depository")
public class UserActiveDepository /*extends AbstractAuditable<User, Long> */ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8327779811126734389L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_active_depository_id_seq_gen")
	@SequenceGenerator(name = "user_active_depository_id_seq_gen", sequenceName = "USER_ACTIVE_DEPOSITORY_SEQ")
	@Column(name="item_id")
	private Long itemId;
	//@NotAudited
	@ManyToOne
	@JoinColumn(name = "user_id", updatable = false, insertable = false, referencedColumnName = "user_id")
	private User user;
	@Column(name = "random_code")
	private String randomCode;
	@Column
	private Date beginTime;
	@Column
	private Date expiredTime;
	@Column
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
