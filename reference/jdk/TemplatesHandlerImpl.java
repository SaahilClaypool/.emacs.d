_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void setDocumentLocator(Locator locator) {

    /**
     * Set internal system Id and forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void skippedEntity(String name) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void ignorableWhitespace(char[] ch, int start, int length) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void processingInstruction(String name, String value) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void characters(char[] ch, int start, int length) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void endElement(String uri, String localname, String qname) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void startElement(String uri, String localname, String qname,
        Attributes attributes) throws SAXException

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void endPrefixMapping(String prefix) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void startPrefixMapping(String prefix, String uri) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void endDocument() throws SAXException {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void startDocument() {

    /**
     * Re-initialize parser and forward SAX2 event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public InputSource loadSource(String href, String context, XSLTC xsltc) {

    /**
     * This method implements XSLTC's SourceLoader interface. It is used to
     * glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes.
     *
     * @param href The URI of the document to load
     * @param context The URI of the currently loaded document
     * @param xsltc The compiler that resuests the document
     * @return An InputSource with the loaded document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public Templates getTemplates() {

    /**
     * Implements javax.xml.transform.sax.TemplatesHandler.getTemplates()
     * When a TemplatesHandler object is used as a ContentHandler or
     * DocumentHandler for the parsing of transformation instructions, it
     * creates a Templates object, which the caller can get once the SAX
     * events have been completed.
     * @return The Templates object that was created during the SAX event
     *         process, or null if no Templates object has been created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void setURIResolver(URIResolver resolver) {

    /**
     * Store URIResolver needed for Transformers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void setSystemId(String id) {

    /**
     * Implements javax.xml.transform.sax.TemplatesHandler.setSystemId()
     * Get the base ID (URI or system ID) from where relative URLs will be
     * resolved.
     * @param id Base URI for this stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public String getSystemId() {

    /**
     * Implements javax.xml.transform.sax.TemplatesHandler.getSystemId()
     * Get the base ID (URI or system ID) from where relative URLs will be
     * resolved.
     * @return The systemID that was set with setSystemId(String id)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    protected TemplatesHandlerImpl(int indentNumber,
        TransformerFactoryImpl tfactory)

    /**
     * Default constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private TemplatesImpl _templates = null;

    /**
     * The created Templates object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private Parser _parser = null;

    /**
     * A reference to XSLTC's parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private TransformerFactoryImpl _tfactory = null;

    /**
     * A reference to the transformer factory that this templates
     * object belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private URIResolver _uriResolver = null;

    /**
     * This URIResolver is passed to all Transformers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private int _indentNumber;

    /**
     * Number of spaces to add for output indentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private String _systemId;

    /**
     * System ID for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
public class TemplatesHandlerImpl

/**
 * Implementation of a JAXP1.1 TemplatesHandler
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void setDocumentLocator(Locator locator) {

    /**
     * Set internal system Id and forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void skippedEntity(String name) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void ignorableWhitespace(char[] ch, int start, int length) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void processingInstruction(String name, String value) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void characters(char[] ch, int start, int length) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void endElement(String uri, String localname, String qname) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void startElement(String uri, String localname, String qname,
        Attributes attributes) throws SAXException

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void endPrefixMapping(String prefix) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void startPrefixMapping(String prefix, String uri) {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void endDocument() throws SAXException {

    /**
     * Just forward SAX2 event to parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void startDocument() {

    /**
     * Re-initialize parser and forward SAX2 event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public InputSource loadSource(String href, String context, XSLTC xsltc) {

    /**
     * This method implements XSLTC's SourceLoader interface. It is used to
     * glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes.
     *
     * @param href The URI of the document to load
     * @param context The URI of the currently loaded document
     * @param xsltc The compiler that resuests the document
     * @return An InputSource with the loaded document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public Templates getTemplates() {

    /**
     * Implements javax.xml.transform.sax.TemplatesHandler.getTemplates()
     * When a TemplatesHandler object is used as a ContentHandler or
     * DocumentHandler for the parsing of transformation instructions, it
     * creates a Templates object, which the caller can get once the SAX
     * events have been completed.
     * @return The Templates object that was created during the SAX event
     *         process, or null if no Templates object has been created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void setURIResolver(URIResolver resolver) {

    /**
     * Store URIResolver needed for Transformers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public void setSystemId(String id) {

    /**
     * Implements javax.xml.transform.sax.TemplatesHandler.setSystemId()
     * Get the base ID (URI or system ID) from where relative URLs will be
     * resolved.
     * @param id Base URI for this stylesheet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    public String getSystemId() {

    /**
     * Implements javax.xml.transform.sax.TemplatesHandler.getSystemId()
     * Get the base ID (URI or system ID) from where relative URLs will be
     * resolved.
     * @return The systemID that was set with setSystemId(String id)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    protected TemplatesHandlerImpl(int indentNumber,
        TransformerFactoryImpl tfactory)

    /**
     * Default constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private TemplatesImpl _templates = null;

    /**
     * The created Templates object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private Parser _parser = null;

    /**
     * A reference to XSLTC's parser object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private TransformerFactoryImpl _tfactory = null;

    /**
     * A reference to the transformer factory that this templates
     * object belongs to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private URIResolver _uriResolver = null;

    /**
     * This URIResolver is passed to all Transformers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private int _indentNumber;

    /**
     * Number of spaces to add for output indentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
    private String _systemId;

    /**
     * System ID for this stylesheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/TemplatesHandlerImpl.java
public class TemplatesHandlerImpl

/**
 * Implementation of a JAXP1.1 TemplatesHandler
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
