package org.works.batch.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class StockPriceHistory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2464283265306370803L;
	private Long itemId;

	private String stockCode;

	private Date priceDate;
	private PriceType priceType;

	private BigDecimal openPrice;
	private BigDecimal highPrice;
	private BigDecimal lowPrice;
	private BigDecimal closePrice;

	private BigDecimal volume;

	private BigDecimal adjClosePrice;

	private Timestamp recCreateTime;

	private Timestamp recUpdateTime;

	public StockPriceHistory() {
		Timestamp current = new Timestamp(System.currentTimeMillis());
		recCreateTime = current;
		recUpdateTime = current;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Date getPriceDate() {
		return priceDate;
	}

	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}

	public BigDecimal getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}

	public BigDecimal getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(BigDecimal highPrice) {
		this.highPrice = highPrice;
	}

	public BigDecimal getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(BigDecimal lowPrice) {
		this.lowPrice = lowPrice;
	}

	public BigDecimal getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getAdjClosePrice() {
		return adjClosePrice;
	}

	public void setAdjClosePrice(BigDecimal adjClosePrice) {
		this.adjClosePrice = adjClosePrice;
	}

	public Date getRecCreateTime() {
		return recCreateTime;
	}

	public Timestamp getRecUpdateTime() {
		return recUpdateTime;
	}

	public void setRecUpdateTime(Timestamp recUpdateTime) {
		this.recUpdateTime = recUpdateTime;
	}

	public void setRecCreateTime(Timestamp recCreateTime) {
		this.recCreateTime = recCreateTime;
	}

	public PriceType getPriceType() {
		return priceType;
	}

	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}

}
