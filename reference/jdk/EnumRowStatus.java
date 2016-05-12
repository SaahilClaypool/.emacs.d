_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    static public boolean isValidValue(int value) {

    /**
     * Check that the given <code>value</code> is valid.
     *
     * Valid values are:
     * <ul><li><i>unspecified(0)</i></li>
     *     <li><i>active(1)</i></li>
     *     <li><i>notInService(2)</i></li>
     *     <li><i>notReady(3)</i></li>
     *     <li><i>createAndGo(4)</i></li>
     *     <li><i>createAndWait(5)</i></li>
     *     <li><i>destroy(6)</i></li>
     * </ul>
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public SnmpInt toSnmpValue()

    /**
     * Build an SnmpValue from this object.
     *
     * @exception IllegalArgumentException if this object holds an
     *            <i>unspecified</i> value.
     * @return an SnmpInt containing this object value.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(SnmpInt valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>SnmpInt</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(String x)

    /**
     * Build an <code>EnumRowStatus</code> from a <code>String</code>.
     * @param x should be either "unspecified", or one of
     *        the values defined in RFC 2579 ("active", "notReady", etc...)
     * @exception IllegalArgumentException if the given String
     *            <code>x</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus()

    /**
     * Build an <code>EnumRowStatus</code> with <i>unspecified</i> value.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(Long valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from a <code>Long</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(Integer valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>Integer</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(long valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from a <code>long</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(Enumerated valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>Enumerated</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(int valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>int</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int destroy       = 6;

    /**
     * This value corresponds to the <i>destroy</i> RowStatus, as defined in
     * RFC 2579 from SMIv2:
     * <ul>
     * <i>destroy</i> is supplied by a management station
     * wishing to delete all of the instances associated with
     * an existing conceptual row.
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int createAndWait = 5;

    /**
     * This value corresponds to the <i>createAndWait</i> RowStatus,
     * as defined in RFC 2579 from SMIv2:
     * <ul>
     * <i>createAndWait</i> is supplied by a management
     * station wishing to create a new instance of a
     * conceptual row (but not make it available for use by
     * the managed device);
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int createAndGo   = 4;

    /**
     * This value corresponds to the <i>createAndGo</i> RowStatus,
     * as defined in RFC 2579 from SMIv2:
     * <ul>
     * <i>createAndGo</i> is supplied by a management
     * station wishing to create a new instance of a
     * conceptual row and to have its status automatically set
     * to active, making it available for use by the managed
     * device;
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int notReady      = 3;

    /**
     * This value corresponds to the <i>notReady</i> RowStatus, as defined
     * in RFC 2579 from SMIv2:
     * <ul>
     * <i>notReady</i> indicates that the conceptual row
     * exists in the agent, but is missing information
     * necessary in order to be available for use by the
     * managed device (i.e., one or more required columns in
     * the conceptual row have not been instantiated);
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int notInService  = 2;

    /**
     * This value corresponds to the <i>notInService</i> RowStatus, as
     * defined in RFC 2579 from SMIv2:
     * <ul>
     * <i>notInService</i> indicates that the conceptual
     * row exists in the agent, but is unavailable for use by
     * the managed device; <i>notInService</i> has
     * no implication regarding the internal consistency of
     * the row, availability of resources, or consistency with
     * the current state of the managed device;
     * </ul>
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int active        = 1;

    /**
     * This value corresponds to the <i>active</i> RowStatus, as defined in
     * RFC 2579 from SMIv2:
     * <ul>
     * <i>active</i> indicates that the conceptual row is available for
     * use by the managed device;
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int unspecified   = 0;

    /**
     * This value is SNMP Runtime implementation specific, and is used to identify
     * unspecified actions (when for instance the RowStatus variable
     * is not present in the varbind list) or uninitialized values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
public class EnumRowStatus extends Enumerated implements Serializable {

/**
 * This class is an internal class which is used to represent RowStatus
 * codes as defined in RFC 2579.
 *
 * It defines an additional code, <i>unspecified</i>, which is
 * implementation specific, and is used to identify
 * unspecified actions (when for instance the RowStatus variable
 * is not present in the varbind list) or uninitialized values.
 *
 * mibgen does not generate objects of this class but any variable
 * using the RowStatus textual convention can be converted into an
 * object of this class thanks to the
 * <code>EnumRowStatus(Enumerated valueIndex)</code> constructor.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    static public boolean isValidValue(int value) {

    /**
     * Check that the given <code>value</code> is valid.
     *
     * Valid values are:
     * <ul><li><i>unspecified(0)</i></li>
     *     <li><i>active(1)</i></li>
     *     <li><i>notInService(2)</i></li>
     *     <li><i>notReady(3)</i></li>
     *     <li><i>createAndGo(4)</i></li>
     *     <li><i>createAndWait(5)</i></li>
     *     <li><i>destroy(6)</i></li>
     * </ul>
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public SnmpInt toSnmpValue()

    /**
     * Build an SnmpValue from this object.
     *
     * @exception IllegalArgumentException if this object holds an
     *            <i>unspecified</i> value.
     * @return an SnmpInt containing this object value.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(SnmpInt valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>SnmpInt</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(String x)

    /**
     * Build an <code>EnumRowStatus</code> from a <code>String</code>.
     * @param x should be either "unspecified", or one of
     *        the values defined in RFC 2579 ("active", "notReady", etc...)
     * @exception IllegalArgumentException if the given String
     *            <code>x</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus()

    /**
     * Build an <code>EnumRowStatus</code> with <i>unspecified</i> value.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(Long valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from a <code>Long</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(Integer valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>Integer</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(long valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from a <code>long</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(Enumerated valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>Enumerated</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public EnumRowStatus(int valueIndex)

    /**
     * Build an <code>EnumRowStatus</code> from an <code>int</code>.
     * @param valueIndex should be either 0 (<i>unspecified</i>), or one of
     *        the values defined in RFC 2579.
     * @exception IllegalArgumentException if the given
     *            <code>valueIndex</code> is not valid.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int destroy       = 6;

    /**
     * This value corresponds to the <i>destroy</i> RowStatus, as defined in
     * RFC 2579 from SMIv2:
     * <ul>
     * <i>destroy</i> is supplied by a management station
     * wishing to delete all of the instances associated with
     * an existing conceptual row.
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int createAndWait = 5;

    /**
     * This value corresponds to the <i>createAndWait</i> RowStatus,
     * as defined in RFC 2579 from SMIv2:
     * <ul>
     * <i>createAndWait</i> is supplied by a management
     * station wishing to create a new instance of a
     * conceptual row (but not make it available for use by
     * the managed device);
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int createAndGo   = 4;

    /**
     * This value corresponds to the <i>createAndGo</i> RowStatus,
     * as defined in RFC 2579 from SMIv2:
     * <ul>
     * <i>createAndGo</i> is supplied by a management
     * station wishing to create a new instance of a
     * conceptual row and to have its status automatically set
     * to active, making it available for use by the managed
     * device;
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int notReady      = 3;

    /**
     * This value corresponds to the <i>notReady</i> RowStatus, as defined
     * in RFC 2579 from SMIv2:
     * <ul>
     * <i>notReady</i> indicates that the conceptual row
     * exists in the agent, but is missing information
     * necessary in order to be available for use by the
     * managed device (i.e., one or more required columns in
     * the conceptual row have not been instantiated);
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int notInService  = 2;

    /**
     * This value corresponds to the <i>notInService</i> RowStatus, as
     * defined in RFC 2579 from SMIv2:
     * <ul>
     * <i>notInService</i> indicates that the conceptual
     * row exists in the agent, but is unavailable for use by
     * the managed device; <i>notInService</i> has
     * no implication regarding the internal consistency of
     * the row, availability of resources, or consistency with
     * the current state of the managed device;
     * </ul>
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int active        = 1;

    /**
     * This value corresponds to the <i>active</i> RowStatus, as defined in
     * RFC 2579 from SMIv2:
     * <ul>
     * <i>active</i> indicates that the conceptual row is available for
     * use by the managed device;
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
    public final static int unspecified   = 0;

    /**
     * This value is SNMP Runtime implementation specific, and is used to identify
     * unspecified actions (when for instance the RowStatus variable
     * is not present in the varbind list) or uninitialized values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/EnumRowStatus.java
public class EnumRowStatus extends Enumerated implements Serializable {

/**
 * This class is an internal class which is used to represent RowStatus
 * codes as defined in RFC 2579.
 *
 * It defines an additional code, <i>unspecified</i>, which is
 * implementation specific, and is used to identify
 * unspecified actions (when for instance the RowStatus variable
 * is not present in the varbind list) or uninitialized values.
 *
 * mibgen does not generate objects of this class but any variable
 * using the RowStatus textual convention can be converted into an
 * object of this class thanks to the
 * <code>EnumRowStatus(Enumerated valueIndex)</code> constructor.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 **/
