_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    private Reader reader;

    /**
     * The character stream for this Source, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    private InputStream inputStream;

    /**
     * The byte stream for this Source, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    private String systemId;

    /**
     * The system identifier as a URL string, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    private String publicId;

    /**
     * The public identifier for this input source, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    // Internal state.

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public void setSystemId(File f) {

    /**
     * Set the system ID from a File reference.
     *
     * @param f Must a non-null File reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public String getSystemId() {

    /**
     * Get the system identifier that was set with setSystemId.
     *
     * @return The system identifier that was set with setSystemId, or null
     * if setSystemId was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public void setSystemId(String systemId) {

    /**
     * Set the system identifier for this Source.
     *
     * <p>The system identifier is optional if there is a byte stream
     * or a character stream, but it is still useful to provide one,
     * since the application can use it to resolve relative URIs
     * and can include it in error messages and warnings (the parser
     * will attempt to open a connection to the URI only if
     * there is no byte stream or character stream specified).</p>
     *
     * @param systemId The system identifier as a URL string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public String getPublicId() {

    /**
     * Get the public identifier that was set with setPublicId.
     *
     * @return The public identifier that was set with setPublicId, or null
     * if setPublicId was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public void setPublicId(String publicId) {

    /**
     * Set the public identifier for this Source.
     *
     * <p>The public identifier is always optional: if the application
     * writer includes one, it will be provided as part of the
     * location information.</p>
     *
     * @param publicId The public identifier as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public Reader getReader() {

    /**
     * Get the character stream that was set with setReader.
     *
     * @return The character stream that was set with setReader, or null
     * if setReader or the Reader constructor was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public void setReader(Reader reader) {

    /**
     * Set the input to be a character reader.  Normally,
     * a stream should be used rather than a reader, so that
     * the XML parser can resolve character encoding specified
     * by the XML declaration.  However, in many cases the encoding
     * of the input stream is already resolved, as in the case of
     * reading XML from a StringReader.
     *
     * @param reader A valid Reader reference to an XML CharacterStream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public InputStream getInputStream() {

    /**
     * Get the byte stream that was set with setByteStream.
     *
     * @return The byte stream that was set with setByteStream, or null
     * if setByteStream or the ByteStream constructor was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public void setInputStream(InputStream inputStream) {

    /**
     * Set the byte stream to be used as input.  Normally,
     * a stream should be used rather than a reader, so that
     * the XML parser can resolve character encoding specified
     * by the XML declaration.
     *
     * <p>If this Source object is used to process a stylesheet, normally
     * setSystemId should also be called, so that relative URL references
     * can be resolved.</p>
     *
     * @param inputStream A valid InputStream reference to an XML stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public StreamSource(File f) {

    /**
     * Construct a StreamSource from a File.
     *
     * @param f Must a non-null File reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public StreamSource(String systemId) {

    /**
     * Construct a StreamSource from a URL.
     *
     * @param systemId Must be a String that conforms to the URI syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public StreamSource(Reader reader, String systemId) {

    /**
     * Construct a StreamSource from a character reader.  Normally,
     * a stream should be used rather than a reader, so that
     * the XML parser may resolve character encoding specified
     * by the XML declaration.  However, in many cases the encoding
     * of the input stream is already resolved, as in the case of
     * reading XML from a StringReader.
     *
     * @param reader A valid Reader reference to an XML character stream.
     * @param systemId Must be a String that conforms to the URI syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public StreamSource(Reader reader) {

    /**
     * Construct a StreamSource from a character reader.  Normally,
     * a stream should be used rather than a reader, so that
     * the XML parser can resolve character encoding specified
     * by the XML declaration.  However, in many cases the encoding
     * of the input stream is already resolved, as in the case of
     * reading XML from a StringReader.
     *
     * @param reader A valid Reader reference to an XML character stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public StreamSource(InputStream inputStream, String systemId) {

    /**
     * Construct a StreamSource from a byte stream.  Normally,
     * a stream should be used rather than a reader, so that
     * the XML parser can resolve character encoding specified
     * by the XML declaration.
     *
     * <p>This constructor allows the systemID to be set in addition
     * to the input stream, which allows relative URIs
     * to be processed.</p>
     *
     * @param inputStream A valid InputStream reference to an XML stream.
     * @param systemId Must be a String that conforms to the URI syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public StreamSource(InputStream inputStream) {

    /**
     * Construct a StreamSource from a byte stream.  Normally,
     * a stream should be used rather than a reader, so
     * the XML parser can resolve character encoding specified
     * by the XML declaration.
     *
     * <p>If this constructor is used to process a stylesheet, normally
     * setSystemId should also be called, so that relative URI references
     * can be resolved.</p>
     *
     * @param inputStream A valid InputStream reference to an XML stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public StreamSource() { }

    /**
     * <p>Zero-argument default constructor.  If this constructor is used, and
     * no Stream source is set using
     * {@link #setInputStream(java.io.InputStream inputStream)} or
     * {@link #setReader(java.io.Reader reader)}, then the
     * <code>Transformer</code> will
     * create an empty source {@link java.io.InputStream} using
     * {@link java.io.InputStream#InputStream() new InputStream()}.</p>
     *
     * @see javax.xml.transform.Transformer#transform(Source xmlSource, Result outputTarget)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
    public static final String FEATURE =

    /** If {@link javax.xml.transform.TransformerFactory#getFeature}
     * returns true when passed this value as an argument,
     * the Transformer supports Source input of this type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamSource.java
public class StreamSource implements Source {

/**
 * <p>Acts as an holder for a transformation Source in the form
 * of a stream of XML markup.</p>
 *
 * <p><em>Note:</em> Due to their internal use of either a {@link Reader} or {@link InputStream} instance,
 * <code>StreamSource</code> instances may only be used once.</p>
 *
 * @author <a href="Jeff.Suttor@Sun.com">Jeff Suttor</a>
 */
