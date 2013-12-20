package org.works.model.domain.channel;

import java.io.Serializable;

public class Channel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long channelId;
	private String contryCode;
	private String groupMemberCode;
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
