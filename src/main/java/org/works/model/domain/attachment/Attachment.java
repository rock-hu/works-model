package org.works.model.domain.attachment;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.works.model.domain.product.Product;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "t_attachment")
public class Attachment /*extends AbstractAuditable<User, Long>*/ implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4924659375179235237L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attachment_id_seq_gen")
	@SequenceGenerator(name = "attachment_id_seq_gen", sequenceName = "attachment_seq")
	@Column(name="attachment_id")
	private Long attachmentId;
	
	@Column
	private String absolutePath;

	@Column
	private long fieSize;
	@Enumerated(EnumType.STRING)
	private ContentType contentType;

	//@NotAudited
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "product_id", referencedColumnName = "product_id") })
	private Product product;

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}



	public long getFieSize() {
		return fieSize;
	}

	public void setFieSize(long fieSize) {
		this.fieSize = fieSize;
	}

	public ContentType getContentType() {
		return contentType;
	}

	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}
	
}
