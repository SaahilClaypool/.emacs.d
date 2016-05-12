_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    private Writer writer;

    /**
     * The character stream that is to be written to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    private OutputStream outputStream;

    /**
     * The byte stream that is to be written to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    private String systemId;

    /**
     * The systemID that may be used in association
     * with the byte or character stream, or, if neither is set, use
     * this value as a writeable URI (probably a file name).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    // Internal state.

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public String getSystemId() {

    /**
     * Get the system identifier that was set with setSystemId.
     *
     * @return The system identifier that was set with setSystemId, or null
     * if setSystemId was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public void setSystemId(File f) {

    /**
     * <p>Set the system ID from a <code>File</code> reference.</p>
     *
     *
     * @param f Must a non-null File reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public void setSystemId(String systemId) {

    /**
     * Set the systemID that may be used in association
     * with the byte or character stream, or, if neither is set, use
     * this value as a writeable URI (probably a file name).
     *
     * @param systemId The system identifier as a URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public Writer getWriter() {

    /**
     * Get the character stream that was set with setWriter.
     *
     * @return The character stream that was set with setWriter, or null
     * if setWriter or the Writer constructor was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public void setWriter(Writer writer) {

    /**
     * Set the writer that is to receive the result.  Normally,
     * a stream should be used rather than a writer, so that
     * the transformer may use instructions contained in the
     * transformation instructions to control the encoding.  However,
     * there are times when it is useful to write to a writer,
     * such as when using a StringWriter.
     *
     * @param writer  A valid Writer reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public OutputStream getOutputStream() {

    /**
     * Get the byte stream that was set with setOutputStream.
     *
     * @return The byte stream that was set with setOutputStream, or null
     * if setOutputStream or the ByteStream constructor was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public void setOutputStream(OutputStream outputStream) {

    /**
     * Set the ByteStream that is to be written to.  Normally,
     * a stream should be used rather than a reader, so that
     * the transformer may use instructions contained in the
     * transformation instructions to control the encoding.
     *
     * @param outputStream A valid OutputStream reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public StreamResult(File f) {

    /**
     * Construct a StreamResult from a File.
     *
     * @param f Must a non-null File reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public StreamResult(String systemId) {

    /**
     * Construct a StreamResult from a URL.
     *
     * @param systemId Must be a String that conforms to the URI syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public StreamResult(Writer writer) {

    /**
     * Construct a StreamResult from a character stream.  Normally,
     * a stream should be used rather than a reader, so that
     * the transformer may use instructions contained in the
     * transformation instructions to control the encoding.  However,
     * there are times when it is useful to write to a character
     * stream, such as when using a StringWriter.
     *
     * @param writer  A valid Writer reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public StreamResult(OutputStream outputStream) {

    /**
     * Construct a StreamResult from a byte stream.  Normally,
     * a stream should be used rather than a reader, so that
     * the transformer may use instructions contained in the
     * transformation instructions to control the encoding.
     *
     * @param outputStream A valid OutputStream reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public StreamResult() {

    /**
     * Zero-argument default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
    public static final String FEATURE =

    /** If {@link javax.xml.transform.TransformerFactory#getFeature}
     * returns true when passed this value as an argument,
     * the Transformer supports Result output of this type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/stream/StreamResult.java
public class StreamResult implements Result {

/**
 * <p>Acts as an holder for a transformation result,
 * which may be XML, plain Text, HTML, or some other form of markup.</p>
 *
 * @author <a href="Jeff.Suttor@Sun.com">Jeff Suttor</a>
 */
