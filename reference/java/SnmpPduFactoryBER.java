_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduFactoryBER.java
    public SnmpMsg encodeSnmpPdu(SnmpPdu p, int maxDataLength)

    /**
     * Encodes the specified <CODE>SnmpPdu</CODE> and
     * returns the resulting <CODE>SnmpMsg</CODE>. If this
     * method returns null, the specified <CODE>SnmpPdu</CODE>
     * will be dropped and the current SNMP request will be
     * aborted.
     *
     * @param p The <CODE>SnmpPdu</CODE> to be encoded.
     * @param maxDataLength The size limit of the resulting encoding.
     * @return Null or a fully encoded <CODE>SnmpMsg</CODE>.
     * @exception SnmpStatusException If <CODE>pdu</CODE> contains
     *            illegal values and cannot be encoded.
     * @exception SnmpTooBigException If the resulting encoding does not
     *            fit into <CODE>maxPktSize</CODE> bytes.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduFactoryBER.java
    public SnmpPdu decodeSnmpPdu(SnmpMsg msg) throws SnmpStatusException {

   /**
     * Calls {@link com.sun.jmx.snmp.SnmpMsg#decodeSnmpPdu SnmpMsg.decodeSnmpPdu}
     * on the specified message and returns the resulting <CODE>SnmpPdu</CODE>.
     *
     * @param msg The SNMP message to be decoded.
     * @return The resulting SNMP PDU packet.
     * @exception SnmpStatusException If the encoding is invalid.
     *
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/SnmpPduFactoryBER.java
public class SnmpPduFactoryBER implements SnmpPduFactory, Serializable {

/**
 * Default implementation of the {@link com.sun.jmx.snmp.SnmpPduFactory SnmpPduFactory} interface.
 * <BR>It uses the BER (basic encoding rules) standardized encoding scheme associated with ASN.1.
 * <P>
 * This implementation of the <CODE>SnmpPduFactory</CODE> is very
 * basic: it simply calls encoding and decoding methods from
 * {@link com.sun.jmx.snmp.SnmpMsg}.
 * <BLOCKQUOTE>
 * <PRE>
 * public SnmpPdu decodeSnmpPdu(SnmpMsg msg)
 * throws SnmpStatusException {
 *   return msg.decodeSnmpPdu() ;
 * }
 *
 * public SnmpMsg encodeSnmpPdu(SnmpPdu pdu, int maxPktSize)
 * throws SnmpStatusException, SnmpTooBigException {
 *   SnmpMsg result = new SnmpMessage() ;       // for SNMP v1/v2
 * <I>or</I>
 *   SnmpMsg result = new SnmpV3Message() ;     // for SNMP v3
 *   result.encodeSnmpPdu(pdu, maxPktSize) ;
 *   return result ;
 * }
 * </PRE>
 * </BLOCKQUOTE>
 * To implement your own object, you can implement <CODE>SnmpPduFactory</CODE>
 * or extend <CODE>SnmpPduFactoryBER</CODE>.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
