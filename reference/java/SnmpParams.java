_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpParams.java
    public void setProtocolVersion(int protocolversion) {

    /**
     * Sets the version of the protocol to be used.
     * The version should be identified using the definitions
     * contained in
     * {@link com.sun.jmx.snmp.SnmpDefinitions SnmpDefinitions}.
     * <BR>For instance if you wish to use SNMPv2, you can call the method as follows:
     * <BLOCKQUOTE><PRE>
     * setProtocolVersion(SnmpDefinitions.snmpVersionTwo);
     * </PRE></BLOCKQUOTE>
     * @param protocolversion The version of the protocol to be used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpParams.java
    public int getProtocolVersion() {

    /**
     * Returns the version of the protocol to use.
     * The returned value is:
     * <UL>
     * <LI>{@link com.sun.jmx.snmp.SnmpDefinitions#snmpVersionOne snmpVersionOne} if the protocol is SNMPv1
     * <LI>{@link com.sun.jmx.snmp.SnmpDefinitions#snmpVersionTwo snmpVersionTwo} if the protocol is SNMPv2
     * <LI>{@link com.sun.jmx.snmp.SnmpDefinitions#snmpVersionThree snmpVersionThree} if the protocol is SNMPv3
     * </UL>
     * @return The version of the protocol to use.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpParams.java
    public abstract boolean allowSnmpSets();

    /**
     * Checks whether parameters are in place for an SNMP <CODE>set</CODE> operation.
     * @return <CODE>true</CODE> if parameters are in place, <CODE>false</CODE> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpParams.java
public abstract class SnmpParams implements SnmpDefinitions {

/**
 * This class is the base class of all parameters that are used when making SNMP requests to an <CODE>SnmpPeer</CODE>.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
