_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public int encode(int version,
                      SnmpDecryptedPdu pdu,
                      byte[] outputBytes)

      /**
     * This method returns an encoded scoped pdu. This method encodes only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> for decryption. It will be routed to the dedicated model according to the version value.
     * @param version The SNMP protocol version.
     * @param pdu The pdu to encode.
     * @param outputBytes The partialy scoped pdu.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpDecryptedPdu decode(int version,
                                   byte[] pdu)

     /**
     * This method returns a decoded scoped pdu. This method decodes only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> after decryption. It will be routed to the dedicated model according to the version value.
     * @param version The SNMP protocol version.
     * @param pdu The encoded pdu.
     * @return the partialy scoped pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public int encodePriv(int version,
                          int msgID,
                          int msgMaxSize,
                          byte msgFlags,
                          int msgSecurityModel,
                          SnmpSecurityParameters params,
                          byte[] encryptedPdu,
                          byte[] outputBytes) throws SnmpTooBigException, SnmpUnknownMsgProcModelException;

    /**
     * This method is called to encode a full scoped pdu that as been encrypted. <CODE>contextName</CODE>, <CODE>contextEngineID</CODE> and data are not known. It will be routed to the dedicated model according to the version value.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param version The SNMP protocol version.
     * @param msgID The SNMP message ID.
     * @param msgMaxSize The max message size.
     * @param msgFlags The message flags.
     * @param msgSecurityModel The message security model.
     * @param params The security parameters.
     * @param encryptedPdu The encrypted pdu.
     * @param outputBytes The buffer containing the encoded message.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpIncomingResponse getIncomingResponse(int model,
                                                    SnmpPduFactory factory) throws SnmpUnknownMsgProcModelException;

     /**
     * This method is called when a call is received from the network. The sub system routes the call to the dedicated model according to the model ID.
     * @param model The model ID.
     * @param factory The pdu factory to use to decode pdu.
     * @return The object that will handle every steps of the receiving (mainly marshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpOutgoingRequest getOutgoingRequest(int model,
                                                  SnmpPduFactory factory) throws SnmpUnknownMsgProcModelException ;

    /**
     * This method is called when a call is to be sent to the network. The sub system routes the call to the dedicated model according to the model ID.
     * @param model The model ID.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the sending (mainly marshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpIncomingRequest getIncomingRequest(int model,
                                                  SnmpPduFactory factory)

    /**
     * This method is called when a call is received from the network.
     * @param model The model ID.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the receiving (mainly unmarshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public void setSecuritySubSystem(SnmpSecuritySubSystem security);

    /**
     * Attaches the security sub system to this sub system. Message processing model are making usage of various security sub systems. This direct attachement avoid the need of accessing the engine to retrieve the Security sub system.
     * @param security The security sub system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
public interface SnmpMsgProcessingSubSystem extends SnmpSubSystem {

/**
 * Message processing sub system interface. To allow engine integration, a message processing sub system must implement this interface. This sub system is called by the dispatcher when receiving or sending calls.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public int encode(int version,
                      SnmpDecryptedPdu pdu,
                      byte[] outputBytes)

      /**
     * This method returns an encoded scoped pdu. This method encodes only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> for decryption. It will be routed to the dedicated model according to the version value.
     * @param version The SNMP protocol version.
     * @param pdu The pdu to encode.
     * @param outputBytes The partialy scoped pdu.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpDecryptedPdu decode(int version,
                                   byte[] pdu)

     /**
     * This method returns a decoded scoped pdu. This method decodes only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> after decryption. It will be routed to the dedicated model according to the version value.
     * @param version The SNMP protocol version.
     * @param pdu The encoded pdu.
     * @return the partialy scoped pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public int encodePriv(int version,
                          int msgID,
                          int msgMaxSize,
                          byte msgFlags,
                          int msgSecurityModel,
                          SnmpSecurityParameters params,
                          byte[] encryptedPdu,
                          byte[] outputBytes) throws SnmpTooBigException, SnmpUnknownMsgProcModelException;

    /**
     * This method is called to encode a full scoped pdu that as been encrypted. <CODE>contextName</CODE>, <CODE>contextEngineID</CODE> and data are not known. It will be routed to the dedicated model according to the version value.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param version The SNMP protocol version.
     * @param msgID The SNMP message ID.
     * @param msgMaxSize The max message size.
     * @param msgFlags The message flags.
     * @param msgSecurityModel The message security model.
     * @param params The security parameters.
     * @param encryptedPdu The encrypted pdu.
     * @param outputBytes The buffer containing the encoded message.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpIncomingResponse getIncomingResponse(int model,
                                                    SnmpPduFactory factory) throws SnmpUnknownMsgProcModelException;

     /**
     * This method is called when a call is received from the network. The sub system routes the call to the dedicated model according to the model ID.
     * @param model The model ID.
     * @param factory The pdu factory to use to decode pdu.
     * @return The object that will handle every steps of the receiving (mainly marshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpOutgoingRequest getOutgoingRequest(int model,
                                                  SnmpPduFactory factory) throws SnmpUnknownMsgProcModelException ;

    /**
     * This method is called when a call is to be sent to the network. The sub system routes the call to the dedicated model according to the model ID.
     * @param model The model ID.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the sending (mainly marshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public SnmpIncomingRequest getIncomingRequest(int model,
                                                  SnmpPduFactory factory)

    /**
     * This method is called when a call is received from the network.
     * @param model The model ID.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the receiving (mainly unmarshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
    public void setSecuritySubSystem(SnmpSecuritySubSystem security);

    /**
     * Attaches the security sub system to this sub system. Message processing model are making usage of various security sub systems. This direct attachement avoid the need of accessing the engine to retrieve the Security sub system.
     * @param security The security sub system.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingSubSystem.java
public interface SnmpMsgProcessingSubSystem extends SnmpSubSystem {

/**
 * Message processing sub system interface. To allow engine integration, a message processing sub system must implement this interface. This sub system is called by the dispatcher when receiving or sending calls.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
