_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public boolean isEndOfMibViewValue() {

    /**
     * This method returns <CODE>false</CODE> by default and is redefined
     * in the {@link com.sun.jmx.snmp.SnmpNull} class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public boolean isNoSuchInstanceValue() {

    /**
     * This method returns <CODE>false</CODE> by default and is redefined
     * in the {@link com.sun.jmx.snmp.SnmpNull} class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public boolean isNoSuchObjectValue() {

    /**
     * This method returns <CODE>false</CODE> by default and is redefined
     * in the {@link com.sun.jmx.snmp.SnmpNull} class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public abstract SnmpValue duplicate() ;

    /**
     * Same as clone, but you cannot perform cloning using this object because
     * clone is protected. This method should call <CODE>clone()</CODE>.
     * @return The <CODE>SnmpValue</CODE> clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public abstract String getTypeName() ;

    /**
     * Returns a textual description of the object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public abstract SnmpOid toOid() ;

    /**
     * Returns the value encoded as an OID.
     * The method is particularly useful when dealing with indexed table made of
     * several SNMP variables.
     * @return The value encoded as an OID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public String toAsn1String() {

    /**
     * Returns a <CODE>String</CODE> form containing ASN.1 tagging information.
     * @return The <CODE>String</CODE> form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
public abstract class SnmpValue implements Cloneable, Serializable, SnmpDataTypeEnums {

/**
 * Is an abstract representation of an SNMP Value.
 * All classes provided for dealing with SNMP types should derive from this
 * class.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public boolean isEndOfMibViewValue() {

    /**
     * This method returns <CODE>false</CODE> by default and is redefined
     * in the {@link com.sun.jmx.snmp.SnmpNull} class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public boolean isNoSuchInstanceValue() {

    /**
     * This method returns <CODE>false</CODE> by default and is redefined
     * in the {@link com.sun.jmx.snmp.SnmpNull} class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public boolean isNoSuchObjectValue() {

    /**
     * This method returns <CODE>false</CODE> by default and is redefined
     * in the {@link com.sun.jmx.snmp.SnmpNull} class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public abstract SnmpValue duplicate() ;

    /**
     * Same as clone, but you cannot perform cloning using this object because
     * clone is protected. This method should call <CODE>clone()</CODE>.
     * @return The <CODE>SnmpValue</CODE> clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public abstract String getTypeName() ;

    /**
     * Returns a textual description of the object.
     * @return ASN.1 textual description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public abstract SnmpOid toOid() ;

    /**
     * Returns the value encoded as an OID.
     * The method is particularly useful when dealing with indexed table made of
     * several SNMP variables.
     * @return The value encoded as an OID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
    public String toAsn1String() {

    /**
     * Returns a <CODE>String</CODE> form containing ASN.1 tagging information.
     * @return The <CODE>String</CODE> form.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpValue.java
public abstract class SnmpValue implements Cloneable, Serializable, SnmpDataTypeEnums {

/**
 * Is an abstract representation of an SNMP Value.
 * All classes provided for dealing with SNMP types should derive from this
 * class.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
