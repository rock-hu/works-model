package org.works.model.domain.product;

import java.io.Serializable;
import java.util.Set;

public class ProductCategory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1226663277448007986L;

	private Long productCategoryId;

	private String category;
	private String description;
	private ProductCategory parent;
	private Set<ProductCategory> children;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductCategory getParent() {
		return parent;
	}

	public void setParent(ProductCategory parent) {
		this.parent = parent;
	}

	public Set<ProductCategory> getChildren() {
		return children;
	}

	public void setChildren(Set<ProductCategory> children) {
		this.children = children;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

}
