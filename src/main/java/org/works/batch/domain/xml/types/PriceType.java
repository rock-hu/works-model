/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.works.batch.domain.xml.types;

/**
 * Enumeration PriceType.
 * 
 * @version $Revision$ $Date$
 */
public enum PriceType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant D
     */
    D("D"),
    /**
     * Constant W
     */
    W("W"),
    /**
     * Constant M
     */
    M("M"),
    /**
     * Constant Y
     */
    Y("Y");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, PriceType> enumConstants = new java.util.HashMap<java.lang.String, PriceType>();


    static {
        for (PriceType c: PriceType.values()) {
            PriceType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private PriceType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.works.batch.domain.xml.types.PriceType fromValue(
            final java.lang.String value) {
        PriceType c = PriceType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
