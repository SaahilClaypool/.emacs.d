_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public void setHTTPRequestProperty(String key, String value) {

    /**
     * Sets the value of the request property
     * associated with the given property name.
     *
     * @param key the name of the request property
     * @param value the value of the request property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public Iterator getHTTPRequestProperties() {

    /**
     * Returns an iterator for the request properties this
     * input source contains. Each object returned by the
     * iterator is an instance of <code>java.util.Map.Entry</code>
     * where each key and value are a pair of strings corresponding
     * to the name and value of a request property.
     *
     * @return an iterator for the request properties this
     * input source contains
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public String getHTTPRequestProperty(String key) {

    /**
     * Returns the value of the request property
     * associated with the given property name.
     *
     * @param key the name of the request property
     * @return the value of the request property or
     * <code>null</code> if this property has not
     * been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public void setFollowHTTPRedirects(boolean followRedirects) {

    /**
     * Sets the preference whether HTTP redirects should
     * be followed. By default HTTP redirects will be followed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public boolean getFollowHTTPRedirects() {

    /**
     * Returns the preference whether HTTP redirects should
     * be followed. By default HTTP redirects will be followed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(String publicId, String systemId,
            String baseSystemId, Reader charStream, String encoding) {

    /**
     * Constructs an input source from a character stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param charStream   The character stream.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(String publicId, String systemId,
            String baseSystemId, InputStream byteStream, String encoding) {

    /**
     * Constructs an input source from a byte stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param byteStream   The byte stream.
     * @param encoding     The encoding of the byte stream, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(XMLResourceIdentifier resourceIdentifier) {

    /**
     * Constructs an input source from a XMLResourceIdentifier
     * object, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param resourceIdentifier the XMLResourceIdentifier containing the information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(String publicId, String systemId, String baseSystemId) {

    /**
     * Constructs an input source from just the public and system
     * identifiers, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    protected Map fHTTPRequestProperties = new HashMap();

    /** HTTP request properties. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    protected boolean fFollowRedirects = true;

    /** Preference for whether HTTP redirects should be followed. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
public final class HTTPInputSource extends XMLInputSource {

/**
 * This class represents an input source for an XML resource
 * retrievable over HTTP. In addition to the properties
 * provided by an <code>XMLInputSource</code> an HTTP input
 * source also has HTTP request properties and a preference
 * whether HTTP redirects will be followed. Note that these
 * properties will only be used if reading this input source
 * will induce an HTTP connection.
 *
 * @author Michael Glavassevich, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public void setHTTPRequestProperty(String key, String value) {

    /**
     * Sets the value of the request property
     * associated with the given property name.
     *
     * @param key the name of the request property
     * @param value the value of the request property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public Iterator getHTTPRequestProperties() {

    /**
     * Returns an iterator for the request properties this
     * input source contains. Each object returned by the
     * iterator is an instance of <code>java.util.Map.Entry</code>
     * where each key and value are a pair of strings corresponding
     * to the name and value of a request property.
     *
     * @return an iterator for the request properties this
     * input source contains
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public String getHTTPRequestProperty(String key) {

    /**
     * Returns the value of the request property
     * associated with the given property name.
     *
     * @param key the name of the request property
     * @return the value of the request property or
     * <code>null</code> if this property has not
     * been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public void setFollowHTTPRedirects(boolean followRedirects) {

    /**
     * Sets the preference whether HTTP redirects should
     * be followed. By default HTTP redirects will be followed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public boolean getFollowHTTPRedirects() {

    /**
     * Returns the preference whether HTTP redirects should
     * be followed. By default HTTP redirects will be followed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(String publicId, String systemId,
            String baseSystemId, Reader charStream, String encoding) {

    /**
     * Constructs an input source from a character stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param charStream   The character stream.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(String publicId, String systemId,
            String baseSystemId, InputStream byteStream, String encoding) {

    /**
     * Constructs an input source from a byte stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param byteStream   The byte stream.
     * @param encoding     The encoding of the byte stream, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(XMLResourceIdentifier resourceIdentifier) {

    /**
     * Constructs an input source from a XMLResourceIdentifier
     * object, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param resourceIdentifier the XMLResourceIdentifier containing the information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    public HTTPInputSource(String publicId, String systemId, String baseSystemId) {

    /**
     * Constructs an input source from just the public and system
     * identifiers, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    protected Map fHTTPRequestProperties = new HashMap();

    /** HTTP request properties. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
    protected boolean fFollowRedirects = true;

    /** Preference for whether HTTP redirects should be followed. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/HTTPInputSource.java
public final class HTTPInputSource extends XMLInputSource {

/**
 * This class represents an input source for an XML resource
 * retrievable over HTTP. In addition to the properties
 * provided by an <code>XMLInputSource</code> an HTTP input
 * source also has HTTP request properties and a preference
 * whether HTTP redirects will be followed. Note that these
 * properties will only be used if reading this input source
 * will induce an HTTP connection.
 *
 * @author Michael Glavassevich, IBM
 *
 */
