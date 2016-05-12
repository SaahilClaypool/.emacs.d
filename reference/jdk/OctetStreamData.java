_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/OctetStreamData.java
    public String getMimeType() {

    /**
     * Returns the MIME type associated with the data object represented by this
     * <code>OctetStreamData</code>.
     *
     * @return the MIME type or <code>null</code> if not applicable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/OctetStreamData.java
    public String getURI() {

    /**
     * Returns the URI String identifying the data object represented by this
     * <code>OctetStreamData</code>.
     *
     * @return the URI String or <code>null</code> if not applicable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/OctetStreamData.java
    public InputStream getOctetStream() {

    /**
     * Returns the input stream of this <code>OctetStreamData</code>.
     *
     * @return the input stream of this <code>OctetStreamData</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/OctetStreamData.java
    public OctetStreamData(InputStream octetStream, String uri,
        String mimeType) {

    /**
     * Creates a new <code>OctetStreamData</code>.
     *
     * @param octetStream the input stream containing the octets
     * @param uri the URI String identifying the data object (may be
     *    <code>null</code>)
     * @param mimeType the MIME type associated with the data object (may be
     *    <code>null</code>)
     * @throws NullPointerException if <code>octetStream</code> is
     *    <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/OctetStreamData.java
    public OctetStreamData(InputStream octetStream) {

    /**
     * Creates a new <code>OctetStreamData</code>.
     *
     * @param octetStream the input stream containing the octets
     * @throws NullPointerException if <code>octetStream</code> is
     *    <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/OctetStreamData.java
public class OctetStreamData implements Data {

/**
 * A representation of a <code>Data</code> type containing an octet stream.
 *
 * @since 1.6
 */
