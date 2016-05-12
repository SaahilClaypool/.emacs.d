_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public boolean equals(Object a) {

    /**
     * Tests <CODE>SnmpEngineId</CODE> instance equality. Two <CODE>SnmpEngineId</CODE> are equal if they have the same value.
     * @return <CODE>true</CODE> if the two <CODE>SnmpEngineId</CODE> are equals, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(InetAddress addr) {

    /**
     * Generates an engine Id based on an InetAddress. Handles IPv4 and IPv6
     * addresses. The creation algorithm uses the sun IANA number (42).
     * @param addr The IP address the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @since 1.5
     * @exception UnknownHostException if the provided
     *            <CODE>InetAddress</CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(int iana, InetAddress addr)

     /**
     * Generates an engine Id based on an InetAddress. Handles IPv4 and IPv6 addresses. The creation algorithm uses the passed IANA number.
     * @param iana Your enterprise IANA number.
     * @param addr The IP address the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @since 1.5
     * @exception UnknownHostException if the provided <CODE>InetAddress </CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(InetAddress addr,
                                              int port,
                                              int iana) {

    /**
     * Generates a unique engine Id. The engine Id unicity is based on the host IP address and port. The IP address is the passed one, it handles IPv4 and IPv6 hosts. The creation algorithm uses the passed IANA number.
     * @param addr The IP address the SNMPv3 Adaptor Server is listening to.
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @param iana Your enterprise IANA number.
     * @return The generated engine Id.
     * @exception UnknownHostException if the provided <CODE>InetAddress </CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(int port, int iana) throws UnknownHostException {

    /**
     * Generates a unique engine Id. The engine Id unicity is based on
     * the host IP address and port. The IP address is the localhost one.
     * The creation algorithm uses the passed IANA number.
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @param iana Your enterprise IANA number.
     * @exception UnknownHostException if the local host name used to calculate the id is unknown.
     * @return The generated engine Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(InetAddress address, int port)

    /**
     * Generates a unique engine Id. The engine Id unicity is based on
     * the host IP address and port. The IP address used is the passed
     * one. The creation algorithm uses the SUN Microsystems IANA
     * number (42).
     * @param address The IP address the SNMPv3 Adaptor Server is listening to.
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @exception UnknownHostException. if the provided address is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(int port)

    /**
     * Generates a unique engine Id. The engine Id unicity is based on
     * the host IP address and port. The IP address used is the
     * localhost one. The creation algorithm uses the SUN Microsystems IANA
     * number (42).
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @exception UnknownHostException if the local host name
     *            used to calculate the id is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(String str, String separator)

    /**
     * Idem { @link
     * com.sun.jmx.snmp.SnmpEngineId#createEngineId(java.lang.String) }
     * with the ability to provide your own separator. This allows IPv6
     * address format handling (eg: providing @ as separator).
     * @param str The string to parse.
     * @param separator the separator to use. If null is provided, the default
     * separator ":" is used.
     * @return The generated engine Id or null if the passed string is null.
     * @exception UnknownHostException if the host name contained in the
     * textual format is unknown.
     * @exception IllegalArgumentException when :
     * <ul>
     *  <li>octet string lower than 5 bytes.</li>
     *  <li>octet string greater than 32 bytes.</li>
     *  <li>octet string = all zeros.</li>
     *  <li>octet string = all 'ff'H.</li>
     *  <li>octet strings with very first bit = 0 and length != 12 octets</li>
     *  <li>An IPv6 address format is used in conjonction with the ":"
     *      separator</li>
     * </ul>
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(String str)

   /**
    * <P>Generates a unique engine Id. Hexadecimal strings as well as a textual description are supported. The textual format is as follow:
    * <BR>  &lt;address&gt;:&lt;port&gt;:&lt;IANA number&gt;</P>
    * <P>The allowed formats :</P>
    * <ul>
    * <li> &lt;address&gt;:&lt;port&gt;:&lt;IANA number&gt
    * <BR>   All these parameters are used to generate the Id. WARNING, this method is not compliant with IPv6 address format. Use { @link com.sun.jmx.snmp.SnmpEngineId#createEngineId(java.lang.String,java.lang.String) } instead.</li>
    * <li> &lt;address&gt;:&lt;port&gt;
    * <BR>   The IANA number will be the SUN Microsystems one (42). </li>
    * <li> address
    * <BR>   The port 161 will be used to generate the Id. IANA number will be the SUN Microsystems one (42). </li>
    * <li> :port
    * <BR>   The host to use is localhost. IANA number will be the SUN Microsystems one (42). </li>
    * <li> ::&lt;IANA number&gt &nbsp;&nbsp;&nbsp;
    * <BR>   The port 161 and localhost will be used to generate the Id. </li>
    * <li> :&lt;port&gt;:&lt;IANA number&gt;
    * <BR>   The host to use is localhost. </li>
    * <li> &lt;address&gt;::&lt;IANA number&gt
    * <BR>   The port 161 will be used to generate the Id. </li>
    * <li> :: &nbsp;&nbsp;&nbsp;
    * <BR>   The port 161, localhost and the SUN Microsystems IANA number will be used to generate the Id. </li>
    * </ul>
    * @exception UnknownHostException if the host name contained in the textual format is unknown.
    * @exception IllegalArgumentException when :
    * <ul>
    *  <li>octet string lower than 5 bytes.</li>
    *  <li>octet string greater than 32 bytes.</li>
    *  <li>octet string = all zeros.</li>
    *  <li>octet string = all 'ff'H.</li>
    *  <li>octet strings with very first bit = 0 and length != 12 octets</li>
    *  <li>An IPv6 address format is used in conjonction with the ":" separator</li>
    * </ul>
    * @param str The string to parse.
    * @return The generated engine Id or null if the passed string is null.
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public SnmpOid toOid() {

    /**
     * Translates an engine Id in an SnmpOid format. This is useful when dealing with USM MIB indexes.
     * The oid format is : <engine Id length>.<engine Id binary octet1>....<engine Id binary octetn - 1>.<engine Id binary octetn>
     * Eg: "0x8000002a05819dcb6e00001f96" ==> 13.128.0.0.42.5.129.157.203.110.0.0.31.150
     *
     * @return SnmpOid The oid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId() {

    /**
     * Generates an engine Id that is unique to the host the agent is running on. The engine Id unicity is system time based. The creation algorithm uses the SUN Microsystems IANA number (42).
     * @return The generated engine Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(byte[] arr) throws IllegalArgumentException {

    /**
     * Generates an engine Id based on the passed array.
     * @return The created engine Id or null if given arr is null or its length == 0;
     * @exception IllegalArgumentException when:
     * <ul>
     *  <li>octet string lower than 5 bytes.</li>
     *  <li>octet string greater than 32 bytes.</li>
     *  <li>octet string = all zeros.</li>
     *  <li>octet string = all 'ff'H.</li>
     *  <li>octet strings with very first bit = 0 and length != 12 octets</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    void setStringValue(String val) {

    /**
     * In order to store the string used to create the engineId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public byte[] getBytes() {

    /**
     * Returns a binary engine Id.
     * @return Binary value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public String toString() {

    /**
     * Returns a string format engine Id.
     * @return String format value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public String getReadableId() {

    /**
     * If a string of the format &lt;address&gt;:&lt;port&gt;:&lt;IANA number&gt; has been provided at creation time, this string is returned.
     * @return The Id as a readable string or null if not provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    SnmpEngineId(byte[] bin) {

    /**
     * New <CODE>SnmpEngineId</CODE> with a binary value. You can use <CODE> SnmpTools </CODE> to convert from hex string to binary format.
     * @param bin Binary value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    SnmpEngineId(String hexString) {

    /**
     * New <CODE>SnmpEngineId</CODE> with an hex string value. Can handle engine Id format &lt;host&gt:&lt;port&gt.
     * @param hexString Hexa string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
public class SnmpEngineId implements Serializable {

/**
 * This class is handling an <CODE>SnmpEngineId</CODE> data. It copes with binary as well as <CODE>String</CODE> representation of an engine Id. A string format engine is an hex string starting with 0x.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public boolean equals(Object a) {

    /**
     * Tests <CODE>SnmpEngineId</CODE> instance equality. Two <CODE>SnmpEngineId</CODE> are equal if they have the same value.
     * @return <CODE>true</CODE> if the two <CODE>SnmpEngineId</CODE> are equals, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(InetAddress addr) {

    /**
     * Generates an engine Id based on an InetAddress. Handles IPv4 and IPv6
     * addresses. The creation algorithm uses the sun IANA number (42).
     * @param addr The IP address the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @since 1.5
     * @exception UnknownHostException if the provided
     *            <CODE>InetAddress</CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(int iana, InetAddress addr)

     /**
     * Generates an engine Id based on an InetAddress. Handles IPv4 and IPv6 addresses. The creation algorithm uses the passed IANA number.
     * @param iana Your enterprise IANA number.
     * @param addr The IP address the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @since 1.5
     * @exception UnknownHostException if the provided <CODE>InetAddress </CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(InetAddress addr,
                                              int port,
                                              int iana) {

    /**
     * Generates a unique engine Id. The engine Id unicity is based on the host IP address and port. The IP address is the passed one, it handles IPv4 and IPv6 hosts. The creation algorithm uses the passed IANA number.
     * @param addr The IP address the SNMPv3 Adaptor Server is listening to.
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @param iana Your enterprise IANA number.
     * @return The generated engine Id.
     * @exception UnknownHostException if the provided <CODE>InetAddress </CODE> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(int port, int iana) throws UnknownHostException {

    /**
     * Generates a unique engine Id. The engine Id unicity is based on
     * the host IP address and port. The IP address is the localhost one.
     * The creation algorithm uses the passed IANA number.
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @param iana Your enterprise IANA number.
     * @exception UnknownHostException if the local host name used to calculate the id is unknown.
     * @return The generated engine Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(InetAddress address, int port)

    /**
     * Generates a unique engine Id. The engine Id unicity is based on
     * the host IP address and port. The IP address used is the passed
     * one. The creation algorithm uses the SUN Microsystems IANA
     * number (42).
     * @param address The IP address the SNMPv3 Adaptor Server is listening to.
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @exception UnknownHostException. if the provided address is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(int port)

    /**
     * Generates a unique engine Id. The engine Id unicity is based on
     * the host IP address and port. The IP address used is the
     * localhost one. The creation algorithm uses the SUN Microsystems IANA
     * number (42).
     * @param port The TCP/IP port the SNMPv3 Adaptor Server is listening to.
     * @return The generated engine Id.
     * @exception UnknownHostException if the local host name
     *            used to calculate the id is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(String str, String separator)

    /**
     * Idem { @link
     * com.sun.jmx.snmp.SnmpEngineId#createEngineId(java.lang.String) }
     * with the ability to provide your own separator. This allows IPv6
     * address format handling (eg: providing @ as separator).
     * @param str The string to parse.
     * @param separator the separator to use. If null is provided, the default
     * separator ":" is used.
     * @return The generated engine Id or null if the passed string is null.
     * @exception UnknownHostException if the host name contained in the
     * textual format is unknown.
     * @exception IllegalArgumentException when :
     * <ul>
     *  <li>octet string lower than 5 bytes.</li>
     *  <li>octet string greater than 32 bytes.</li>
     *  <li>octet string = all zeros.</li>
     *  <li>octet string = all 'ff'H.</li>
     *  <li>octet strings with very first bit = 0 and length != 12 octets</li>
     *  <li>An IPv6 address format is used in conjonction with the ":"
     *      separator</li>
     * </ul>
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(String str)

   /**
    * <P>Generates a unique engine Id. Hexadecimal strings as well as a textual description are supported. The textual format is as follow:
    * <BR>  &lt;address&gt;:&lt;port&gt;:&lt;IANA number&gt;</P>
    * <P>The allowed formats :</P>
    * <ul>
    * <li> &lt;address&gt;:&lt;port&gt;:&lt;IANA number&gt
    * <BR>   All these parameters are used to generate the Id. WARNING, this method is not compliant with IPv6 address format. Use { @link com.sun.jmx.snmp.SnmpEngineId#createEngineId(java.lang.String,java.lang.String) } instead.</li>
    * <li> &lt;address&gt;:&lt;port&gt;
    * <BR>   The IANA number will be the SUN Microsystems one (42). </li>
    * <li> address
    * <BR>   The port 161 will be used to generate the Id. IANA number will be the SUN Microsystems one (42). </li>
    * <li> :port
    * <BR>   The host to use is localhost. IANA number will be the SUN Microsystems one (42). </li>
    * <li> ::&lt;IANA number&gt &nbsp;&nbsp;&nbsp;
    * <BR>   The port 161 and localhost will be used to generate the Id. </li>
    * <li> :&lt;port&gt;:&lt;IANA number&gt;
    * <BR>   The host to use is localhost. </li>
    * <li> &lt;address&gt;::&lt;IANA number&gt
    * <BR>   The port 161 will be used to generate the Id. </li>
    * <li> :: &nbsp;&nbsp;&nbsp;
    * <BR>   The port 161, localhost and the SUN Microsystems IANA number will be used to generate the Id. </li>
    * </ul>
    * @exception UnknownHostException if the host name contained in the textual format is unknown.
    * @exception IllegalArgumentException when :
    * <ul>
    *  <li>octet string lower than 5 bytes.</li>
    *  <li>octet string greater than 32 bytes.</li>
    *  <li>octet string = all zeros.</li>
    *  <li>octet string = all 'ff'H.</li>
    *  <li>octet strings with very first bit = 0 and length != 12 octets</li>
    *  <li>An IPv6 address format is used in conjonction with the ":" separator</li>
    * </ul>
    * @param str The string to parse.
    * @return The generated engine Id or null if the passed string is null.
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public SnmpOid toOid() {

    /**
     * Translates an engine Id in an SnmpOid format. This is useful when dealing with USM MIB indexes.
     * The oid format is : <engine Id length>.<engine Id binary octet1>....<engine Id binary octetn - 1>.<engine Id binary octetn>
     * Eg: "0x8000002a05819dcb6e00001f96" ==> 13.128.0.0.42.5.129.157.203.110.0.0.31.150
     *
     * @return SnmpOid The oid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId() {

    /**
     * Generates an engine Id that is unique to the host the agent is running on. The engine Id unicity is system time based. The creation algorithm uses the SUN Microsystems IANA number (42).
     * @return The generated engine Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public static SnmpEngineId createEngineId(byte[] arr) throws IllegalArgumentException {

    /**
     * Generates an engine Id based on the passed array.
     * @return The created engine Id or null if given arr is null or its length == 0;
     * @exception IllegalArgumentException when:
     * <ul>
     *  <li>octet string lower than 5 bytes.</li>
     *  <li>octet string greater than 32 bytes.</li>
     *  <li>octet string = all zeros.</li>
     *  <li>octet string = all 'ff'H.</li>
     *  <li>octet strings with very first bit = 0 and length != 12 octets</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    void setStringValue(String val) {

    /**
     * In order to store the string used to create the engineId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public byte[] getBytes() {

    /**
     * Returns a binary engine Id.
     * @return Binary value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public String toString() {

    /**
     * Returns a string format engine Id.
     * @return String format value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    public String getReadableId() {

    /**
     * If a string of the format &lt;address&gt;:&lt;port&gt;:&lt;IANA number&gt; has been provided at creation time, this string is returned.
     * @return The Id as a readable string or null if not provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    SnmpEngineId(byte[] bin) {

    /**
     * New <CODE>SnmpEngineId</CODE> with a binary value. You can use <CODE> SnmpTools </CODE> to convert from hex string to binary format.
     * @param bin Binary value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
    SnmpEngineId(String hexString) {

    /**
     * New <CODE>SnmpEngineId</CODE> with an hex string value. Can handle engine Id format &lt;host&gt:&lt;port&gt.
     * @param hexString Hexa string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineId.java
public class SnmpEngineId implements Serializable {

/**
 * This class is handling an <CODE>SnmpEngineId</CODE> data. It copes with binary as well as <CODE>String</CODE> representation of an engine Id. A string format engine is an hex string starting with 0x.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
