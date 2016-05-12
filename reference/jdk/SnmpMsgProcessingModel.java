_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpMsgTranslator getMsgTranslator();

    /**
     * Returns the current translator.
     * @return The current translator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public void setMsgTranslator(SnmpMsgTranslator translator);

    /**
     * In order to change the behavior of the translator, set it.
     * @param translator The translator that will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public int encode(SnmpDecryptedPdu pdu,
                      byte[] outputBytes) throws SnmpTooBigException;

    /**
     * This method returns an encoded scoped pdu. This method encode only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> for decryption.
     * @param pdu The pdu to encode.
     * @param outputBytes The partialy scoped pdu.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpDecryptedPdu decode(byte[] pdu) throws SnmpStatusException;

     /**
     * This method returns a decoded scoped pdu. This method decodes only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> after decryption.
     * @param pdu The encoded pdu.
     * @return The partialy scoped pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public int encode(int version,
                      int msgID,
                      int msgMaxSize,
                      byte msgFlags,
                      int msgSecurityModel,
                      SnmpSecurityParameters params,
                      byte[] contextEngineID,
                      byte[] contextName,
                      byte[] data,
                      int dataLength,
                      byte[] outputBytes) throws SnmpTooBigException;

    /**
     * This method is called to encode a full scoped pdu that has not been encrypted. <CODE>contextName</CODE>, <CODE>contextEngineID</CODE> and data are known.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param version The SNMP protocol version.
     * @param msgID The SNMP message ID.
     * @param msgMaxSize The max message size.
     * @param msgFlags The message flags.
     * @param msgSecurityModel The message security model.
     * @param params The security parameters.
     * @param contextEngineID The context engine ID.
     * @param contextName The context name.
     * @param data The encoded data.
     * @param dataLength The encoded data length.
     * @param outputBytes The buffer containing the encoded message.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpIncomingResponse getIncomingResponse(SnmpPduFactory factory);

     /**
     * This method is called when a response is received from the network.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the receiving (mainly unmarshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpIncomingRequest getIncomingRequest(SnmpPduFactory factory);

    /**
     * This method is called when a call is received from the network.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the receiving (mainly unmarshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
public interface SnmpMsgProcessingModel extends SnmpModel {

/**
 * The message processing model interface. Any message processing model must implement this interface in order to be integrated in the engine framework.
 * The model is called by the dispatcher when a call is received or when a call is sent.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpMsgTranslator getMsgTranslator();

    /**
     * Returns the current translator.
     * @return The current translator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public void setMsgTranslator(SnmpMsgTranslator translator);

    /**
     * In order to change the behavior of the translator, set it.
     * @param translator The translator that will be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public int encode(SnmpDecryptedPdu pdu,
                      byte[] outputBytes) throws SnmpTooBigException;

    /**
     * This method returns an encoded scoped pdu. This method encode only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> for decryption.
     * @param pdu The pdu to encode.
     * @param outputBytes The partialy scoped pdu.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpDecryptedPdu decode(byte[] pdu) throws SnmpStatusException;

     /**
     * This method returns a decoded scoped pdu. This method decodes only the <CODE>contextEngineID</CODE>, <CODE>contextName</CODE> and data. It is needed by the <CODE>SnmpSecurityModel</CODE> after decryption.
     * @param pdu The encoded pdu.
     * @return The partialy scoped pdu.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public int encode(int version,
                      int msgID,
                      int msgMaxSize,
                      byte msgFlags,
                      int msgSecurityModel,
                      SnmpSecurityParameters params,
                      byte[] contextEngineID,
                      byte[] contextName,
                      byte[] data,
                      int dataLength,
                      byte[] outputBytes) throws SnmpTooBigException;

    /**
     * This method is called to encode a full scoped pdu that has not been encrypted. <CODE>contextName</CODE>, <CODE>contextEngineID</CODE> and data are known.
     * <BR>The specified parameters are defined in RFC 2572 (see also the {@link com.sun.jmx.snmp.SnmpV3Message} class).
     * @param version The SNMP protocol version.
     * @param msgID The SNMP message ID.
     * @param msgMaxSize The max message size.
     * @param msgFlags The message flags.
     * @param msgSecurityModel The message security model.
     * @param params The security parameters.
     * @param contextEngineID The context engine ID.
     * @param contextName The context name.
     * @param data The encoded data.
     * @param dataLength The encoded data length.
     * @param outputBytes The buffer containing the encoded message.
     * @return The encoded bytes number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpIncomingResponse getIncomingResponse(SnmpPduFactory factory);

     /**
     * This method is called when a response is received from the network.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the receiving (mainly unmarshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
    public SnmpIncomingRequest getIncomingRequest(SnmpPduFactory factory);

    /**
     * This method is called when a call is received from the network.
     * @param factory The pdu factory to use to encode and decode pdu.
     * @return The object that will handle every steps of the receiving (mainly unmarshalling and security).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpMsgProcessingModel.java
public interface SnmpMsgProcessingModel extends SnmpModel {

/**
 * The message processing model interface. Any message processing model must implement this interface in order to be integrated in the engine framework.
 * The model is called by the dispatcher when a call is received or when a call is sent.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
