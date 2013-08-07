package org.works.model.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.works.model.domain.product.Product;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_order_item")
public class OrderItem /*extends AbstractAuditable<User, Long> */ implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2429981957573570879L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_id_seq_gen")
	@SequenceGenerator(name = "order_item_id_seq_gen", sequenceName = "ORDER_ITEM_SEQ")
	@Column(name="ORDER_ITEM_ID")
	private Long orderItemId;

	
	//@NotAudited
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private Product product;
	@Column
	private long quantity;
	@Column
	private String comments;
	@Column(precision = 2)
	private BigDecimal totalAmount;
	//@NotAudited
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "order_id", referencedColumnName = "order_id") })
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
