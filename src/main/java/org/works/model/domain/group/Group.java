package org.works.model.domain.group;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Group implements Serializable {
	private static final long serialVersionUID = -4097963501691758744L;

	private Long groupId;

	private String groupName;

	private String groupComment;

	private boolean enabled;
	private Set<GroupAuthorityRelationship> groupAuthorityRelationships;
	private Set<GroupUserRelationship> groupUserRelationships;

	public Group() {
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Set<GroupAuthorityRelationship> getGroupAuthorityRelationships() {
		return groupAuthorityRelationships;
	}

	public void setGroupAuthorityRelationships(Set<GroupAuthorityRelationship> groupAuthorityRelationships) {
		this.groupAuthorityRelationships = groupAuthorityRelationships;
	}

	public Set<GroupUserRelationship> getGroupUserRelationships() {
		return groupUserRelationships;
	}

	public void setGroupUserRelationships(Set<GroupUserRelationship> groupUserRelationships) {
		this.groupUserRelationships = groupUserRelationships;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	public void removeGroupAuthorityRelationship(Set<GroupAuthorityRelationship> rels) {
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

	public void removeGroupUserRelationship(GroupUserRelationship rel) {
		if (groupAuthorityRelationships != null) {
			groupAuthorityRelationships.remove(rel);
		}
	}

	public void addGroupUserRelationship(GroupUserRelationship rel) {
		if (groupUserRelationships != null) {
			groupUserRelationships.add(rel);
		} else {
			groupUserRelationships = new HashSet<GroupUserRelationship>();
			groupUserRelationships.add(rel);
		}
	}

	public void removeGroupUserRelationships(Set<GroupUserRelationship> rels) {
		if (groupUserRelationships != null) {
			groupUserRelationships.remove(rels);
		}
	}

	public void addGroupUserRelationships(Set<GroupUserRelationship> rels) {
		if (groupUserRelationships != null) {
			groupUserRelationships.addAll(rels);
		} else {
			groupUserRelationships = new HashSet<GroupUserRelationship>();
			groupUserRelationships.addAll(rels);
		}
	}

	public String getGroupComment() {
		return groupComment;
	}

	public void setGroupComment(String groupComment) {
		this.groupComment = groupComment;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

}
