package org.works.model.domain.channel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "T_CHANNEL")
public class Channel /* extends AbstractPersistable<Long> */implements
		Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "channel_id_seq_gen")
	@SequenceGenerator(name = "channel_id_seq_gen", sequenceName = "CHANNEL_SEQ")
	@Column(name = "CHANNEL_ID")
	private Long channelId;
	@Column
	private String contryCode;
	@Column
	private String groupMemberCode;
	@Column
	private String systemCode;

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getContryCode() {
		return contryCode;
	}

	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}

	public String getGroupMemberCode() {
		return groupMemberCode;
	}

	public void setGroupMemberCode(String groupMemberCode) {
		this.groupMemberCode = groupMemberCode;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

}
