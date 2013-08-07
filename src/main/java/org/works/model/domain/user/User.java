package org.works.model.domain.user;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Index;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Email;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.works.model.domain.address.Address;
import org.works.model.domain.group.GroupUserRelationship;
import org.works.model.domain.order.Order;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_user")
public class User /* extends AbstractPersistable<Long> */implements UserDetails {
	private static final long serialVersionUID = -5827848755589450804L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq_gen")
	@SequenceGenerator(name = "user_id_seq_gen", sequenceName = "user_seq")
	@Column(name = "USER_ID")
	private Long userId;

	@NotNull
	@Size(min = 1, max = 20)
	@Column(name = "USERNAME", length = 20, unique = true, nullable = false)
	private String username;
	@NotNull
	@Size(min = 1, max = 20)
	@RegExp(value = "(?=.*?//p{Upper})(?=.*?//p{Lower })(?=.*?//d)(?=.*?[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？])")
	@Column(name = "password", nullable = false, length = 20)
	@Index(name = "idx_user_password")
	private String password;
	@Transient
	private String confirmPassword;
	@Transient
	private boolean rememberMe;
	@Transient
	private String captchaCode;
	@Column(name = "account_non_expired")
	private boolean accountNonExpired;
	@Column(name = "account_non_locked")
	private boolean accountNonLocked;
	@Column(name = "credentials_non_expired")
	private boolean credentialsNonExpired;

	@Column
	private boolean enabled;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expired_time")
	private Date expiredTime;
	@Column(name = "pwd_eff_rem_day_cnt")
	private int passwordEffectiveRemainDayCount;
	//@NotAudited
	@Transient
	private Collection<GrantedAuthority> authorities;
	@Column(name = "email", unique = true, nullable = false)
	@Email
	private String email;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time")
	private Date createTime;
	//@NotAudited
	@OneToMany(mappedBy = "id.user")
	private Set<GroupUserRelationship> groupUserRelationships;
	//@NotAudited
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<UserActiveDepository> userActiveDepository;
	//@NotAudited
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private UserExtend userExtend;
	//@NotAudited
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Order> orders;
	//@NotAudited
	@ManyToMany
	@JoinTable(name = "t_user_address_map", joinColumns = { @JoinColumn(referencedColumnName = "user_id", name = "user_id") }, inverseJoinColumns = { @JoinColumn(referencedColumnName = "address_id", name = "address_id") })
	private Set<Address> addresses;

	public User() {
	}

	public User(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		if (((username == null) || "".equals(username)) || (password == null)) {
			throw new IllegalArgumentException(
					"Cannot pass null or empty values to constructor");
		}
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.authorities = Collections
				.unmodifiableSet(sortAuthorities(authorities));
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	@Override
	public int hashCode() {
		return username.hashCode();
	}

	@Override
	public boolean equals(Object rhs) {
		if (rhs instanceof User) {
			return username.equals(((User) rhs).username);
		}
		return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

	public Set<UserActiveDepository> getUserActiveDepository() {
		return userActiveDepository;
	}

	public void setUserActiveDepository(
			Set<UserActiveDepository> userActiveDepository) {
		this.userActiveDepository = userActiveDepository;
	}

	public UserExtend getUserExtend() {
		return userExtend;
	}

	public void setUserExtend(UserExtend userExtend) {
		this.userExtend = userExtend;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Set<GroupUserRelationship> getGroupUserRelationships() {
		return groupUserRelationships;
	}

	public void setGroupUserRelationships(
			Set<GroupUserRelationship> groupUserRelationships) {
		this.groupUserRelationships = groupUserRelationships;
	}

	public void addGroupUserRelationship(GroupUserRelationship rel) {
		if (groupUserRelationships != null) {
			groupUserRelationships.add(rel);
		} else {
			groupUserRelationships = new HashSet<GroupUserRelationship>();
			groupUserRelationships.add(rel);
		}
	}

	public void removeGroupUserRelationship(GroupUserRelationship rel) {
		if (groupUserRelationships != null) {
			groupUserRelationships.remove(rel);
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

	public void removeGroupUserRelationships(Set<GroupUserRelationship> rels) {
		if (groupUserRelationships != null) {
			groupUserRelationships.removeAll(rels);
		}
	}

	private static SortedSet<GrantedAuthority> sortAuthorities(
			Collection<? extends GrantedAuthority> authorities) {
		Assert.notNull(authorities,
				"Cannot pass a null GrantedAuthority collection");
		// Ensure array iteration order is predictable (as per
		// UserDetails.getAuthorities() contract and SEC-717)
		SortedSet<GrantedAuthority> sortedAuthorities = new TreeSet<GrantedAuthority>(
				new AuthorityComparator());

		for (GrantedAuthority grantedAuthority : authorities) {
			Assert.notNull(grantedAuthority,
					"GrantedAuthority list cannot contain any null elements");
			sortedAuthorities.add(grantedAuthority);
		}

		return sortedAuthorities;
	}

	private static class AuthorityComparator implements
			Comparator<GrantedAuthority>, Serializable {
		private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

		public int compare(GrantedAuthority g1, GrantedAuthority g2) {

			if (g2.getAuthority() == null) {
				return -1;
			}

			if (g1.getAuthority() == null) {
				return 1;
			}

			return g1.getAuthority().compareTo(g2.getAuthority());
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(": ");
		sb.append("Username: ").append(this.username).append("; ");
		sb.append("Password: [PROTECTED]; ");
		sb.append("Enabled: ").append(this.enabled).append("; ");
		sb.append("AccountNonExpired: ").append(this.accountNonExpired)
				.append("; ");
		sb.append("credentialsNonExpired: ").append(this.credentialsNonExpired)
				.append("; ");
		sb.append("AccountNonLocked: ").append(this.accountNonLocked)
				.append("; ");

		if (!authorities.isEmpty()) {
			sb.append("Granted Authorities: ");

			boolean first = true;
			for (GrantedAuthority auth : authorities) {
				if (!first) {
					sb.append(",");
				}
				first = false;

				sb.append(auth);
			}
		} else {
			sb.append("Not granted any authorities");
		}

		return sb.toString();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getPasswordEffectiveRemainDayCount() {
		return passwordEffectiveRemainDayCount;
	}

	public void setPasswordEffectiveRemainDayCount(
			int passwordEffectiveRemainDayCount) {
		this.passwordEffectiveRemainDayCount = passwordEffectiveRemainDayCount;
	}

}
