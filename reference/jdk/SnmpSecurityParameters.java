_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpSecurityParameters.java
    String getPrincipal();

    /**
     * Principal coded inside the security parameters.
     * @return The security principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpSecurityParameters.java
    void decode(byte[] params) throws SnmpStatusException;

    /**
     * BER decoding of security parameters.
     * @param params Encoded parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpSecurityParameters.java
public interface SnmpSecurityParameters {

/**
 * Security parameters are security model dependent. Every security parameters class wishing to be passed to a security model must implement this marker interface.
 * This interface has to be implemented when developing customized security models.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpSecurityParameters.java
    String getPrincipal();

    /**
     * Principal coded inside the security parameters.
     * @return The security principal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpSecurityParameters.java
    void decode(byte[] params) throws SnmpStatusException;

    /**
     * BER decoding of security parameters.
     * @param params Encoded parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpSecurityParameters.java
public interface SnmpSecurityParameters {

/**
 * Security parameters are security model dependent. Every security parameters class wishing to be passed to a security model must implement this marker interface.
 * This interface has to be implemented when developing customized security models.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
