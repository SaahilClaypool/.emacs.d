_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public String printMessage() {

    /**
     * Dumps this message in a string.
     *
     * @return The string containing the dump.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public SnmpPdu decodeSnmpPdu()

    /**
     * Gets the PDU encoded in this message.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public void encodeSnmpPdu(SnmpPdu p,
                              int maxDataLength)

    /**
     * Initializes this message with the specified <CODE>pdu</CODE>.
     * <P>
     * This method initializes the data field with an array of
     * <CODE>maxDataLength</CODE> bytes. It encodes the <CODE>pdu</CODE>.
     * The resulting encoding is stored in the data field
     * and the length of the encoding is stored in <CODE>dataLength</CODE>.
     * <p>
     * If the encoding length exceeds <CODE>maxDataLength</CODE>,
     * the method throws an exception.
     *
     * @param p The PDU to be encoded.
     * @param maxDataLength The maximum length permitted for the data field.
     *
     * @exception SnmpStatusException If the specified <CODE>pdu</CODE>
     *   is not valid.
     * @exception SnmpTooBigException If the resulting encoding does not fit
     * into <CODE>maxDataLength</CODE> bytes.
     * @exception ArrayIndexOutOfBoundsException If the encoding exceeds
     *    <CODE>maxDataLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int getRequestId(byte[] data) throws SnmpStatusException {

    /**
     * Returns the associated request Id.
     * @param data The flat message.
     * @return The request Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public void decodeMessage(byte[] inputBytes, int byteCount)

    /**
     * Decodes the specified bytes and initializes this message.
     * For internal use only.
     *
     * @param inputBytes The bytes to be decoded.
     *
     * @exception SnmpStatusException If the specified bytes are not a valid encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int encodeMessage(byte[] outputBytes)

    /**
     * Encodes this message and puts the result in the specified byte array.
     * For internal use only.
     *
     * @param outputBytes An array to receive the resulting encoding.
     *
     * @exception ArrayIndexOutOfBoundsException If the result does not fit
     *                                           into the specified array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public SnmpV3Message() {

    /**
     * Constructor.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public byte[] encryptedPdu = null;

    /** The encrypted form of the scoped pdu (Only relevant when dealing with privacy).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public byte[] contextEngineId = null;

    /**
     * The context engine Id in which the pdu must be handled (Generaly the local engine Id).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int msgSecurityModel = 0;

    /**
     * The security model the security sub system MUST use in order to deal with this pdu (eg: User based Security Model Id = 3).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int msgMaxSize = 0;

    /**
     * Message max size the pdu sender can deal with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int msgId = 0;

    /**
     * Message identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
public class SnmpV3Message extends SnmpMsg {

/**
 * Is a partially decoded representation of an SNMP V3 packet.
 * <P>
 * This class can be used when developing customized manager or agent.
 * <P>
 * The <CODE>SnmpV3Message</CODE> class is directly mapped onto the
 * message syntax defined in RFC 2572.
 * <BLOCKQUOTE>
 * <PRE>
 * SNMPv3Message ::= SEQUENCE {
 *          msgVersion INTEGER ( 0 .. 2147483647 ),
 *          -- administrative parameters
 *          msgGlobalData HeaderData,
 *          -- security model-specific parameters
 *          -- format defined by Security Model
 *          msgSecurityParameters OCTET STRING,
 *          msgData  ScopedPduData
 *      }
 *     HeaderData ::= SEQUENCE {
 *         msgID      INTEGER (0..2147483647),
 *         msgMaxSize INTEGER (484..2147483647),
 *
 *         msgFlags   OCTET STRING (SIZE(1)),
 *                    --  .... ...1   authFlag
 *                    --  .... ..1.   privFlag
 *                    --  .... .1..   reportableFlag
 *                    --              Please observe:
 *                    --  .... ..00   is OK, means noAuthNoPriv
 *                    --  .... ..01   is OK, means authNoPriv
 *                    --  .... ..10   reserved, must NOT be used.
 *                    --  .... ..11   is OK, means authPriv
 *
 *         msgSecurityModel INTEGER (1..2147483647)
 *     }
 * </BLOCKQUOTE>
 * </PRE>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public String printMessage() {

    /**
     * Dumps this message in a string.
     *
     * @return The string containing the dump.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public SnmpPdu decodeSnmpPdu()

    /**
     * Gets the PDU encoded in this message.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public void encodeSnmpPdu(SnmpPdu p,
                              int maxDataLength)

    /**
     * Initializes this message with the specified <CODE>pdu</CODE>.
     * <P>
     * This method initializes the data field with an array of
     * <CODE>maxDataLength</CODE> bytes. It encodes the <CODE>pdu</CODE>.
     * The resulting encoding is stored in the data field
     * and the length of the encoding is stored in <CODE>dataLength</CODE>.
     * <p>
     * If the encoding length exceeds <CODE>maxDataLength</CODE>,
     * the method throws an exception.
     *
     * @param p The PDU to be encoded.
     * @param maxDataLength The maximum length permitted for the data field.
     *
     * @exception SnmpStatusException If the specified <CODE>pdu</CODE>
     *   is not valid.
     * @exception SnmpTooBigException If the resulting encoding does not fit
     * into <CODE>maxDataLength</CODE> bytes.
     * @exception ArrayIndexOutOfBoundsException If the encoding exceeds
     *    <CODE>maxDataLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int getRequestId(byte[] data) throws SnmpStatusException {

    /**
     * Returns the associated request Id.
     * @param data The flat message.
     * @return The request Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public void decodeMessage(byte[] inputBytes, int byteCount)

    /**
     * Decodes the specified bytes and initializes this message.
     * For internal use only.
     *
     * @param inputBytes The bytes to be decoded.
     *
     * @exception SnmpStatusException If the specified bytes are not a valid encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int encodeMessage(byte[] outputBytes)

    /**
     * Encodes this message and puts the result in the specified byte array.
     * For internal use only.
     *
     * @param outputBytes An array to receive the resulting encoding.
     *
     * @exception ArrayIndexOutOfBoundsException If the result does not fit
     *                                           into the specified array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public SnmpV3Message() {

    /**
     * Constructor.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public byte[] encryptedPdu = null;

    /** The encrypted form of the scoped pdu (Only relevant when dealing with privacy).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public byte[] contextEngineId = null;

    /**
     * The context engine Id in which the pdu must be handled (Generaly the local engine Id).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int msgSecurityModel = 0;

    /**
     * The security model the security sub system MUST use in order to deal with this pdu (eg: User based Security Model Id = 3).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int msgMaxSize = 0;

    /**
     * Message max size the pdu sender can deal with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
    public int msgId = 0;

    /**
     * Message identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpV3Message.java
public class SnmpV3Message extends SnmpMsg {

/**
 * Is a partially decoded representation of an SNMP V3 packet.
 * <P>
 * This class can be used when developing customized manager or agent.
 * <P>
 * The <CODE>SnmpV3Message</CODE> class is directly mapped onto the
 * message syntax defined in RFC 2572.
 * <BLOCKQUOTE>
 * <PRE>
 * SNMPv3Message ::= SEQUENCE {
 *          msgVersion INTEGER ( 0 .. 2147483647 ),
 *          -- administrative parameters
 *          msgGlobalData HeaderData,
 *          -- security model-specific parameters
 *          -- format defined by Security Model
 *          msgSecurityParameters OCTET STRING,
 *          msgData  ScopedPduData
 *      }
 *     HeaderData ::= SEQUENCE {
 *         msgID      INTEGER (0..2147483647),
 *         msgMaxSize INTEGER (484..2147483647),
 *
 *         msgFlags   OCTET STRING (SIZE(1)),
 *                    --  .... ...1   authFlag
 *                    --  .... ..1.   privFlag
 *                    --  .... .1..   reportableFlag
 *                    --              Please observe:
 *                    --  .... ..00   is OK, means noAuthNoPriv
 *                    --  .... ..01   is OK, means authNoPriv
 *                    --  .... ..10   reserved, must NOT be used.
 *                    --  .... ..11   is OK, means authPriv
 *
 *         msgSecurityModel INTEGER (1..2147483647)
 *     }
 * </BLOCKQUOTE>
 * </PRE>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
