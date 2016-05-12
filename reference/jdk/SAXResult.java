_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    private String systemId;

    /**
     * The systemID that may be used in association
     * with the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    private LexicalHandler lexhandler;

    /**
     * The handler for lexical events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    private ContentHandler handler;

    /**
     * The handler for parse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    // Internal state.

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public String getSystemId() {

    /**
     * Get the system identifier that was set with setSystemId.
     *
     * @return The system identifier that was set with setSystemId, or null
     * if setSystemId was not called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public void setSystemId(String systemId) {

    /**
     * Method setSystemId Set the systemID that may be used in association
     * with the {@link org.xml.sax.ContentHandler}.
     *
     * @param systemId The system identifier as a URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public LexicalHandler getLexicalHandler() {

    /**
     * Get a SAX2 {@link org.xml.sax.ext.LexicalHandler} for the output.
     *
     * @return A <code>LexicalHandler</code>, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public void setLexicalHandler(LexicalHandler handler) {

    /**
     * Set the SAX2 {@link org.xml.sax.ext.LexicalHandler} for the output.
     *
     * <p>This is needed to handle XML comments and the like.  If the
     * lexical handler is not set, an attempt should be made by the
     * transformer to cast the {@link org.xml.sax.ContentHandler} to a
     * <code>LexicalHandler</code>.</p>
     *
     * @param handler A non-null <code>LexicalHandler</code> for
     * handling lexical parse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public ContentHandler getHandler() {

    /**
     * Get the {@link org.xml.sax.ContentHandler} that is the Result.
     *
     * @return The ContentHandler that is to be transformation output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public void setHandler(ContentHandler handler) {

    /**
     * Set the target to be a SAX2 {@link org.xml.sax.ContentHandler}.
     *
     * @param handler Must be a non-null ContentHandler reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public SAXResult(ContentHandler handler) {

    /**
     * Create a SAXResult that targets a SAX2 {@link org.xml.sax.ContentHandler}.
     *
     * @param handler Must be a non-null ContentHandler reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public SAXResult() {

    /**
     * Zero-argument default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
    public static final String FEATURE =

    /**
     * If {@link javax.xml.transform.TransformerFactory#getFeature}
     * returns true when passed this value as an argument,
     * the Transformer supports Result output of this type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/transform/sax/SAXResult.java
public class SAXResult implements Result {

/**
 * <p>Acts as an holder for a transformation Result.</p>
 *
 * @author <a href="Jeff.Suttor@Sun.com">Jeff Suttor</a>
 */
