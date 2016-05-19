_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
    public String printMessage() {

    /**
     * Dumps this message in a string.
     *
     * @return The string containing the dump.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
    public SnmpPdu decodeSnmpPdu()

    /**
     * Gets the PDU encoded in this message.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
    public void encodeSnmpPdu(SnmpPdu pdu, int maxDataLength)

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
     * @param pdu The PDU to be encoded.
     * @param maxDataLength The maximum length permitted for the data field.
     *
     * @exception SnmpStatusException If the specified <CODE>pdu</CODE> is not valid.
     * @exception SnmpTooBigException If the resulting encoding does not fit
     * into <CODE>maxDataLength</CODE> bytes.
     * @exception ArrayIndexOutOfBoundsException If the encoding exceeds <CODE>maxDataLength</CODE>.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
    public int getRequestId(byte[] inputBytes) throws SnmpStatusException {

    /**
     * Returns the associated request ID.
     * @param inputBytes The flat message.
     * @return The request ID.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
    public int encodeMessage(byte[] outputBytes) throws SnmpTooBigException {

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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
    public byte[] community ;

    /**
     * Community name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMessage.java
public class SnmpMessage extends SnmpMsg implements SnmpDefinitions {

/**
 * Is a partially decoded representation of an SNMP packet.
 * <P>
 * You will not normally need to use this class unless you decide to
 * implement your own {@link com.sun.jmx.snmp.SnmpPduFactory SnmpPduFactory} object.
 * <P>
 * The <CODE>SnmpMessage</CODE> class is directly mapped onto the
 * <CODE>Message</CODE> syntax defined in RFC1157 and RFC1902.
 * <BLOCKQUOTE>
 * <PRE>
 * Message ::= SEQUENCE {
 *    version       INTEGER { version(1) }, -- for SNMPv2
 *    community     OCTET STRING,           -- community name
 *    data          ANY                     -- an SNMPv2 PDU
 * }
 * </PRE>
 * </BLOCKQUOTE>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see SnmpPduFactory
 * @see SnmpPduPacket
 *
 */
