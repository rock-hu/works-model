package org.works.model.domain.authority;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.springframework.security.core.GrantedAuthority;
import org.works.model.domain.group.GroupAuthorityRelationship;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_authoritiy")
public class Authority /*extends AbstractAuditable<User, Long>*/ implements
		GrantedAuthority,Serializable {
	private static final long serialVersionUID = 716715419025948964L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authority_id_seq_gen")
	@SequenceGenerator(name = "authority_id_seq_gen", sequenceName = "authority_seq")
	@Column(name="authority_id")
	private Long authorityId;
	
	@Column(name = "authority", nullable = false, length = 50)
	private String authority;
	@Column(name = "authority_comment", nullable = true, length = 200)
	private String authorityComment;
	//@NotAudited
	@OneToMany(mappedBy = "id.authority")
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

	public void setGroupAuthorityRelationships(
			Set<GroupAuthorityRelationship> groupAuthorityRelationships) {
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

	public void removeGroupAuthorityRelationships(
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
