package org.works.model.domain.group;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.works.model.domain.authority.Authority;

@Embeddable
public class GroupAuthorityRelationshipId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2404907131726261737L;
	//@NotAudited
	@ManyToOne
	@JoinColumn(name = "group_id", referencedColumnName = "group_id", insertable = false, updatable = false)
	private Group group;
	//@NotAudited
	@ManyToOne
	@JoinColumn(name = "authority_id", referencedColumnName = "authority_id", insertable = false, updatable = false)
	private Authority authority;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((authority == null) ? 0 : authority.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupAuthorityRelationshipId other = (GroupAuthorityRelationshipId) obj;
		if (authority == null) {
			if (other.authority != null)
				return false;
		} else if (!authority.equals(other.authority))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		return true;
	}

}
