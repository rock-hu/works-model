package org.works.model.domain.batch;

import java.io.Serializable;
import java.sql.Timestamp;

public class BatchIncomingFile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long incomningFileId;
	private Timestamp incomingTime;
	private Timestamp processingStartTime;
	private Timestamp processingCompleteTime;
	private String processStatusCode;
	private String path;
	private String destPath;

	public Long getIncomningFileId() {
		return incomningFileId;
	}

	public void setIncomningFileId(Long incomningFileId) {
		this.incomningFileId = incomningFileId;
	}

	public Timestamp getIncomingTime() {
		return incomingTime;
	}

	public void setIncomingTime(Timestamp incomingTime) {
		this.incomingTime = incomingTime;
	}

	public Timestamp getProcessingStartTime() {
		return processingStartTime;
	}

	public void setProcessingStartTime(Timestamp processingStartTime) {
		this.processingStartTime = processingStartTime;
	}

	public Timestamp getProcessingCompleteTime() {
		return processingCompleteTime;
	}

	public void setProcessingCompleteTime(Timestamp processingCompleteTime) {
		this.processingCompleteTime = processingCompleteTime;
	}

	public String getProcessStatusCode() {
		return processStatusCode;
	}

	public void setProcessStatusCode(String processStatusCode) {
		this.processStatusCode = processStatusCode;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDestPath() {
		return destPath;
	}

	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}

}
