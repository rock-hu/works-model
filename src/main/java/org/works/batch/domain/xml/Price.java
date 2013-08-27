/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.works.batch.domain.xml;

/**
 * Class Price.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Price implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _stockCode.
     */
    private java.lang.String _stockCode;

    /**
     * Field _effDate.
     */
    private org.exolab.castor.types.Date _effDate;

    /**
     * Field _priceType.
     */
    private org.works.batch.domain.xml.types.PriceType _priceType;

    /**
     * Field _openPrice.
     */
    private java.math.BigDecimal _openPrice;

    /**
     * Field _highPrice.
     */
    private java.math.BigDecimal _highPrice;

    /**
     * Field _lowPrice.
     */
    private java.math.BigDecimal _lowPrice;

    /**
     * Field _closePrice.
     */
    private java.math.BigDecimal _closePrice;

    /**
     * Field _volumeAmount.
     */
    private java.math.BigDecimal _volumeAmount;

    /**
     * Field _adjustClosePrice.
     */
    private java.math.BigDecimal _adjustClosePrice;

    /**
     * Field _recDateTime.
     */
    private org.works.batch.domain.xml.RecDateTime _recDateTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public Price() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'adjustClosePrice'.
     * 
     * @return the value of field 'AdjustClosePrice'.
     */
    public java.math.BigDecimal getAdjustClosePrice(
    ) {
        return this._adjustClosePrice;
    }

    /**
     * Returns the value of field 'closePrice'.
     * 
     * @return the value of field 'ClosePrice'.
     */
    public java.math.BigDecimal getClosePrice(
    ) {
        return this._closePrice;
    }

    /**
     * Returns the value of field 'effDate'.
     * 
     * @return the value of field 'EffDate'.
     */
    public org.exolab.castor.types.Date getEffDate(
    ) {
        return this._effDate;
    }

    /**
     * Returns the value of field 'highPrice'.
     * 
     * @return the value of field 'HighPrice'.
     */
    public java.math.BigDecimal getHighPrice(
    ) {
        return this._highPrice;
    }

    /**
     * Returns the value of field 'lowPrice'.
     * 
     * @return the value of field 'LowPrice'.
     */
    public java.math.BigDecimal getLowPrice(
    ) {
        return this._lowPrice;
    }

    /**
     * Returns the value of field 'openPrice'.
     * 
     * @return the value of field 'OpenPrice'.
     */
    public java.math.BigDecimal getOpenPrice(
    ) {
        return this._openPrice;
    }

    /**
     * Returns the value of field 'priceType'.
     * 
     * @return the value of field 'PriceType'.
     */
    public org.works.batch.domain.xml.types.PriceType getPriceType(
    ) {
        return this._priceType;
    }

    /**
     * Returns the value of field 'recDateTime'.
     * 
     * @return the value of field 'RecDateTime'.
     */
    public org.works.batch.domain.xml.RecDateTime getRecDateTime(
    ) {
        return this._recDateTime;
    }

    /**
     * Returns the value of field 'stockCode'.
     * 
     * @return the value of field 'StockCode'.
     */
    public java.lang.String getStockCode(
    ) {
        return this._stockCode;
    }

    /**
     * Returns the value of field 'volumeAmount'.
     * 
     * @return the value of field 'VolumeAmount'.
     */
    public java.math.BigDecimal getVolumeAmount(
    ) {
        return this._volumeAmount;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'adjustClosePrice'.
     * 
     * @param adjustClosePrice the value of field 'adjustClosePrice'
     */
    public void setAdjustClosePrice(
            final java.math.BigDecimal adjustClosePrice) {
        this._adjustClosePrice = adjustClosePrice;
    }

    /**
     * Sets the value of field 'closePrice'.
     * 
     * @param closePrice the value of field 'closePrice'.
     */
    public void setClosePrice(
            final java.math.BigDecimal closePrice) {
        this._closePrice = closePrice;
    }

    /**
     * Sets the value of field 'effDate'.
     * 
     * @param effDate the value of field 'effDate'.
     */
    public void setEffDate(
            final org.exolab.castor.types.Date effDate) {
        this._effDate = effDate;
    }

    /**
     * Sets the value of field 'highPrice'.
     * 
     * @param highPrice the value of field 'highPrice'.
     */
    public void setHighPrice(
            final java.math.BigDecimal highPrice) {
        this._highPrice = highPrice;
    }

    /**
     * Sets the value of field 'lowPrice'.
     * 
     * @param lowPrice the value of field 'lowPrice'.
     */
    public void setLowPrice(
            final java.math.BigDecimal lowPrice) {
        this._lowPrice = lowPrice;
    }

    /**
     * Sets the value of field 'openPrice'.
     * 
     * @param openPrice the value of field 'openPrice'.
     */
    public void setOpenPrice(
            final java.math.BigDecimal openPrice) {
        this._openPrice = openPrice;
    }

    /**
     * Sets the value of field 'priceType'.
     * 
     * @param priceType the value of field 'priceType'.
     */
    public void setPriceType(
            final org.works.batch.domain.xml.types.PriceType priceType) {
        this._priceType = priceType;
    }

    /**
     * Sets the value of field 'recDateTime'.
     * 
     * @param recDateTime the value of field 'recDateTime'.
     */
    public void setRecDateTime(
            final org.works.batch.domain.xml.RecDateTime recDateTime) {
        this._recDateTime = recDateTime;
    }

    /**
     * Sets the value of field 'stockCode'.
     * 
     * @param stockCode the value of field 'stockCode'.
     */
    public void setStockCode(
            final java.lang.String stockCode) {
        this._stockCode = stockCode;
    }

    /**
     * Sets the value of field 'volumeAmount'.
     * 
     * @param volumeAmount the value of field 'volumeAmount'.
     */
    public void setVolumeAmount(
            final java.math.BigDecimal volumeAmount) {
        this._volumeAmount = volumeAmount;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.works.batch.domain.xml.Price
     */
    public static org.works.batch.domain.xml.Price unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.works.batch.domain.xml.Price) org.exolab.castor.xml.Unmarshaller.unmarshal(org.works.batch.domain.xml.Price.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
