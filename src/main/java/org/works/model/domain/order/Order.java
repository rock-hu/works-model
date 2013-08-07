package org.works.model.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.works.model.domain.address.Address;
import org.works.model.domain.user.User;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_order")
public class Order /*extends AbstractAuditable<User, Long>*/ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6421800718073084925L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq_gen")
	@SequenceGenerator(name = "order_id_seq_gen", sequenceName = "ORDER_SEQ")
	@Column(name="ORDER_ID")
	private Long orderId;

	@Column
	private Date submitDate;
	@Column(precision = 2)
	private BigDecimal totalAmount;
	//@NotAudited
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "user_id", referencedColumnName = "user_id") })
	private User user;
	//@NotAudited
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
	private Set<OrderItem> orderItemes;
	//@NotAudited
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "address_id", referencedColumnName = "address_id") })
	private Address address;

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Set<OrderItem> getOrderItemes() {
		return orderItemes;
	}

	public void setOrderItemes(Set<OrderItem> orderItemes) {
		this.orderItemes = orderItemes;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

}
