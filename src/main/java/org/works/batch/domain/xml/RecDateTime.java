/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.works.batch.domain.xml;

/**
 * Class RecDateTime.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RecDateTime implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _recCreateTime.
     */
    private java.lang.String _recCreateTime;

    /**
     * Field _recUpdateTime.
     */
    private java.lang.String _recUpdateTime;

    /**
     * Field _timezone.
     */
    private java.lang.String _timezone;


      //----------------/
     //- Constructors -/
    //----------------/

    public RecDateTime() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'recCreateTime'.
     * 
     * @return the value of field 'RecCreateTime'.
     */
    public java.lang.String getRecCreateTime(
    ) {
        return this._recCreateTime;
    }

    /**
     * Returns the value of field 'recUpdateTime'.
     * 
     * @return the value of field 'RecUpdateTime'.
     */
    public java.lang.String getRecUpdateTime(
    ) {
        return this._recUpdateTime;
    }

    /**
     * Returns the value of field 'timezone'.
     * 
     * @return the value of field 'Timezone'.
     */
    public java.lang.String getTimezone(
    ) {
        return this._timezone;
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
     * Sets the value of field 'recCreateTime'.
     * 
     * @param recCreateTime the value of field 'recCreateTime'.
     */
    public void setRecCreateTime(
            final java.lang.String recCreateTime) {
        this._recCreateTime = recCreateTime;
    }

    /**
     * Sets the value of field 'recUpdateTime'.
     * 
     * @param recUpdateTime the value of field 'recUpdateTime'.
     */
    public void setRecUpdateTime(
            final java.lang.String recUpdateTime) {
        this._recUpdateTime = recUpdateTime;
    }

    /**
     * Sets the value of field 'timezone'.
     * 
     * @param timezone the value of field 'timezone'.
     */
    public void setTimezone(
            final java.lang.String timezone) {
        this._timezone = timezone;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.works.batch.domain.xml.RecDateTim
     */
    public static org.works.batch.domain.xml.RecDateTime unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.works.batch.domain.xml.RecDateTime) org.exolab.castor.xml.Unmarshaller.unmarshal(org.works.batch.domain.xml.RecDateTime.class, reader);
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
