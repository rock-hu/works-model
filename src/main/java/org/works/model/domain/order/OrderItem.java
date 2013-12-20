package org.works.model.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;

import org.works.model.domain.product.Product;

public class OrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2429981957573570879L;

	private Long orderItemId;

	private Product product;
	private long quantity;
	private String comments;
	private BigDecimal totalAmount;
	private Order order;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

}
