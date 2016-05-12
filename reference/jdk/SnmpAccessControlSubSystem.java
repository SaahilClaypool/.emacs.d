_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpAccessControlSubSystem.java
    public void checkPduAccess(int version,
                               String principal,
                               int securityLevel,
                               int pduType,
                               int securityModel,
                               byte[] contextName,
                               SnmpPdu pdu) throws SnmpStatusException, SnmpUnknownAccContrModelException;

    /**
     * Method called by the dispatcher in order to control the access at an SNMP pdu Level.
     * <P> This call is routed by the sub system to the target model according to the SNMP protocol version number.</P>
     * @param version The SNMP protocol version number.
     * @param principal The request principal.
     * @param securityLevel The request security level as defined in <CODE>SnmpEngine</CODE>.
     * @param pduType The pdu type (get, set, ...).
     * @param securityModel The security model ID.
     * @param contextName The access control context name.
     * @param pdu The pdu to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpAccessControlSubSystem.java
public interface SnmpAccessControlSubSystem extends SnmpSubSystem {

/**
 * Access Control sub system interface. To allow engine integration, an Access Control sub system must implement this interface.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpAccessControlSubSystem.java
    public void checkPduAccess(int version,
                               String principal,
                               int securityLevel,
                               int pduType,
                               int securityModel,
                               byte[] contextName,
                               SnmpPdu pdu) throws SnmpStatusException, SnmpUnknownAccContrModelException;

    /**
     * Method called by the dispatcher in order to control the access at an SNMP pdu Level.
     * <P> This call is routed by the sub system to the target model according to the SNMP protocol version number.</P>
     * @param version The SNMP protocol version number.
     * @param principal The request principal.
     * @param securityLevel The request security level as defined in <CODE>SnmpEngine</CODE>.
     * @param pduType The pdu type (get, set, ...).
     * @param securityModel The security model ID.
     * @param contextName The access control context name.
     * @param pdu The pdu to check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpAccessControlSubSystem.java
public interface SnmpAccessControlSubSystem extends SnmpSubSystem {

/**
 * Access Control sub system interface. To allow engine integration, an Access Control sub system must implement this interface.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
