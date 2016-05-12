_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    //private int               _retryPolicy ;  // not implemented as yet.

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    private String      _writeCommunity ;

    /**
     * The community to be used when issuing <CODE>set</CODE> operations.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    private int         _protocolVersion = snmpVersionOne ;

    /**
     * The protocol version.
     * By default, the value is SNMP version 1.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    final static String defaultRdCommunity = "public" ;

    /**
     * Specify the default community string to use for <CODE>get</CODE> operations.
     * By default, the value is "public".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public byte[] encodeAuthentication(int snmpCmd)

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public synchronized Object clone() {

    /**
     * Clones the object and its content.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    @Override

    /**
     * Compares two objects.
     * Two <CODE>SnmpParameters</CODE> are equal if they correspond to the same protocol version,
     * read community and write community.
     * @param obj The object to compare <CODE>this</CODE> with.
     * @return <CODE>true</CODE> if <CODE>this</CODE> and the specified object are equal, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public boolean allowSnmpSets() {

    /**
     * Checks whether parameters are in place for an SNMP <CODE>set</CODE> operation.
     * @return <CODE>true</CODE> if parameters are in place, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public void setInformCommunity(String inform) {

    /**
     * Sets the community string to use when performing <CODE>inform</CODE> requests.
     * @param inform The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public String getInformCommunity() {

    /**
     * Gets the community to be used when issuing <CODE>inform</CODE> requests.
     * @return The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public void setWrCommunity(String write) {

    /**
     * Sets the community to be used when issuing <CODE>set</CODE> operations.
     * @param write The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public String getWrCommunity() {

    /**
     * Gets the community to be used when issuing <CODE>set</CODE> operations.
     * @return The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public synchronized void setRdCommunity(String read) {

    /**
     * Sets the community string to use when performing <CODE>get</CODE> operations.
     * @param read The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public String getRdCommunity() {

    /**
     * Gets the community to be used when issuing <CODE>get</CODE> operations.
     * @return The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public SnmpParameters(String rdc, String wrc, String inform) {

    /**
     * Creates an <CODE>SnmpParameters</CODE> object.
     * This constructor allows the specification of the read/write/inform community strings.
     *
     * @param rdc community string to use for <CODE>get</CODE> operations.
     * @param wrc community string to use for <CODE>set</CODE> operations.
     * @param inform community string to use for <CODE>inform</CODE> requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public SnmpParameters(String rdc, String wrc) {

    /**
     * Creates an <CODE>SnmpParameters</CODE> object.
     * This constructor allows the specification of the read/write community strings.
     * The inform community string to use is "public".
     *
     * @param rdc community string to use for <CODE>get</CODE> operations.
     * @param wrc community string to use for <CODE>set</CODE> operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public SnmpParameters() {

    /**
     * Creates an <CODE>SnmpParameters</CODE> object with defaults set up.
     * By default, <CODE>set</CODE> operations are not allowed, the read community and
     * the inform community strings to use is "public" and the SNMP version is V1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
public class SnmpParameters extends SnmpParams implements Cloneable, Serializable {

/**
 * Contains a set of resources that are used by while sending or receiving
 * packets to and from an <CODE>SnmpPeer</CODE>. An <CODE>SnmpPeer</CODE> can
 * be configured explicitly to use a specific <CODE>SnmpParameter</CODE>.
 * A number of <CODE>SnmpPeer</CODE> objects can share a single parameter
 * object.
 * <P>
 * <B>Note</B>: Changing values for an <CODE>SnmpParameter</CODE> object
 * affects all <CODE>SnmpPeer</CODE> objects that share the parameter object.
 *
 * @see com.sun.jmx.snmp.SnmpPeer
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    //private int               _retryPolicy ;  // not implemented as yet.

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    private String      _writeCommunity ;

    /**
     * The community to be used when issuing <CODE>set</CODE> operations.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    private int         _protocolVersion = snmpVersionOne ;

    /**
     * The protocol version.
     * By default, the value is SNMP version 1.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    final static String defaultRdCommunity = "public" ;

    /**
     * Specify the default community string to use for <CODE>get</CODE> operations.
     * By default, the value is "public".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public byte[] encodeAuthentication(int snmpCmd)

    /**
     * For SNMP Runtime internal use only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public synchronized Object clone() {

    /**
     * Clones the object and its content.
     * @return The object clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    @Override

    /**
     * Compares two objects.
     * Two <CODE>SnmpParameters</CODE> are equal if they correspond to the same protocol version,
     * read community and write community.
     * @param obj The object to compare <CODE>this</CODE> with.
     * @return <CODE>true</CODE> if <CODE>this</CODE> and the specified object are equal, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public boolean allowSnmpSets() {

    /**
     * Checks whether parameters are in place for an SNMP <CODE>set</CODE> operation.
     * @return <CODE>true</CODE> if parameters are in place, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public void setInformCommunity(String inform) {

    /**
     * Sets the community string to use when performing <CODE>inform</CODE> requests.
     * @param inform The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public String getInformCommunity() {

    /**
     * Gets the community to be used when issuing <CODE>inform</CODE> requests.
     * @return The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public void setWrCommunity(String write) {

    /**
     * Sets the community to be used when issuing <CODE>set</CODE> operations.
     * @param write The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public String getWrCommunity() {

    /**
     * Gets the community to be used when issuing <CODE>set</CODE> operations.
     * @return The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public synchronized void setRdCommunity(String read) {

    /**
     * Sets the community string to use when performing <CODE>get</CODE> operations.
     * @param read The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public String getRdCommunity() {

    /**
     * Gets the community to be used when issuing <CODE>get</CODE> operations.
     * @return The community string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public SnmpParameters(String rdc, String wrc, String inform) {

    /**
     * Creates an <CODE>SnmpParameters</CODE> object.
     * This constructor allows the specification of the read/write/inform community strings.
     *
     * @param rdc community string to use for <CODE>get</CODE> operations.
     * @param wrc community string to use for <CODE>set</CODE> operations.
     * @param inform community string to use for <CODE>inform</CODE> requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public SnmpParameters(String rdc, String wrc) {

    /**
     * Creates an <CODE>SnmpParameters</CODE> object.
     * This constructor allows the specification of the read/write community strings.
     * The inform community string to use is "public".
     *
     * @param rdc community string to use for <CODE>get</CODE> operations.
     * @param wrc community string to use for <CODE>set</CODE> operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
    public SnmpParameters() {

    /**
     * Creates an <CODE>SnmpParameters</CODE> object with defaults set up.
     * By default, <CODE>set</CODE> operations are not allowed, the read community and
     * the inform community strings to use is "public" and the SNMP version is V1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpParameters.java
public class SnmpParameters extends SnmpParams implements Cloneable, Serializable {

/**
 * Contains a set of resources that are used by while sending or receiving
 * packets to and from an <CODE>SnmpPeer</CODE>. An <CODE>SnmpPeer</CODE> can
 * be configured explicitly to use a specific <CODE>SnmpParameter</CODE>.
 * A number of <CODE>SnmpPeer</CODE> objects can share a single parameter
 * object.
 * <P>
 * <B>Note</B>: Changing values for an <CODE>SnmpParameter</CODE> object
 * affects all <CODE>SnmpPeer</CODE> objects that share the parameter object.
 *
 * @see com.sun.jmx.snmp.SnmpPeer
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
