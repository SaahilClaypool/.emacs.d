_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    final static String name = "TimeTicks" ;

    /**
     * Name of the type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    final public String getTypeName() {

    /**
     * Returns a textual description of the type object.
     * @return ASN.1 textual description.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    final public String toString() {

    /**
     * Converts the timeticks value to its <CODE>String</CODE> form.
     * The format of the returned <CODE>String</CODE> is <CODE>d days hh:mm:ss</CODE>.
     * <BR>Note: this method simply calls the {@link #printTimeTicks printTimeTicks} method.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    final static public String printTimeTicks(long timeticks) {

    /**
     * Parses the specified long value with time units and
     * returns a <CODE>String</CODE> of the form <CODE>d days hh:mm:ss</CODE>.
     * @param timeticks The value to be parsed.
     * @return The <CODE>String</CODE> representation of the value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    public SnmpTimeticks(Long v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpTimeticks</CODE> from the specified
     * <CODE>Long</CODE> value.
     * <p>If the specified value is greater than {@link
     * SnmpUnsignedInt#MAX_VALUE SnmpUnsignedInt.MAX_VALUE}, the SnmpTimeTicks
     * will be initialized with <code>v%(SnmpUnsignedInt.MAX_VALUE+1)</code>.
     * @param v The initialization value.
     * @exception IllegalArgumentException if the specified value is negative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    public SnmpTimeticks(long v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpTimeticks</CODE> from the specified long
     * value.
     * <p>If the specified value is greater than {@link
     * SnmpUnsignedInt#MAX_VALUE SnmpUnsignedInt.MAX_VALUE}, the SnmpTimeTicks
     * will be initialized with <code>v%(SnmpUnsignedInt.MAX_VALUE+1)</code>.
     * @param v The initialization value.
     * @exception IllegalArgumentException if the specified value is negative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    public SnmpTimeticks(Integer v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpTimeticks</CODE> from the specified
     * <CODE>Integer</CODE> value.
     * @param v The initialization value.
     * @exception IllegalArgumentException The specified value is negative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
    public SnmpTimeticks(int v) throws IllegalArgumentException {

    /**
     * Constructs a new <CODE>SnmpTimeticks</CODE> from the specified
     * integer value.
     * @param v The initialization value.
     * @exception IllegalArgumentException The specified value is negative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpTimeticks.java
public class SnmpTimeticks extends SnmpUnsignedInt {

/**
 * Contains an <CODE>SnmpTimeTick</CODE> value which
 * has units of 1/100th of a second.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 *
 */
