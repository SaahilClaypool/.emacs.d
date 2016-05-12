_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
    public String printMessage();

    /**
     * Returns a stringified form of the message to send.
     * @return The message state string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
    public SnmpMsg encodeSnmpPdu(SnmpPdu p,
                                 int maxDataLength)

  /**
     * Initializes the message to send with the passed Pdu.
     * <P>
     * If the encoding length exceeds <CODE>maxDataLength</CODE>,
     * the method throws an exception.</P>
     *
     * @param p The PDU to be encoded.
     * @param maxDataLength The maximum length permitted for the data field.
     *
     * @exception SnmpStatusException If the specified PDU <CODE>p</CODE> is
     *    not valid.
     * @exception SnmpTooBigException If the resulting encoding does not fit
     *    into <CODE>maxDataLength</CODE> bytes.
     * @exception ArrayIndexOutOfBoundsException If the encoding exceeds
     *    <CODE>maxDataLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
    public int encodeMessage(byte[] outputBytes)

    /**
     * Encodes the message to send and puts the result in the specified byte array.
     *
     * @param outputBytes An array to receive the resulting encoding.
     *
     * @exception ArrayIndexOutOfBoundsException If the result does not fit
     *                                           into the specified array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
public interface SnmpOutgoingRequest {

/**
 * <P> An <CODE>SnmpOutgoingRequest</CODE> handles the marshalling of the message to send.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
    public String printMessage();

    /**
     * Returns a stringified form of the message to send.
     * @return The message state string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
    public SnmpMsg encodeSnmpPdu(SnmpPdu p,
                                 int maxDataLength)

  /**
     * Initializes the message to send with the passed Pdu.
     * <P>
     * If the encoding length exceeds <CODE>maxDataLength</CODE>,
     * the method throws an exception.</P>
     *
     * @param p The PDU to be encoded.
     * @param maxDataLength The maximum length permitted for the data field.
     *
     * @exception SnmpStatusException If the specified PDU <CODE>p</CODE> is
     *    not valid.
     * @exception SnmpTooBigException If the resulting encoding does not fit
     *    into <CODE>maxDataLength</CODE> bytes.
     * @exception ArrayIndexOutOfBoundsException If the encoding exceeds
     *    <CODE>maxDataLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
    public int encodeMessage(byte[] outputBytes)

    /**
     * Encodes the message to send and puts the result in the specified byte array.
     *
     * @param outputBytes An array to receive the resulting encoding.
     *
     * @exception ArrayIndexOutOfBoundsException If the result does not fit
     *                                           into the specified array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpOutgoingRequest.java
public interface SnmpOutgoingRequest {

/**
 * <P> An <CODE>SnmpOutgoingRequest</CODE> handles the marshalling of the message to send.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
