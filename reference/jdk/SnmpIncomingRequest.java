_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public String printRequestMessage();

    /**
     * Returns a stringified form of the received message.
     * @return The message state string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public SnmpPdu decodeSnmpPdu()

    /**
     * Gets the request PDU encoded in the received message.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public SnmpMsg encodeSnmpPdu(SnmpPdu p,
                                 int maxDataLength)

     /**
     * Initializes the response to send with the passed Pdu.
     * <P>
     * If the encoding length exceeds <CODE>maxDataLength</CODE>,
     * the method throws an exception.
     *
     * @param p The PDU to be encoded.
     * @param maxDataLength The maximum length permitted for the data field.
     *
     * @exception SnmpStatusException If the specified <CODE>pdu</CODE>
     *     is not valid.
     * @exception SnmpTooBigException If the resulting encoding does not fit
     * into <CODE>maxDataLength</CODE> bytes.
     * @exception ArrayIndexOutOfBoundsException If the encoding exceeds
     *   <CODE>maxDataLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public void decodeMessage(byte[] inputBytes,
                              int byteCount,
                              InetAddress address,
                              int port)

    /**
     * Decodes the specified bytes and initializes the request with the incoming message.
     *
     * @param inputBytes The bytes to be decoded.
     *
     * @exception SnmpStatusException If the specified bytes are not a valid encoding or if the security applied to this request failed and no report is to be sent (typically trap PDU).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public byte[] getAccessContext();

    /**
     * Gets the incoming request context name used by Access Control Model in order to allow or deny the access to OIDs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public byte[] getContextName();

    /**
     * Gets the incoming request context name.
     * @return The context name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public int getSecurityLevel();

    /**
     * Gets the incoming request security level. This level is defined in {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}.
     * @return The security level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public void noResponse();

    /**
     * Tells this request that no response will be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public boolean isReport();

     /**
     * Tests if a report is expected.
     * @return boolean indicating if a report is to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
public interface SnmpIncomingRequest {

/**
<P> An <CODE>SnmpIncomingRequest</CODE> handles both sides of an incoming SNMP request:
<ul>
<li> The request. Unmarshalling of the received message. </li>
<li> The response. Marshalling of the message to send. </li>
</ul>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public String printRequestMessage();

    /**
     * Returns a stringified form of the received message.
     * @return The message state string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public SnmpPdu decodeSnmpPdu()

    /**
     * Gets the request PDU encoded in the received message.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public SnmpMsg encodeSnmpPdu(SnmpPdu p,
                                 int maxDataLength)

     /**
     * Initializes the response to send with the passed Pdu.
     * <P>
     * If the encoding length exceeds <CODE>maxDataLength</CODE>,
     * the method throws an exception.
     *
     * @param p The PDU to be encoded.
     * @param maxDataLength The maximum length permitted for the data field.
     *
     * @exception SnmpStatusException If the specified <CODE>pdu</CODE>
     *     is not valid.
     * @exception SnmpTooBigException If the resulting encoding does not fit
     * into <CODE>maxDataLength</CODE> bytes.
     * @exception ArrayIndexOutOfBoundsException If the encoding exceeds
     *   <CODE>maxDataLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public void decodeMessage(byte[] inputBytes,
                              int byteCount,
                              InetAddress address,
                              int port)

    /**
     * Decodes the specified bytes and initializes the request with the incoming message.
     *
     * @param inputBytes The bytes to be decoded.
     *
     * @exception SnmpStatusException If the specified bytes are not a valid encoding or if the security applied to this request failed and no report is to be sent (typically trap PDU).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public byte[] getAccessContext();

    /**
     * Gets the incoming request context name used by Access Control Model in order to allow or deny the access to OIDs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public byte[] getContextName();

    /**
     * Gets the incoming request context name.
     * @return The context name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public int getSecurityLevel();

    /**
     * Gets the incoming request security level. This level is defined in {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}.
     * @return The security level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public void noResponse();

    /**
     * Tells this request that no response will be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
    public boolean isReport();

     /**
     * Tests if a report is expected.
     * @return boolean indicating if a report is to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingRequest.java
public interface SnmpIncomingRequest {

/**
<P> An <CODE>SnmpIncomingRequest</CODE> handles both sides of an incoming SNMP request:
<ul>
<li> The request. Unmarshalling of the received message. </li>
<li> The response. Marshalling of the message to send. </li>
</ul>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
