_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public void setContextEngineId(SnmpMsg req, byte[] contextEngineId);

     /**
     * Set the context engine Id of the passed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getEncryptedPdu(SnmpMsg msg);

    /**
     * Returns the message encrypted pdu or null if no encryption. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getRawContextName(SnmpMsg msg);

    /**
     * Returns the raw message context name. Raw mean as it is received from the network, without translation. It can be useful when some data are piggy backed in the context name.The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getContextEngineId(SnmpMsg msg);

    /**
     * Returns the message context Engine Id. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getFlatSecurityParameters(SnmpMsg msg);

     /**
     * Returns an encoded representation of security parameters contained in the passed msg. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public int getMsgSecurityModel(SnmpMsg msg);

    /**
     * Returns the message security model. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public int getMsgMaxSize(SnmpMsg msg);

    /**
     * Returns the response max message size. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
public interface SnmpMsgTranslator {

/**
 * The translator interface is implemented by classes dealing with a specific SNMP protocol version. SnmpMsgTranslator are used in conjonction with SnmpMsgProcessingModel implementations.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public void setContextEngineId(SnmpMsg req, byte[] contextEngineId);

     /**
     * Set the context engine Id of the passed message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getEncryptedPdu(SnmpMsg msg);

    /**
     * Returns the message encrypted pdu or null if no encryption. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getRawContextName(SnmpMsg msg);

    /**
     * Returns the raw message context name. Raw mean as it is received from the network, without translation. It can be useful when some data are piggy backed in the context name.The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getContextEngineId(SnmpMsg msg);

    /**
     * Returns the message context Engine Id. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public byte[] getFlatSecurityParameters(SnmpMsg msg);

     /**
     * Returns an encoded representation of security parameters contained in the passed msg. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public int getMsgSecurityModel(SnmpMsg msg);

    /**
     * Returns the message security model. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
    public int getMsgMaxSize(SnmpMsg msg);

    /**
     * Returns the response max message size. The message is a generic one that is narrowed in the object implementing this interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/mpm/SnmpMsgTranslator.java
public interface SnmpMsgTranslator {

/**
 * The translator interface is implemented by classes dealing with a specific SNMP protocol version. SnmpMsgTranslator are used in conjonction with SnmpMsgProcessingModel implementations.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
