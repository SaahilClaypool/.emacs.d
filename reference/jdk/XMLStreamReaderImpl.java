_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected PropertyManager getPropertyManager(){

    /**
     * @return returns the reference to property manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespaceURI(String prefix) {

    /** Return the uri for the given prefix.
     * The uri returned depends on the current state of the processor.
     *
     * <p><strong>NOTE:</strong>The 'xml' prefix is bound as defined in
     * <a href="http://www.w3.org/TR/REC-xml-names/#ns-using">Namespaces in XML</a>
     * specification to "http://www.w3.org/XML/1998/namespace".
     *
     * <p><strong>NOTE:</strong> The 'xmlns' prefix must be resolved to following namespace
     * <a href="http://www.w3.org/2000/xmlns/">http://www.w3.org/2000/xmlns/</a>
     * @return the uri bound to the given prefix or null if it is not bound
     * @param prefix The prefix to lookup, may not be null
     * @throws IllegalStateException - if the prefix is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public javax.xml.namespace.QName convertXNIQNametoJavaxQName(com.sun.org.apache.xerces.internal.xni.QName qname){

    /**
     * @param qname
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean standaloneSet() {

    /** Checks if standalone was set in the document
     * @return true if standalone was set in the document, or false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int nextTag() throws XMLStreamException {

    /** Skips any insignificant events (COMMENT and PROCESSING_INSTRUCTION)
     * until a START_ELEMENT or
     * END_ELEMENT is reached. If other than space characters are
     * encountered, an exception is thrown. This method should
     * be used when processing element-only content because
     * the parser is not able to recognize ignorable whitespace if
     * then DTD is missing or not interpreted.
     * @return the event type of the element read
     * @throws XMLStreamException if the current event is not white space
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isCharacters() {

    /** Returns true if the cursor points to a character data event
     * @return true if the cursor points to character data, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isAttributeSpecified(int index) {

    /** Returns a boolean which indicates if this
     * attribute was created by default
     * @param index the position of the attribute
     * @return true if this is a default attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasText() {

    /** Return true if the current event has text, false otherwise
     * The following events have text:
     * CHARACTERS,DTD ,ENTITY_REFERENCE, COMMENT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getTextCharacters(int sourceStart, char[] target, int targetStart, int length) throws XMLStreamException {

    /** Gets the the text associated with a CHARACTERS, SPACE or CDATA event.
     * Text starting a "sourceStart" is copied into "destination" starting at "targetStart".
     * Up to "length" characters are copied.  The number of characters actually copied is returned.
     *
     * The "sourceStart" argument must be greater or equal to 0 and less than or equal to
     * the number of characters associated with the event.  Usually, one requests text starting at a "sourceStart" of 0.
     * If the number of characters actually copied is less than the "length", then there is no more text.
     * Otherwise, subsequent calls need to be made until all text has been retrieved. For example:
     *
     * <code>
     * int length = 1024;
     * char[] myBuffer = new char[ length ];
     *
     * for ( int sourceStart = 0 ; ; sourceStart += length )
     * {
     *    int nCopied = stream.getTextCharacters( sourceStart, myBuffer, 0, length );
     *
     *   if (nCopied < length)
     *       break;
     * }
     * </code>
     * XMLStreamException may be thrown if there are any XML errors in the underlying source.
     * The "targetStart" argument must be greater than or equal to 0 and less than the length of "target",
     * Length must be greater than 0 and "targetStart + length" must be less than or equal to length of "target".
     *
     * @param sourceStart the index of the first character in the source array to copy
     * @param target the destination array
     * @param targetStart the start offset in the target array
     * @param length the number of characters to copy
     * @return the number of characters actually copied
     * @throws XMLStreamException if the underlying XML source is not well-formed
     * @throws IndexOutOfBoundsException if targetStart < 0 or > than the length of target
     * @throws IndexOutOfBoundwhile(isCharacters()) ;sException if length < 0 or targetStart + length > length of target
     * @throws UnsupportedOperationException if this method is not supported
     * @throws NullPointerException is if target is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void require(int type, String namespaceURI, String localName) throws XMLStreamException {

    /** Test if the current event is of the given type and if the namespace and name match the current namespace and name of the current event.
     * If the namespaceURI is null it is not checked for equality, if the localName is null it is not checked for equality.
     * @param type the event type
     * @param namespaceURI the uri of the event, may be null
     * @param localName the localName of the event, may be null
     * @throws XMLStreamException if the required values are not matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getText() {

    /** Returns the current value of the parse event as a string,
     * this returns the string value of a CHARACTERS event,
     * returns the value of a COMMENT, the replacement value
     * for an ENTITY_REFERENCE,
     * or the String value of the DTD
     * @return the current text or null
     * @throws java.lang.IllegalStateException if this state is not
     * a valid text state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public Object getProperty(java.lang.String name) throws java.lang.IllegalArgumentException {

    /** Get the value of a feature/property from the underlying implementation
     * @param name The name of the property, may not be null
     * @return The value of the property
     * @throws IllegalArgumentException if name is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespaceURI(int index) {

    /** Returns the uri for the namespace declared at the
     * index.
     *
     * @param index the position of the namespace declaration
     * @return returns the namespace uri
     * @throws IllegalStateException if this is not a START_ELEMENT, END_ELEMENT or NAMESPACE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespacePrefix(int index) {

    /** Returns the prefix for the namespace declared at the
     * index.  Returns null if this is the default namespace
     * declaration
     *
     * @param index the position of the namespace declaration
     * @return returns the namespace prefix
     * @throws IllegalStateException if this is not a START_ELEMENT, END_ELEMENT or NAMESPACE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getNamespaceCount() {

    /** Returns the count of namespaces declared on this START_ELEMENT or END_ELEMENT,
     * this method is only valid on a START_ELEMENT, END_ELEMENT or NAMESPACE. On
     * an END_ELEMENT the count is of the namespaces that are about to go
     * out of scope.  This is the equivalent of the information reported
     * by SAX callback for an end element event.
     * @return returns the number of namespace declarations on this specific element
     * @throws IllegalStateException if this is not a START_ELEMENT, END_ELEMENT or NAMESPACE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public NamespaceContext getNamespaceContext() {

    /** Returns a read only namespace context for the current
     * position.  The context is transient and only valid until
     * a call to next() changes the state of the reader.
     * @return return a namespace context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public javax.xml.namespace.QName getName() {

    /** Returns a QName for the current START_ELEMENT or END_ELEMENT event
     * @return the QName for the current START_ELEMENT or END_ELEMENT event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public Location getLocation() {

    /** Return the current location of the processor.
     * If the Location is unknown the processor should return
     * an implementation of Location that returns -1 for the
     * location and null for the publicId and systemId.
     * The location information is only valid until next() is
     * called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getElementText() throws XMLStreamException {

    /** Reads the content of a text-only element. Precondition:
     * the current event is START_ELEMENT. Postcondition:
     * The current event is the corresponding END_ELEMENT.
     * @throws XMLStreamException if the current event is not a START_ELEMENT or if
     * a non text element is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeValue(String namespaceURI, String localName) {

    /**
     * @param namespaceURI
     * @param localName
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeValue(int index) {

    /** Returns the value of the attribute at the
     * index
     * @param index the position of the attribute
     * @return the attribute value
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeType(int index) {

    /** Returns the XML type of the attribute at the provided
     * index
     * @param index the position of the attribute
     * @return the XML type of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public javax.xml.namespace.QName getAttributeQName(int index) {

    /** Returns the qname of the attribute at the provided index
     *
     * @param index the position of the attribute
     * @return the QName of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributePrefix(int index) {

    /** Returns the prefix of this attribute at the
     * provided index
     * @param index the position of the attribute
     * @return the prefix of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeNamespace(int index) {

    /** Returns the namespace of the attribute at the provided
     * index
     * @param index the position of the attribute
     * @return the namespace URI (can be null)
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeLocalName(int index) {

    /**
     * @param index
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public QName getAttributeName(int index) {

    /** Returns the localName of the attribute at the provided
     * index
     * @param index the position of the attribute
     * @return the localName of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getAttributeCount() {

    /** Returns the count of attributes on this START_ELEMENT,
     * this method is only valid on a START_ELEMENT or ATTRIBUTE.  This
     * count excludes namespace definitions.  Attribute indices are
     * zero-based.
     * @return returns the number of attributes
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int next() throws XMLStreamException {

    /**
     * @throws XMLStreamException
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isWhiteSpace() {

    /**
     *  Returns true if the cursor points to a character data event that consists of all whitespace
     *  Application calling this method needs to cache the value and avoid calling this method again
     *  for the same event.
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isStartElement() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isStandalone() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isEndElement() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasValue() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasNext() throws XMLStreamException {

    /**
     * @throws XMLStreamException
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasName() {

    /** this Funtion returns true if the current event has name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasAttributes() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getVersion() {

    /** Get the XML language version of the current document being parsed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getValue() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getTextStart() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getTextLength() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public char[] getTextCharacters() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getPrefix() {

    /**
    * @return the prefix of the current event, or null if the event does
    * not have a prefix. For START_ELEMENT and END_ELEMENT, return
    * XMLConstants.DEFAULT_NS_PREFIX when no prefix is available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getPITarget() {

    /** Get the target of a processing instruction
     * @return the target or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getPIData() {

    /** Get the data section of a processing instruction
     * @return the data or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespaceURI() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getLineNumber() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getEventType() {

    /** Returns the current value of the parse event as a string, this returns the string value of a CHARACTERS event, returns the value of a COMMENT, the replacement value for an ENTITY_REFERENCE, the string value of a CDATA section, the string value for a SPACE event, or the String value of the internal subset of the DTD. If an ENTITY_REFERENCE has been resolved, any character data will be reported as CHARACTERS events.
     * @return the current text or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getEncoding() {

    /** Return input encoding if known or null if unknown.
     * @return the encoding of this instance or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getColumnNumber() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getCharacterEncodingScheme() {

    /** Returns the character encoding declared on the xml declaration Returns null if none was declared
     * @return the encoding declared in the document or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void close() throws XMLStreamException {

    /** Frees any resources associated with this Reader. This method does not close the underlying input source.
     * @throws XMLStreamException if there are errors freeing associated resources
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void reset(){

    /**
     * Resets this instance so that this instance is ready for reuse.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean canReuse(){

    /** This function tells if this instances is available for reuse.
     * One must call reset() and setInputSource() to be able to reuse
     * this instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void setInputSource(XMLInputSource inputSource ) throws XMLStreamException {

    /**
     * @param inputSource
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(XMLInputSource inputSource, PropertyManager props) throws  XMLStreamException {

    /**
     * @param inputSource
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(Reader reader, PropertyManager props) throws  XMLStreamException {

    /**
     * @param reader
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(InputStream inputStream, String encoding, PropertyManager props ) throws  XMLStreamException {

    /**
     * @param inputStream
     * @param encoding
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(String systemid, PropertyManager props) throws  XMLStreamException {

    /**
     * @param systemid
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(InputStream inputStream, PropertyManager props) throws  XMLStreamException {

    /**
     * @param inputStream
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    private boolean fReuse = true;

    /** more to scan */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    private int fEventType ;

    /** current event type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected XMLInputSource fInputSource = null;

    /** Input Source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected XMLEntityScanner fEntityScanner = null;

    /** Entity scanner, this alwasy works on last entity that was opened. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected XMLDocumentScannerImpl fScanner = new XMLNSDocumentScannerImpl();

    /** Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: Error Reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
public class XMLStreamReaderImpl implements javax.xml.stream.XMLStreamReader {

/** This class implements javax.xml.stream.XMLStreamReader. It makes use of XML*Scanner classes to
 * derive most of its functionality. If desired, Application can reuse this instance by calling
 * reset() and setInputSource().
 *
 * @author Neeraj Bajaj Sun Microsystems,Inc.
 * @author K.Venugopal Sun Microsystems,Inc.
 * @author Sunitha Reddy Sun Microsystems,Inc.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected PropertyManager getPropertyManager(){

    /**
     * @return returns the reference to property manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespaceURI(String prefix) {

    /** Return the uri for the given prefix.
     * The uri returned depends on the current state of the processor.
     *
     * <p><strong>NOTE:</strong>The 'xml' prefix is bound as defined in
     * <a href="http://www.w3.org/TR/REC-xml-names/#ns-using">Namespaces in XML</a>
     * specification to "http://www.w3.org/XML/1998/namespace".
     *
     * <p><strong>NOTE:</strong> The 'xmlns' prefix must be resolved to following namespace
     * <a href="http://www.w3.org/2000/xmlns/">http://www.w3.org/2000/xmlns/</a>
     * @return the uri bound to the given prefix or null if it is not bound
     * @param prefix The prefix to lookup, may not be null
     * @throws IllegalStateException - if the prefix is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public javax.xml.namespace.QName convertXNIQNametoJavaxQName(com.sun.org.apache.xerces.internal.xni.QName qname){

    /**
     * @param qname
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean standaloneSet() {

    /** Checks if standalone was set in the document
     * @return true if standalone was set in the document, or false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int nextTag() throws XMLStreamException {

    /** Skips any insignificant events (COMMENT and PROCESSING_INSTRUCTION)
     * until a START_ELEMENT or
     * END_ELEMENT is reached. If other than space characters are
     * encountered, an exception is thrown. This method should
     * be used when processing element-only content because
     * the parser is not able to recognize ignorable whitespace if
     * then DTD is missing or not interpreted.
     * @return the event type of the element read
     * @throws XMLStreamException if the current event is not white space
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isCharacters() {

    /** Returns true if the cursor points to a character data event
     * @return true if the cursor points to character data, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isAttributeSpecified(int index) {

    /** Returns a boolean which indicates if this
     * attribute was created by default
     * @param index the position of the attribute
     * @return true if this is a default attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasText() {

    /** Return true if the current event has text, false otherwise
     * The following events have text:
     * CHARACTERS,DTD ,ENTITY_REFERENCE, COMMENT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getTextCharacters(int sourceStart, char[] target, int targetStart, int length) throws XMLStreamException {

    /** Gets the the text associated with a CHARACTERS, SPACE or CDATA event.
     * Text starting a "sourceStart" is copied into "destination" starting at "targetStart".
     * Up to "length" characters are copied.  The number of characters actually copied is returned.
     *
     * The "sourceStart" argument must be greater or equal to 0 and less than or equal to
     * the number of characters associated with the event.  Usually, one requests text starting at a "sourceStart" of 0.
     * If the number of characters actually copied is less than the "length", then there is no more text.
     * Otherwise, subsequent calls need to be made until all text has been retrieved. For example:
     *
     * <code>
     * int length = 1024;
     * char[] myBuffer = new char[ length ];
     *
     * for ( int sourceStart = 0 ; ; sourceStart += length )
     * {
     *    int nCopied = stream.getTextCharacters( sourceStart, myBuffer, 0, length );
     *
     *   if (nCopied < length)
     *       break;
     * }
     * </code>
     * XMLStreamException may be thrown if there are any XML errors in the underlying source.
     * The "targetStart" argument must be greater than or equal to 0 and less than the length of "target",
     * Length must be greater than 0 and "targetStart + length" must be less than or equal to length of "target".
     *
     * @param sourceStart the index of the first character in the source array to copy
     * @param target the destination array
     * @param targetStart the start offset in the target array
     * @param length the number of characters to copy
     * @return the number of characters actually copied
     * @throws XMLStreamException if the underlying XML source is not well-formed
     * @throws IndexOutOfBoundsException if targetStart < 0 or > than the length of target
     * @throws IndexOutOfBoundwhile(isCharacters()) ;sException if length < 0 or targetStart + length > length of target
     * @throws UnsupportedOperationException if this method is not supported
     * @throws NullPointerException is if target is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void require(int type, String namespaceURI, String localName) throws XMLStreamException {

    /** Test if the current event is of the given type and if the namespace and name match the current namespace and name of the current event.
     * If the namespaceURI is null it is not checked for equality, if the localName is null it is not checked for equality.
     * @param type the event type
     * @param namespaceURI the uri of the event, may be null
     * @param localName the localName of the event, may be null
     * @throws XMLStreamException if the required values are not matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getText() {

    /** Returns the current value of the parse event as a string,
     * this returns the string value of a CHARACTERS event,
     * returns the value of a COMMENT, the replacement value
     * for an ENTITY_REFERENCE,
     * or the String value of the DTD
     * @return the current text or null
     * @throws java.lang.IllegalStateException if this state is not
     * a valid text state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public Object getProperty(java.lang.String name) throws java.lang.IllegalArgumentException {

    /** Get the value of a feature/property from the underlying implementation
     * @param name The name of the property, may not be null
     * @return The value of the property
     * @throws IllegalArgumentException if name is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespaceURI(int index) {

    /** Returns the uri for the namespace declared at the
     * index.
     *
     * @param index the position of the namespace declaration
     * @return returns the namespace uri
     * @throws IllegalStateException if this is not a START_ELEMENT, END_ELEMENT or NAMESPACE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespacePrefix(int index) {

    /** Returns the prefix for the namespace declared at the
     * index.  Returns null if this is the default namespace
     * declaration
     *
     * @param index the position of the namespace declaration
     * @return returns the namespace prefix
     * @throws IllegalStateException if this is not a START_ELEMENT, END_ELEMENT or NAMESPACE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getNamespaceCount() {

    /** Returns the count of namespaces declared on this START_ELEMENT or END_ELEMENT,
     * this method is only valid on a START_ELEMENT, END_ELEMENT or NAMESPACE. On
     * an END_ELEMENT the count is of the namespaces that are about to go
     * out of scope.  This is the equivalent of the information reported
     * by SAX callback for an end element event.
     * @return returns the number of namespace declarations on this specific element
     * @throws IllegalStateException if this is not a START_ELEMENT, END_ELEMENT or NAMESPACE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public NamespaceContext getNamespaceContext() {

    /** Returns a read only namespace context for the current
     * position.  The context is transient and only valid until
     * a call to next() changes the state of the reader.
     * @return return a namespace context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public javax.xml.namespace.QName getName() {

    /** Returns a QName for the current START_ELEMENT or END_ELEMENT event
     * @return the QName for the current START_ELEMENT or END_ELEMENT event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public Location getLocation() {

    /** Return the current location of the processor.
     * If the Location is unknown the processor should return
     * an implementation of Location that returns -1 for the
     * location and null for the publicId and systemId.
     * The location information is only valid until next() is
     * called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getElementText() throws XMLStreamException {

    /** Reads the content of a text-only element. Precondition:
     * the current event is START_ELEMENT. Postcondition:
     * The current event is the corresponding END_ELEMENT.
     * @throws XMLStreamException if the current event is not a START_ELEMENT or if
     * a non text element is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeValue(String namespaceURI, String localName) {

    /**
     * @param namespaceURI
     * @param localName
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeValue(int index) {

    /** Returns the value of the attribute at the
     * index
     * @param index the position of the attribute
     * @return the attribute value
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeType(int index) {

    /** Returns the XML type of the attribute at the provided
     * index
     * @param index the position of the attribute
     * @return the XML type of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public javax.xml.namespace.QName getAttributeQName(int index) {

    /** Returns the qname of the attribute at the provided index
     *
     * @param index the position of the attribute
     * @return the QName of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributePrefix(int index) {

    /** Returns the prefix of this attribute at the
     * provided index
     * @param index the position of the attribute
     * @return the prefix of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeNamespace(int index) {

    /** Returns the namespace of the attribute at the provided
     * index
     * @param index the position of the attribute
     * @return the namespace URI (can be null)
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getAttributeLocalName(int index) {

    /**
     * @param index
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public QName getAttributeName(int index) {

    /** Returns the localName of the attribute at the provided
     * index
     * @param index the position of the attribute
     * @return the localName of the attribute
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getAttributeCount() {

    /** Returns the count of attributes on this START_ELEMENT,
     * this method is only valid on a START_ELEMENT or ATTRIBUTE.  This
     * count excludes namespace definitions.  Attribute indices are
     * zero-based.
     * @return returns the number of attributes
     * @throws IllegalStateException if this is not a START_ELEMENT or ATTRIBUTE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int next() throws XMLStreamException {

    /**
     * @throws XMLStreamException
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isWhiteSpace() {

    /**
     *  Returns true if the cursor points to a character data event that consists of all whitespace
     *  Application calling this method needs to cache the value and avoid calling this method again
     *  for the same event.
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isStartElement() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isStandalone() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean isEndElement() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasValue() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasNext() throws XMLStreamException {

    /**
     * @throws XMLStreamException
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasName() {

    /** this Funtion returns true if the current event has name */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean hasAttributes() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getVersion() {

    /** Get the XML language version of the current document being parsed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getValue() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getTextStart() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getTextLength() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public char[] getTextCharacters() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getPrefix() {

    /**
    * @return the prefix of the current event, or null if the event does
    * not have a prefix. For START_ELEMENT and END_ELEMENT, return
    * XMLConstants.DEFAULT_NS_PREFIX when no prefix is available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getPITarget() {

    /** Get the target of a processing instruction
     * @return the target or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getPIData() {

    /** Get the data section of a processing instruction
     * @return the data or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getNamespaceURI() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getLineNumber() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getEventType() {

    /** Returns the current value of the parse event as a string, this returns the string value of a CHARACTERS event, returns the value of a COMMENT, the replacement value for an ENTITY_REFERENCE, the string value of a CDATA section, the string value for a SPACE event, or the String value of the internal subset of the DTD. If an ENTITY_REFERENCE has been resolved, any character data will be reported as CHARACTERS events.
     * @return the current text or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getEncoding() {

    /** Return input encoding if known or null if unknown.
     * @return the encoding of this instance or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public int getColumnNumber() {

    /**
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public String getCharacterEncodingScheme() {

    /** Returns the character encoding declared on the xml declaration Returns null if none was declared
     * @return the encoding declared in the document or null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void close() throws XMLStreamException {

    /** Frees any resources associated with this Reader. This method does not close the underlying input source.
     * @throws XMLStreamException if there are errors freeing associated resources
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void reset(){

    /**
     * Resets this instance so that this instance is ready for reuse.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public boolean canReuse(){

    /** This function tells if this instances is available for reuse.
     * One must call reset() and setInputSource() to be able to reuse
     * this instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public void setInputSource(XMLInputSource inputSource ) throws XMLStreamException {

    /**
     * @param inputSource
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(XMLInputSource inputSource, PropertyManager props) throws  XMLStreamException {

    /**
     * @param inputSource
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(Reader reader, PropertyManager props) throws  XMLStreamException {

    /**
     * @param reader
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(InputStream inputStream, String encoding, PropertyManager props ) throws  XMLStreamException {

    /**
     * @param inputStream
     * @param encoding
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(String systemid, PropertyManager props) throws  XMLStreamException {

    /**
     * @param systemid
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    public XMLStreamReaderImpl(InputStream inputStream, PropertyManager props) throws  XMLStreamException {

    /**
     * @param inputStream
     * @param props
     * @throws XMLStreamException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    private boolean fReuse = true;

    /** more to scan */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    private int fEventType ;

    /** current event type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected XMLInputSource fInputSource = null;

    /** Input Source */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected XMLEntityScanner fEntityScanner = null;

    /** Entity scanner, this alwasy works on last entity that was opened. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected XMLDocumentScannerImpl fScanner = new XMLNSDocumentScannerImpl();

    /** Document scanner. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: Error Reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLStreamReaderImpl.java
public class XMLStreamReaderImpl implements javax.xml.stream.XMLStreamReader {

/** This class implements javax.xml.stream.XMLStreamReader. It makes use of XML*Scanner classes to
 * derive most of its functionality. If desired, Application can reuse this instance by calling
 * reset() and setInputSource().
 *
 * @author Neeraj Bajaj Sun Microsystems,Inc.
 * @author K.Venugopal Sun Microsystems,Inc.
 * @author Sunitha Reddy Sun Microsystems,Inc.
 */
