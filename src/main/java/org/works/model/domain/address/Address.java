package org.works.model.domain.address;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.works.model.domain.order.Order;
import org.works.model.domain.user.User;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_address")
public class Address /*extends AbstractAuditable<User, Long>*/ implements Serializable {

	private static final long serialVersionUID = 2126405256457151764L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_id_seq_gen")
	@SequenceGenerator(name = "address_id_seq_gen", sequenceName = "ADDRESS_SEQ")
	@Column(name = "ADDRESS_ID")

	private Long addressId;
	
	@Column
	private String street;
	@Column
	private String city;
	@Column(name = "zip_code")
	private String zipCode;
	@Column
	private String province;
	@Column
	private String country;
	//@NotAudited
	@ManyToMany(mappedBy = "addresses")
	private Set<User> users;
	//@NotAudited
//	@AuditJoinTable
	@OneToMany(mappedBy = "address")
	private Set<Order> orders;

	public Address() {
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

}
