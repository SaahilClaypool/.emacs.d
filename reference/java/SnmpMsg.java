_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    SnmpValue decodeVarBindValue(BerDecoder bdec)

    /**
     * For SNMP Runtime private use only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public SnmpVarBind[] decodeVarBindList(BerDecoder bdec)

    /**
     * For SNMP Runtime private use only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    void encodeVarBindValue(BerEncoder benc,
                            SnmpValue v)throws SnmpStatusException {

    /**
     * For SNMP Runtime private use only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public void encodeVarBindList(BerEncoder benc,
                                  SnmpVarBind[] varBindList)

    /**
     * For SNMP Runtime private use only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public String printMessage() {

    /**
     * Dumps this message in a string.
     *
     * @return The string containing the dump.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public static String dumpHexBuffer(byte [] b, int offset, int len) {

    /**
     * Dumps the content of a byte buffer using hexadecimal form.
     *
     * @param b The buffer to dump.
     * @param offset The position of the first byte to be dumped.
     * @param len The number of bytes to be dumped starting from offset.
     *
     * @return The string containing the dump.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public abstract SnmpPdu decodeSnmpPdu()

    /**
     * Gets the PDU encoded in this message.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public abstract void encodeSnmpPdu(SnmpPdu pdu, int maxDataLength)

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
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public abstract void decodeMessage(byte[] inputBytes, int byteCount)

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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public abstract int encodeMessage(byte[] outputBytes)

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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public abstract int getRequestId(byte[] data) throws SnmpStatusException;

    /**
     * Returns the associated request ID.
     * @param data The flat message.
     * @return The request ID.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public static int getProtocolVersion(byte[] data)

    /**
     * Returns the encoded SNMP version present in the passed byte array.
     * @param data The unmarshalled SNMP message.
     * @return The SNMP version (0, 1 or 3).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public SnmpSecurityParameters securityParameters = null;

    /**
     * Security parameters. Contain informations according to Security Model (Usm, community string based, ...).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public int port = 0;

    /**
     * Source or destination port.
     * <BR>For an incoming message it's the source.
     * For an outgoing message it's the destination.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public InetAddress address = null;

    /**
     * Source or destination address.
     * <BR>For an incoming message it's the source.
     * For an outgoing message it's the destination.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public int dataLength = 0;

    /**
     * Number of useful bytes in the <CODE>data</CODE> field.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public byte[] data = null;

    /**
     * Encoding of the PDU.
     * <P>This is usually the BER encoding of the PDU's syntax
     * defined in RFC1157 and RFC1902. However, this can be authenticated
     * or encrypted data (but you need to implemented your own
     * <CODE>SnmpPduFactory</CODE> class).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
    public int version = 0;

    /**
     * The protocol version.
     * <P><CODE>decodeMessage</CODE> and <CODE>encodeMessage</CODE> do not
     * perform any check on this value.
     * <BR><CODE>decodeSnmpPdu</CODE> and <CODE>encodeSnmpPdu</CODE> only
     * accept  the values 0 (for SNMPv1), 1 (for SNMPv2) and 3 (for SNMPv3).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpMsg.java
public abstract class SnmpMsg implements SnmpDefinitions {

/**
 * A partially decoded representation of an SNMP packet. It contains
 * the information contained in any SNMP message (SNMPv1, SNMPv2 or
 * SNMPv3).
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
