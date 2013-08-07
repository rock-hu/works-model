package org.works.model.domain.product;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_product_category")
public class ProductCategory /* extends AbstractAuditable<User, Long> */implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1226663277448007986L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_category_id_seq_gen")
	@SequenceGenerator(name = "product_category_id_seq_gen", sequenceName = "PRODUCT_CATEGORY_SEQ")
	@Column(name = "PRODUCT_CATEGORY_ID")
	private Long productCategoryId;

	@Column
	private String category;
	@Column
	private String description;
	//@NotAudited
	@ManyToOne
	@JoinColumn(referencedColumnName = "PRODUCT_CATEGORY_ID", name = "PARENT_ID")
	private ProductCategory parent;
	//@NotAudited
	@OneToMany(mappedBy = "parent")
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
