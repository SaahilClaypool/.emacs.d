_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void addUniqueAttribute(String qName, String value, int flags)

    /**
     * Add a unique attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    private void resetToSAXHandler()

    /**
     * Reset all of the fields owned by ToSAXHandler class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public boolean reset()

    /**
     * Try's to reset the super class and reset this class for
     * re-use, so that you don't need to create a new serializer
     * (mostly for performance reasons).
     *
     * @return true if the class was successfuly reset.
     * @see Serializer#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void warning(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#warning(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void error(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#error(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void fatalError(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#fatalError(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void characters(org.w3c.dom.Node node)

    /**
     * This method gets the node's value as a String and uses that String as if
     * it were an input character notification.
     * @param node the Node to serialize
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startElement(String qName) throws SAXException {

    /**
     * An element starts, but attributes are not fully known yet.
     *
     * @param qName the element name, with prefix (if any).

     * @see ExtendedContentHandler#startElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startElement(String uri, String localName, String qName)

    /**
     * Receives notification that an element starts, but attributes are not
     * fully known yet.
     *
     * @param uri the URI of the namespace of the element (optional)
     * @param localName the element name, but without prefix (optional)
     * @param qName the element name, with prefix, if any (required)
     *
     * @see ExtendedContentHandler#startElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setTransformState(TransformStateSetter ts) {

    /**
     * Pass in a reference to a TransformState object, which
     * can be used during SAX ContentHandler events to obtain
     * information about he state of the transformation. This
     * method will be called  before each startDocument event.
     *
     * @param ts A reference to a TransformState object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void flushPending() throws SAXException

    /**
     * This method flushes any pending events, which can be startDocument()
     * closing the opening tag of an element, or closing an open CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    boolean getShouldOutputNSAttr()

    /**
     * Returns true if namespace declarations from calls such as
     * startPrefixMapping("prefix1","uri1") should
     * also be mirrored with self generated additional attributes of elements
     * that declare the namespace, for example the attribute xmlns:prefix1="uri1"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setShouldOutputNSAttr(boolean doOutputNSAttr)

    /** Set whether or not namespace declarations (e.g.
     * xmlns:foo) should appear as attributes of
     * elements
     * @param doOutputNSAttr whether or not namespace declarations
     * should appear as attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setCdataSectionElements(Vector URI_and_localNames)

    /**
     * Does nothing. The setting of CDATA section elements has an impact on
     * stream serializers.
     * @see SerializationHandler#setCdataSectionElements(java.util.Vector)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setContentHandler(ContentHandler _saxHandler)

    /**
     * Sets the SAX ContentHandler.
     * @param _saxHandler The ContentHandler to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setLexHandler(LexicalHandler _lexHandler)

    /**
     * Sets the LexicalHandler.
     * @param _lexHandler The LexicalHandler to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startElement(
        String arg0,
        String arg1,
        String arg2,
        Attributes arg3)

    /**
     * Receive notification of the beginning of an element, although this is a
     * SAX method additional namespace or attribute information can occur before
     * or after this call, that is associated with this element.
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startElement
     * @see org.xml.sax.ContentHandler#endElement
     * @see org.xml.sax.AttributeList
     *
     * @throws org.xml.sax.SAXException
     *
     * @see org.xml.sax.ContentHandler#startElement(String,String,String,Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void processingInstruction(String target, String data)

    /**
     * Do nothing as this is an abstract class. All subclasses will need to
     * define their behavior if it is different.
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void comment(String comment) throws SAXException

    /**
     * Receive notification of a comment.
     *
     * @see ExtendedLexicalHandler#comment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void characters(String characters) throws SAXException

    /**
     * Receive notification of character data.
     *
     * @param characters The string of characters to process.
     *
     * @throws org.xml.sax.SAXException
     *
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startDTD(String arg0, String arg1, String arg2)

    /**
     * Do nothing.
     * @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected void startDocumentInternal() throws SAXException

    /**
     * Pass callback to the SAX Handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected TransformStateSetter m_state = null;

    /** If this is true, then the content handler wrapped by this
     * serializer implements the TransformState interface which
     * will give the content handler access to the state of
     * the transform. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    private boolean m_shouldGenerateNSAttribute = true;

    /**
     * A startPrefixMapping() call on a ToSAXHandler will pass that call
     * on to the wrapped ContentHandler, but should we also mirror these calls
     * with matching attributes, if so this field is true.
     * For example if this field is true then a call such as
     * startPrefixMapping("prefix1","uri1") will also cause the additional
     * internally generated attribute xmlns:prefix1="uri1" to be effectively added
     * to the attributes passed to the wrapped ContentHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected LexicalHandler m_lexHandler;

    /**
     * Underlying LexicalHandler. Taken from XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected ContentHandler m_saxHandler;

    /**
     * Underlying SAX handler. Taken from XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
public abstract class ToSAXHandler extends SerializerBase

/**
 * This class is used to provide a base behavior to be inherited
 * by other To...SAXHandler serializers.
 *
 * This class is not a public API.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void addUniqueAttribute(String qName, String value, int flags)

    /**
     * Add a unique attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    private void resetToSAXHandler()

    /**
     * Reset all of the fields owned by ToSAXHandler class
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public boolean reset()

    /**
     * Try's to reset the super class and reset this class for
     * re-use, so that you don't need to create a new serializer
     * (mostly for performance reasons).
     *
     * @return true if the class was successfuly reset.
     * @see Serializer#reset()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void warning(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#warning(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void error(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#error(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void fatalError(SAXParseException exc) throws SAXException {

    /**
     * @see org.xml.sax.ErrorHandler#fatalError(SAXParseException)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void characters(org.w3c.dom.Node node)

    /**
     * This method gets the node's value as a String and uses that String as if
     * it were an input character notification.
     * @param node the Node to serialize
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startElement(String qName) throws SAXException {

    /**
     * An element starts, but attributes are not fully known yet.
     *
     * @param qName the element name, with prefix (if any).

     * @see ExtendedContentHandler#startElement(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startElement(String uri, String localName, String qName)

    /**
     * Receives notification that an element starts, but attributes are not
     * fully known yet.
     *
     * @param uri the URI of the namespace of the element (optional)
     * @param localName the element name, but without prefix (optional)
     * @param qName the element name, with prefix, if any (required)
     *
     * @see ExtendedContentHandler#startElement(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setTransformState(TransformStateSetter ts) {

    /**
     * Pass in a reference to a TransformState object, which
     * can be used during SAX ContentHandler events to obtain
     * information about he state of the transformation. This
     * method will be called  before each startDocument event.
     *
     * @param ts A reference to a TransformState object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void flushPending() throws SAXException

    /**
     * This method flushes any pending events, which can be startDocument()
     * closing the opening tag of an element, or closing an open CDATA section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    boolean getShouldOutputNSAttr()

    /**
     * Returns true if namespace declarations from calls such as
     * startPrefixMapping("prefix1","uri1") should
     * also be mirrored with self generated additional attributes of elements
     * that declare the namespace, for example the attribute xmlns:prefix1="uri1"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setShouldOutputNSAttr(boolean doOutputNSAttr)

    /** Set whether or not namespace declarations (e.g.
     * xmlns:foo) should appear as attributes of
     * elements
     * @param doOutputNSAttr whether or not namespace declarations
     * should appear as attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setCdataSectionElements(Vector URI_and_localNames)

    /**
     * Does nothing. The setting of CDATA section elements has an impact on
     * stream serializers.
     * @see SerializationHandler#setCdataSectionElements(java.util.Vector)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setContentHandler(ContentHandler _saxHandler)

    /**
     * Sets the SAX ContentHandler.
     * @param _saxHandler The ContentHandler to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void setLexHandler(LexicalHandler _lexHandler)

    /**
     * Sets the LexicalHandler.
     * @param _lexHandler The LexicalHandler to set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startElement(
        String arg0,
        String arg1,
        String arg2,
        Attributes arg3)

    /**
     * Receive notification of the beginning of an element, although this is a
     * SAX method additional namespace or attribute information can occur before
     * or after this call, that is associated with this element.
     *
     * @throws org.xml.sax.SAXException Any SAX exception, possibly
     *            wrapping another exception.
     * @see org.xml.sax.ContentHandler#startElement
     * @see org.xml.sax.ContentHandler#endElement
     * @see org.xml.sax.AttributeList
     *
     * @throws org.xml.sax.SAXException
     *
     * @see org.xml.sax.ContentHandler#startElement(String,String,String,Attributes)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void processingInstruction(String target, String data)

    /**
     * Do nothing as this is an abstract class. All subclasses will need to
     * define their behavior if it is different.
     * @see org.xml.sax.ContentHandler#processingInstruction(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void comment(String comment) throws SAXException

    /**
     * Receive notification of a comment.
     *
     * @see ExtendedLexicalHandler#comment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void characters(String characters) throws SAXException

    /**
     * Receive notification of character data.
     *
     * @param characters The string of characters to process.
     *
     * @throws org.xml.sax.SAXException
     *
     * @see ExtendedContentHandler#characters(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    public void startDTD(String arg0, String arg1, String arg2)

    /**
     * Do nothing.
     * @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected void startDocumentInternal() throws SAXException

    /**
     * Pass callback to the SAX Handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected TransformStateSetter m_state = null;

    /** If this is true, then the content handler wrapped by this
     * serializer implements the TransformState interface which
     * will give the content handler access to the state of
     * the transform. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    private boolean m_shouldGenerateNSAttribute = true;

    /**
     * A startPrefixMapping() call on a ToSAXHandler will pass that call
     * on to the wrapped ContentHandler, but should we also mirror these calls
     * with matching attributes, if so this field is true.
     * For example if this field is true then a call such as
     * startPrefixMapping("prefix1","uri1") will also cause the additional
     * internally generated attribute xmlns:prefix1="uri1" to be effectively added
     * to the attributes passed to the wrapped ContentHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected LexicalHandler m_lexHandler;

    /**
     * Underlying LexicalHandler. Taken from XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
    protected ContentHandler m_saxHandler;

    /**
     * Underlying SAX handler. Taken from XSLTC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/ToSAXHandler.java
public abstract class ToSAXHandler extends SerializerBase

/**
 * This class is used to provide a base behavior to be inherited
 * by other To...SAXHandler serializers.
 *
 * This class is not a public API.
 *
 * @xsl.usage internal
 */
