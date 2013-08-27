package org.works.batch.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {

	private BigDecimal sourceAccountNo;

	private BigDecimal destinationAccountNo;

	private BigDecimal amount;

	private Date date;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getSourceAccountNo() {
		return sourceAccountNo;
	}

	public void setSourceAccountNo(BigDecimal sourceAccountNo) {
		this.sourceAccountNo = sourceAccountNo;
	}

	public BigDecimal getDestinationAccountNo() {
		return destinationAccountNo;
	}

	public void setDestinationAccountNo(BigDecimal destinationAccountNo) {
		this.destinationAccountNo = destinationAccountNo;
	}

}
