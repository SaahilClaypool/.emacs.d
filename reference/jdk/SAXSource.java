_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public static InputSource sourceToInputSource(Source source) {

    /**
     * Attempt to obtain a SAX InputSource object from a Source
     * object.
     *
     * @param source Must be a non-null Source reference.
     *
     * @return An InputSource, or null if Source can not be converted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    private InputSource inputSource;

    /**
     * <p>The SAX InputSource to be used for the source tree input.
     * Should not be <code>null</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    private XMLReader reader;

    /**
     * The XMLReader to be used for the source tree input. May be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public String getSystemId() {

    /**
     * <p>Get the base ID (URI or system ID) from where URIs
     * will be resolved.</p>
     *
     * @return Base URL for the <code>Source</code>, or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public void setSystemId(String systemId) {

    /**
     * Set the system identifier for this Source.  If an input source
     * has already been set, it will set the system ID or that
     * input source, otherwise it will create a new input source.
     *
     * <p>The system identifier is optional if there is a byte stream
     * or a character stream, but it is still useful to provide one,
     * since the application can use it to resolve relative URIs
     * and can include it in error messages and warnings (the parser
     * will attempt to open a connection to the URI only if
     * no byte stream or character stream is specified).</p>
     *
     * @param systemId The system identifier as a URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public InputSource getInputSource() {

    /**
     * Get the SAX InputSource to be used for the Source.
     *
     * @return A valid InputSource reference, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public void setInputSource(InputSource inputSource) {

    /**
     * Set the SAX InputSource to be used for the Source.
     *
     * @param inputSource A valid InputSource reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public XMLReader getXMLReader() {

    /**
     * Get the XMLReader to be used for the Source.
     *
     * @return A valid XMLReader or XMLFilter reference, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public void setXMLReader(XMLReader reader) {

    /**
     * Set the XMLReader to be used for the Source.
     *
     * @param reader A valid XMLReader or XMLFilter reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public SAXSource(InputSource inputSource) {

    /**
     * Create a <code>SAXSource</code>, using a SAX <code>InputSource</code>.
     * The {@link javax.xml.transform.Transformer} or
     * {@link javax.xml.transform.sax.SAXTransformerFactory} creates a
     * reader via {@link org.xml.sax.helpers.XMLReaderFactory}
     * (if setXMLReader is not used), sets itself as
     * the reader's {@link org.xml.sax.ContentHandler}, and calls
     * reader.parse(inputSource).
     *
     * @param inputSource An input source reference that must be non-null
     * and that will be passed to the parse method of the reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public SAXSource(XMLReader reader, InputSource inputSource) {

    /**
     * Create a <code>SAXSource</code>, using an {@link org.xml.sax.XMLReader}
     * and a SAX InputSource. The {@link javax.xml.transform.Transformer}
     * or {@link javax.xml.transform.sax.SAXTransformerFactory} will set itself
     * to be the reader's {@link org.xml.sax.ContentHandler}, and then will call
     * reader.parse(inputSource).
     *
     * @param reader An XMLReader to be used for the parse.
     * @param inputSource A SAX input source reference that must be non-null
     * and that will be passed to the reader parse method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public SAXSource() { }

    /**
     * <p>Zero-argument default constructor.  If this constructor is used, and
     * no SAX source is set using
     * {@link #setInputSource(InputSource inputSource)} , then the
     * <code>Transformer</code> will
     * create an empty source {@link org.xml.sax.InputSource} using
     * {@link org.xml.sax.InputSource#InputSource() new InputSource()}.</p>
     *
     * @see javax.xml.transform.Transformer#transform(Source xmlSource, Result outputTarget)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
    public static final String FEATURE =

    /**
     * If {@link javax.xml.transform.TransformerFactory#getFeature}
     * returns true when passed this value as an argument,
     * the Transformer supports Source input of this type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXSource.java
public class SAXSource implements Source {

/**
 * <p>Acts as an holder for SAX-style Source.</p>
 *
 * <p>Note that XSLT requires namespace support. Attempting to transform an
 * input source that is not
 * generated with a namespace-aware parser may result in errors.
 * Parsers can be made namespace aware by calling the
 * {@link javax.xml.parsers.SAXParserFactory#setNamespaceAware(boolean awareness)} method.</p>
 *
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 */
