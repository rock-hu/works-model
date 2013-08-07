package org.works.model.domain.batch;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(name = "T_BATCH_INCM_FILE", uniqueConstraints = { @UniqueConstraint(columnNames = {
		"path", "incm_time" }) })
public class BatchIncomingFile implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incomning_file_id_seq_gen")
	@SequenceGenerator(name = "incomning_file_id_seq_gen", sequenceName = "BATCH_INCOMNING_FILE_SEQ")
	@Column(name = "batch_incomning_file_id")
	private Long incomningFileId;
	@Column(name = "incm_time")
	private Timestamp incomingTime;
	@Column(name = "process_start_time")
	private Timestamp processingStartTime;
	@Column(name = "process_compl_time")
	private Timestamp processingCompleteTime;
	@Column(name = "process_stat_code")
	private String processStatusCode;
	@Column(name = "path")
	private String path;
	@Column(name = "dest_path")
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
