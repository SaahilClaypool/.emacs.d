_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public String printMessage();

    /**
     * Returns a stringified form of the message to send.
     * @return The message state string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public int getRequestId(byte[] data) throws SnmpStatusException;

    /**
     * Returns the response request Id.
     * @param data The flat message.
     * @return The request Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public SnmpPdu decodeSnmpPdu()

    /**
     * Gets the request PDU encoded in the received response.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public SnmpMsg decodeMessage(byte[] inputBytes,
                                 int byteCount,
                                 InetAddress address,
                                 int port)

    /**
     * Decodes the specified bytes and initializes itself with the received
     * response.
     *
     * @param inputBytes The bytes to be decoded.
     *
     * @exception SnmpStatusException If the specified bytes are not a valid encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public byte[] getContextName();

    /**
     * Gets the incoming response context name.
     * @return The context name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public int getSecurityLevel();

    /**
     * Gets the incoming response security level. This level is defined in
     * {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}.
     * @return The security level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public SnmpSecurityParameters getSecurityParameters();

    /**
     * Gets the incoming response security parameters.
     * @return The security parameters.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public int getPort();

    /**
     * Returns the source port.
     * @return The source port.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
public interface SnmpIncomingResponse {

/**
 * <P> An <CODE>SnmpIncomingResponse</CODE> handles the unmarshalling of the received response.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public String printMessage();

    /**
     * Returns a stringified form of the message to send.
     * @return The message state string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public int getRequestId(byte[] data) throws SnmpStatusException;

    /**
     * Returns the response request Id.
     * @param data The flat message.
     * @return The request Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public SnmpPdu decodeSnmpPdu()

    /**
     * Gets the request PDU encoded in the received response.
     * <P>
     * This method decodes the data field and returns the resulting PDU.
     *
     * @return The resulting PDU.
     * @exception SnmpStatusException If the encoding is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public SnmpMsg decodeMessage(byte[] inputBytes,
                                 int byteCount,
                                 InetAddress address,
                                 int port)

    /**
     * Decodes the specified bytes and initializes itself with the received
     * response.
     *
     * @param inputBytes The bytes to be decoded.
     *
     * @exception SnmpStatusException If the specified bytes are not a valid encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public byte[] getContextName();

    /**
     * Gets the incoming response context name.
     * @return The context name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public int getSecurityLevel();

    /**
     * Gets the incoming response security level. This level is defined in
     * {@link com.sun.jmx.snmp.SnmpEngine SnmpEngine}.
     * @return The security level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public SnmpSecurityParameters getSecurityParameters();

    /**
     * Gets the incoming response security parameters.
     * @return The security parameters.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
    public int getPort();

    /**
     * Returns the source port.
     * @return The source port.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpIncomingResponse.java
public interface SnmpIncomingResponse {

/**
 * <P> An <CODE>SnmpIncomingResponse</CODE> handles the unmarshalling of the received response.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
