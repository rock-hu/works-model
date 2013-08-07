package org.works.model.domain.group;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Index;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_group")
public class Group /*extends AbstractAuditable<User, Long> */ implements Serializable{
	private static final long serialVersionUID = -4097963501691758744L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_id_seq_gen")
	@SequenceGenerator(name = "group_id_seq_gen", sequenceName = "group_seq")

	@Column(name="GROUP_ID")
	private Long groupId;

	@Column(name = "group_name", nullable = false, unique = true, length = 50)
	@Index(name = "idx_group_name")
	private String groupName;

	@Column(name = "group_comment", nullable = false, length = 200)
	private String groupComment;

	@Column
	private boolean enabled;
	//@NotAudited
	@OneToMany(mappedBy = "id.group", cascade = CascadeType.REFRESH)
	private Set<GroupAuthorityRelationship> groupAuthorityRelationships;
	//@NotAudited
	@OneToMany(mappedBy = "id.group", cascade = CascadeType.REFRESH)
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

	public void setGroupAuthorityRelationships(
			Set<GroupAuthorityRelationship> groupAuthorityRelationships) {
		this.groupAuthorityRelationships = groupAuthorityRelationships;
	}

	public Set<GroupUserRelationship> getGroupUserRelationships() {
		return groupUserRelationships;
	}

	public void setGroupUserRelationships(
			Set<GroupUserRelationship> groupUserRelationships) {
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

	public void removeGroupAuthorityRelationship(
			Set<GroupAuthorityRelationship> rels) {
		if (groupAuthorityRelationships != null) {
			groupAuthorityRelationships.remove(rels);
		}
	}

	public void addGroupAuthorityRelationships(
			Set<GroupAuthorityRelationship> rels) {
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
