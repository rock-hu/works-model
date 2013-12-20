package org.works.model.domain.attachment;

import java.io.Serializable;

import org.works.model.domain.product.Product;

public class Attachment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4924659375179235237L;

	private Long attachmentId;

	private String absolutePath;

	private long fieSize;
	private ContentType contentType;

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
