package org.works.model.domain.authority;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.works.model.domain.group.GroupAuthorityRelationship;

public class Authority implements GrantedAuthority, Serializable {
	private static final long serialVersionUID = 716715419025948964L;

	private String authority;
	
	private Long authorityId;

	private String authorityComment;
	private Set<GroupAuthorityRelationship> groupAuthorityRelationships;

	public Authority() {
	}

	public Authority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int compareTo(Object o) {
		if (o != null && o instanceof GrantedAuthority) {
			String rhsRole = ((GrantedAuthority) o).getAuthority();
			if (rhsRole == null) {
				return -1;
			}
			return authority.compareTo(rhsRole);
		}
		return -1;
	}

	public Set<GroupAuthorityRelationship> getGroupAuthorityRelationships() {
		return groupAuthorityRelationships;
	}

	public void setGroupAuthorityRelationships(Set<GroupAuthorityRelationship> groupAuthorityRelationships) {
		this.groupAuthorityRelationships = groupAuthorityRelationships;
	}

	public void removeGroupAuthorityRelationship(GroupAuthorityRelationship rel) {
		if (groupAuthorityRelationships != null) {
			groupAuthorityRelationships.remove(rel);
		}
	}

	public void addGroupAuthorityRelationship(GroupAuthorityRelationship rel) {
		if (groupAuthorityRelationships != null) {
			groupAuthorityRelationships.add(rel);
		} else {
			groupAuthorityRelationships = new HashSet<GroupAuthorityRelationship>();
			groupAuthorityRelationships.add(rel);
		}
	}

	public void removeGroupAuthorityRelationships(Set<GroupAuthorityRelationship> rels) {
		if (groupAuthorityRelationships != null) {
			groupAuthorityRelationships.remove(rels);
		}
	}

	public void addGroupAuthorityRelationships(Set<GroupAuthorityRelationship> rels) {
		if (groupAuthorityRelationships != null) {
			groupAuthorityRelationships.addAll(rels);
		} else {
			groupAuthorityRelationships = new HashSet<GroupAuthorityRelationship>();
			groupAuthorityRelationships.addAll(rels);
		}
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getAuthorityComment() {
		return authorityComment;
	}

	public void setAuthorityComment(String authorityComment) {
		this.authorityComment = authorityComment;
	}

	public Long getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Long authorityId) {
		this.authorityId = authorityId;
	}

}
