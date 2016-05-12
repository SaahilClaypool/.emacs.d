_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public SnmpSecurityCache createSecurityCache();

    /**
     * Instantiate an <CODE>SnmpSecurityCache</CODE> that is dependant to the model implementation.
     * @return The model dependant security cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public SnmpSecurityParameters processIncomingResponse(SnmpSecurityCache cache,
                                                          int version,
                                                          int msgID,
                                                          int msgMaxSize,
                                                          byte msgFlags,
                                                          int msgSecurityModel,
                                                          byte[] params,
                                                          byte[] contextEngineID,
                                                          byte[] contextName,
                                                          byte[] data,
                                                          byte[] encryptedPdu,
                                                          SnmpDecryptedPdu decryptedPdu)

 /**
     * Called when a response is received from the network. It handles authentication and privacy.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param cache The cache that has been created by calling <CODE>createSecurityCache</CODE> on this model.
     * @param version The SNMP protocol version.
     * @param msgID The current request id.
     * @param msgMaxSize The message max size.
     * @param msgFlags The message flags (reportable, Auth and Priv)
     * @param msgSecurityModel This current security model.
     * @param params The security parameters in a marshalled format. The informations cointained in this array are model dependant.
     * @param contextEngineID The context engine ID or null if encrypted.
     * @param contextName The context name or null if encrypted.
     * @param data The marshalled varbind list or null if encrypted
     * @param encryptedPdu The encrypted pdu or null if not encrypted.
     * @param decryptedPdu The decrypted pdu. If no decryption is to be done, the passed context engine ID, context name and data could be used to fill this object.
     * @return The security parameters.

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public SnmpSecurityParameters

    /**
     * Called when a request is received from the network. It handles authentication and privacy.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param cache The cache that has been created by calling <CODE>createSecurityCache</CODE> on this model.
     * @param version The SNMP protocol version.
     * @param msgID The current request id.
     * @param msgMaxSize The message max size.
     * @param msgFlags The message flags (reportable, Auth and Priv)
     * @param msgSecurityModel This current security model.
     * @param params The security parameters in a marshalled format. The informations contained in this array are model dependant.
     * @param contextEngineID The context engine ID or null if encrypted.
     * @param contextName The context name or null if encrypted.
     * @param data The marshalled varbind list or null if encrypted
     * @param encryptedPdu The encrypted pdu or null if not encrypted.
     * @param decryptedPdu The decrypted pdu. If no decryption is to be done, the passed context engine ID, context name and data could be used to fill this object.
     * @return The decoded security parameters.

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public int generateResponseMsg(SnmpSecurityCache cache,
                                   int version,
                                   int msgID,
                                   int msgMaxSize,
                                   byte msgFlags,
                                   int msgSecurityModel,
                                   SnmpSecurityParameters params,
                                   byte[] contextEngineID,
                                   byte[] contextName,
                                   byte[] data,
                                   int dataLength,
                                   byte[] outputBytes)

    /**
     * Called when a response is to be sent to the network. It must be securized.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param cache The cache that has been created by calling <CODE>createSecurityCache</CODE> on this model.
     * @param version The SNMP protocol version.
     * @param msgID The current request id.
     * @param msgMaxSize The message max size.
     * @param msgFlags The message flags (reportable, Auth and Priv)
     * @param msgSecurityModel This current security model.
     * @param params The security parameters that contain the model dependant parameters.
     * @param contextEngineID The context engine ID.
     * @param contextName The context name.
     * @param data The marshalled varbind list.
     * @param dataLength The marshalled varbind list length.
     * @param outputBytes The buffer to fill with securized request. This is a representation independant marshalled format. This buffer will be sent to the network.
     * @return The marshalled byte number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
public interface SnmpSecurityModel extends SnmpModel {

/**
 * Security model interface. Any security model implementation must implement this interface in order to be integrated in the engine framework. Security models are called when SNMP messages are received or sent. They deal with security (authentication and privacy).
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public SnmpSecurityCache createSecurityCache();

    /**
     * Instantiate an <CODE>SnmpSecurityCache</CODE> that is dependant to the model implementation.
     * @return The model dependant security cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public SnmpSecurityParameters processIncomingResponse(SnmpSecurityCache cache,
                                                          int version,
                                                          int msgID,
                                                          int msgMaxSize,
                                                          byte msgFlags,
                                                          int msgSecurityModel,
                                                          byte[] params,
                                                          byte[] contextEngineID,
                                                          byte[] contextName,
                                                          byte[] data,
                                                          byte[] encryptedPdu,
                                                          SnmpDecryptedPdu decryptedPdu)

 /**
     * Called when a response is received from the network. It handles authentication and privacy.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param cache The cache that has been created by calling <CODE>createSecurityCache</CODE> on this model.
     * @param version The SNMP protocol version.
     * @param msgID The current request id.
     * @param msgMaxSize The message max size.
     * @param msgFlags The message flags (reportable, Auth and Priv)
     * @param msgSecurityModel This current security model.
     * @param params The security parameters in a marshalled format. The informations cointained in this array are model dependant.
     * @param contextEngineID The context engine ID or null if encrypted.
     * @param contextName The context name or null if encrypted.
     * @param data The marshalled varbind list or null if encrypted
     * @param encryptedPdu The encrypted pdu or null if not encrypted.
     * @param decryptedPdu The decrypted pdu. If no decryption is to be done, the passed context engine ID, context name and data could be used to fill this object.
     * @return The security parameters.

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public SnmpSecurityParameters

    /**
     * Called when a request is received from the network. It handles authentication and privacy.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param cache The cache that has been created by calling <CODE>createSecurityCache</CODE> on this model.
     * @param version The SNMP protocol version.
     * @param msgID The current request id.
     * @param msgMaxSize The message max size.
     * @param msgFlags The message flags (reportable, Auth and Priv)
     * @param msgSecurityModel This current security model.
     * @param params The security parameters in a marshalled format. The informations contained in this array are model dependant.
     * @param contextEngineID The context engine ID or null if encrypted.
     * @param contextName The context name or null if encrypted.
     * @param data The marshalled varbind list or null if encrypted
     * @param encryptedPdu The encrypted pdu or null if not encrypted.
     * @param decryptedPdu The decrypted pdu. If no decryption is to be done, the passed context engine ID, context name and data could be used to fill this object.
     * @return The decoded security parameters.

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
    public int generateResponseMsg(SnmpSecurityCache cache,
                                   int version,
                                   int msgID,
                                   int msgMaxSize,
                                   byte msgFlags,
                                   int msgSecurityModel,
                                   SnmpSecurityParameters params,
                                   byte[] contextEngineID,
                                   byte[] contextName,
                                   byte[] data,
                                   int dataLength,
                                   byte[] outputBytes)

    /**
     * Called when a response is to be sent to the network. It must be securized.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param cache The cache that has been created by calling <CODE>createSecurityCache</CODE> on this model.
     * @param version The SNMP protocol version.
     * @param msgID The current request id.
     * @param msgMaxSize The message max size.
     * @param msgFlags The message flags (reportable, Auth and Priv)
     * @param msgSecurityModel This current security model.
     * @param params The security parameters that contain the model dependant parameters.
     * @param contextEngineID The context engine ID.
     * @param contextName The context name.
     * @param data The marshalled varbind list.
     * @param dataLength The marshalled varbind list length.
     * @param outputBytes The buffer to fill with securized request. This is a representation independant marshalled format. This buffer will be sent to the network.
     * @return The marshalled byte number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpSecurityModel.java
public interface SnmpSecurityModel extends SnmpModel {

/**
 * Security model interface. Any security model implementation must implement this interface in order to be integrated in the engine framework. Security models are called when SNMP messages are received or sent. They deal with security (authentication and privacy).
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
