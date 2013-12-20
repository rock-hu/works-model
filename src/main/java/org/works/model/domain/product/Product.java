package org.works.model.domain.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import org.works.model.domain.attachment.Attachment;
import org.works.model.domain.order.OrderItem;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -936905590532016058L;

	private Long productId;

	private String name;

	private ProductCategory category;
	private String manufacturer;
	private Date releaseDate;
	private Date discontinuationDate;
	private String brand;
	private String comments;
	private String description;
	private String longDescription;
	private Set<Attachment> attachmentes;
	private OrderItem orderItem;
	private long quantity;
	private float discount;
	private BigDecimal price;
	private float minAmount;
	private float maxAmount;
	private float weight;
	private float height;
	private float width;
	private float depth;
	private float diameter;
	private boolean taxable;
	private boolean virtual;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getDiscontinuationDate() {
		return discontinuationDate;
	}

	public void setDiscontinuationDate(Date discontinuationDate) {
		this.discontinuationDate = discontinuationDate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Set<Attachment> getAttachmentes() {
		return attachmentes;
	}

	public void setAttachmentes(Set<Attachment> attachmentes) {
		this.attachmentes = attachmentes;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public float getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(float minAmount) {
		this.minAmount = minAmount;
	}

	public float getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(float maxAmount) {
		this.maxAmount = maxAmount;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}

	public boolean isVirtual() {
		return virtual;
	}

	public void setVirtual(boolean virtual) {
		this.virtual = virtual;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
