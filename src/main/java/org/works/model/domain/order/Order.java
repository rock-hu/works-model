package org.works.model.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import org.works.model.domain.address.Address;
import org.works.model.domain.user.User;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6421800718073084925L;

	private Long orderId;

	private Date submitDate;
	private BigDecimal totalAmount;
	private User user;
	private Set<OrderItem> orderItemes;
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
